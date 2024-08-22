package com.satya.testmvvm.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.satya.testmvvm.network.NetworkResult
import com.satya.testmvvm.repository.Repository
import com.satya.testmvvm.response.ServiceBody
import com.satya.testmvvm.utility.Util
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ServiceViewModel @Inject constructor(private val repository: Repository) : ViewModel() {

    val service = MutableLiveData<NetworkResult<Any>>()

    fun service(model: ServiceBody) {
        viewModelScope.launch {
            service.value = NetworkResult.Loading()
            Util.handleResponse(service, repository.service(model))
        }
    }

}