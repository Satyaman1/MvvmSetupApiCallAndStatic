package com.satya.testmvvm

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.satya.testmvvm.adapter.ProductAdapter
import com.satya.testmvvm.databinding.ActivityMainBinding
import com.satya.testmvvm.network.CustomProgressLoading
import com.satya.testmvvm.network.NetworkResult
import com.satya.testmvvm.network.TokenManager
import com.satya.testmvvm.response.NavigationResponse
import com.satya.testmvvm.utility.Util
import com.satya.testmvvm.viewModel.NavigationViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val myViewModel by viewModels<NavigationViewModel>()
    private lateinit var loading: CustomProgressLoading
    private lateinit var binding: ActivityMainBinding
    private lateinit var productAdapter : ProductAdapter

    @Inject
    lateinit var tokenManager: TokenManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
       binding = DataBindingUtil.setContentView(this,R.layout.activity_main)


        loading = CustomProgressLoading(this)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        sideMenu()
        myViewModel.getProduct(1, "Sesapi")
tokenManager.saveToken("E4e1927490e7559c1720088132")
        apiCalling()

    }

    private fun apiCalling() {
        myViewModel.getProducts.observe(this) {
            loading.hideProgress()
            try {
                when (it) {
                    is NetworkResult.Success -> {
                        val body = it.data as NavigationResponse
                        Log.e("TAG", "apiCalling: $body", )
                        productAdapter.setList(body.result?.menus)
                        // productAdapter.setList(body?.data?.image)
                    }

                    is NetworkResult.Error -> {
                        val body = Util.error(it.data, NavigationResponse::class.java)
                        Util.toast(this, "$body")
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

    private fun sideMenu() {
        binding.apply {
            val navigationView = binding.navigationView.getHeaderView(0)
            val appRV = navigationView.findViewById<RecyclerView>(R.id.rv)
            setAdapter(appRV)
        }
    }

    private fun setAdapter(recyclerView: RecyclerView) {
        binding.apply {
            productAdapter = ProductAdapter(this@MainActivity,object : ProductAdapter.OnClick {
                override fun youSelected(data: NavigationResponse.Result.Menu) {
                    Log.e("TAG", "youSelected==>: $data", )
                }
            })

            recyclerView.adapter = productAdapter
        }
    }
}