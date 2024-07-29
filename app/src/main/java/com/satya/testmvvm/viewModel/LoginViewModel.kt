package com.satya.testmvvm.viewModel

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.satya.testmvvm.network.NetworkResult
import com.satya.testmvvm.repository.Repository
import com.satya.testmvvm.response.LoginBody
import com.satya.testmvvm.response.TestBody
import com.satya.testmvvm.utility.Util
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(private val repository: Repository) :
    ViewModel() {

    val login = MutableLiveData<NetworkResult<Any>>()
    val getProductsDetails = MutableLiveData<NetworkResult<Any>>()


    fun login(model:LoginBody) {
        viewModelScope.launch {
            login.value = NetworkResult.Loading()
            Util.handleResponse(login, repository.login(model))
        }
    }

    fun getProductDetails(id:Int) {
        viewModelScope.launch {
            getProductsDetails.value = NetworkResult.Loading()
            Util.handleResponse(getProductsDetails, repository.getProductDetails(id))
        }
    }

}