package com.satya.testmvvm.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.satya.testmvvm.R
import com.satya.testmvvm.adapter.ProductAdapter
import com.satya.testmvvm.databinding.FragmentSecondBinding
import com.satya.testmvvm.network.CustomProgressLoading
import com.satya.testmvvm.network.NetworkResult
import com.satya.testmvvm.response.DataResponse
import com.satya.testmvvm.utility.Util
import com.satya.testmvvm.viewModel.DummyViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding
    private val myViewModel by viewModels<DummyViewModel>()
    private lateinit var loading: CustomProgressLoading
    private lateinit var productAdapter: ProductAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_second, container, false)

        loading = CustomProgressLoading(requireActivity())

        myViewModel.getProduct()

        apiCalling()

        setAdapter()

        return binding.root
    }

    private fun setAdapter() {
        binding.apply {
            productAdapter = ProductAdapter(requireActivity(), object : ProductAdapter.OnClick {
                override fun youSelected(data: DataResponse.Product) {
                    Log.e("TAG", "youSelected: ==> $data")
                }
            })

            dummyRV.adapter = productAdapter
        }
    }

    private fun apiCalling() {
        myViewModel.getProduct.observe(requireActivity()) {
            loading.hideProgress()
            try {
                when (it) {
                    is NetworkResult.Success -> {
                        val body = it.data as DataResponse
                        productAdapter.setList(body.products)
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