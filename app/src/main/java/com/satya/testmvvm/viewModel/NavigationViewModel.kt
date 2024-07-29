package com.satya.testmvvm.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.satya.testmvvm.network.NetworkResult
import com.satya.testmvvm.repository.Repository
import com.satya.testmvvm.utility.Util
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NavigationViewModel @Inject constructor(private val repository: Repository) :
    ViewModel() {

    val getProducts = MutableLiveData<NetworkResult<Any>>()


    fun getProduct(platform: Int, restApi: String) {
        viewModelScope.launch {
            getProducts.value = NetworkResult.Loading()
            Util.handleResponse(getProducts, repository.getProduct(platform, restApi))
        }
    }

}