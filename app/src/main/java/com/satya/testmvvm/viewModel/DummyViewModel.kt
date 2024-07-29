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

    }