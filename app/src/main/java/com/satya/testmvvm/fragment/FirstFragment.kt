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
import com.satya.testmvvm.adapter.ServiceParentAdapter
import com.satya.testmvvm.databinding.FragmentFirstBinding
import com.satya.testmvvm.network.CustomProgressLoading
import com.satya.testmvvm.network.NetworkResult
import com.satya.testmvvm.network.TokenManager
import com.satya.testmvvm.response.ServiceBody
import com.satya.testmvvm.response.ServiceModel
import com.satya.testmvvm.utility.Util
import com.satya.testmvvm.viewModel.ServiceViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    private val myViewModel by viewModels<ServiceViewModel>()
    private lateinit var loading: CustomProgressLoading
    private lateinit var serviceAdapter: ServiceParentAdapter
    private lateinit var productAdapter: ProductAdapter
    private var totalAmount = 0.0
    private var selectedService = 0

    @Inject
    lateinit var tokenManager: TokenManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_first, container, false)

        loading = CustomProgressLoading(requireActivity())

        serviceData()

        setAdapter()

        serviceAdapter()

        binding.priceLLC.visibility = View.INVISIBLE

        return binding.root
    }

    private fun serviceData() {

        val model = ServiceBody()
        model.offerId = "64f19efe75c0073544cab634"
        model.partnerId = "63886eafd7390b28d46c9bee"

        myViewModel.service(model)
        myViewModel.service.observe(viewLifecycleOwner) {
            loading.hideProgress()
            binding.apply {
                try {
                    when (it) {
                        is NetworkResult.Success -> {
                            val body = it.data as ServiceModel
                            productAdapter.setList(body.data)
                            serviceAdapter.apply {
                                setList(body.data)
                            }
                            priceLLC.visibility = View.VISIBLE
                        }

                        is NetworkResult.Error -> {
                            val body = Util.error(it.data, ServiceModel::class.java)
                            Util.toast(requireContext(), "$body")
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

    private fun setAdapter() {
        binding.apply {
            serviceAdapter =
                ServiceParentAdapter(requireActivity(),
                    object : ServiceParentAdapter.DegreeInterface {
                        override fun sendClick(data: ServiceModel.Data.SubService, position: Int) {
                            if (data.isSelected == true) {
                                totalAmount -= data.price.toDouble()
                                if (selectedService > 0) {
                                    selectedService--
                                }
                                data.isSelected = false
                            } else {
                                totalAmount += data.price.toDouble()
                                selectedService++
                                data.isSelected = true
                            }
                            amountTV.text =
                                "Services(${selectedService})\n${resources.getString(R.string.rs)}$totalAmount"
                            Log.e(
                                "MAX",
                                "sendClick:$selectedService $totalAmount ${data.isSelected} ${data.price}"
                            )
                        }
                    })
            serviceTypeRV.adapter = serviceAdapter
        }
    }

    private fun serviceAdapter() {
        binding.apply {
            productAdapter = ProductAdapter(requireActivity(), object : ProductAdapter.OnClick {
                override fun youSelected(data: ServiceModel.Data) {
                    Log.e("MY_CLICK", "youSelected: $data")
                }
            })

            serviceRV.adapter = productAdapter
        }
    }
}