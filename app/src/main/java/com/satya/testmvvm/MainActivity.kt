package com.satya.testmvvm

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.findNavController
import com.satya.testmvvm.json.ApartmentSizeResponse
import com.satya.testmvvm.json.CompJson
import com.satya.testmvvm.network.CustomProgressLoading
import com.satya.testmvvm.network.NetworkResult
import com.satya.testmvvm.response.DataResponse
import com.satya.testmvvm.utility.Util
import com.satya.testmvvm.viewModel.DummyViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val myViewModel by viewModels<DummyViewModel>()
    private lateinit var loading: CustomProgressLoading
    private lateinit var apartmentSizeResponse: ApartmentSizeResponse

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val navController = findNavController(R.id.fragment)

        loading = CustomProgressLoading(this@MainActivity)

        getOperatorData()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        apartmentSizeResponse = CompJson.myGsonData

        Log.e("TAG", "onCreate: $apartmentSizeResponse")
    }

    private fun getOperatorData() {
        myViewModel.getProduct()

        myViewModel.getProduct.observe(this@MainActivity) {
            loading.hideProgress()
            try {
                when (it) {
                    is NetworkResult.Success -> {
                        val body = it.data as DataResponse
                        Log.e("TAG", "getOperatorData: $body")
                    }

                    is NetworkResult.Error -> {
                        val body = Util.error(it.data, DataResponse::class.java)
                        //Util.toast(requireContext(), "$body")
                    }

                    is NetworkResult.Loading -> {
                        loading.showProgress()
                    }
                }
            } catch (e: Exception) {
                Log.e("SATYA", "observer: $e")
            }

        }
    }
}