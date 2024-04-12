package com.satya.testmvvm.viewModel

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.satya.testmvvm.network.NetworkResult
import com.satya.testmvvm.repository.Repository
import com.satya.testmvvm.response.TestBody
import com.satya.testmvvm.utility.Util
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DummyViewModel @Inject constructor(private val repository: Repository) :
    ViewModel() {

    val getCountryCodeList = MutableLiveData<NetworkResult<Any>>()
    val getProduct = MutableLiveData<NetworkResult<Any>>()


    fun getCountryCodeList() {
        viewModelScope.launch {
            getCountryCodeList.value = NetworkResult.Loading()
            Util.handleResponse(getCountryCodeList, repository.getCountryCodeList())
        }
    }

    fun getProduct() {
        viewModelScope.launch {
            getProduct.value = NetworkResult.Loading()
            Util.handleResponse(getProduct, repository.getProduct())
        }
    }
}

//TODO How to Call Api on Fragment or activity
/*

import androidx.fragment.app.viewModels
import com.satya.testmvvm.network.CustomProgressLoading


@AndroidEntryPoint
private val myViewModel by viewModels<DummyViewModel>()
private lateinit var loading: CustomProgressLoading

loading = CustomProgressLoading(requireContext())

*/
/**
 * fetching data from api and setting in adapter
 * *//*

private fun getOperatorData() {
    myViewModel.getOperatorList(
        */
/*GetOperatorBody(
            countryISO = selectedCountryData.sortName,
            mobileNo = "${selectedCountryData.phoneCode}$mobileNumber"
        ), viewLifecycleOwner*//*

    )
    myViewModel.getOperatorList.observe(viewLifecycleOwner) {
        loading.hideProgress()
       // binding.apply {
            try {
                when (it) {
                    is NetworkResult.Success -> {
                        val body = it.data as TestBody
                    }

                    is NetworkResult.Error -> {
                        val body = Util.error(it.data, TestBody::class.java)
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

   // }
}
*/
