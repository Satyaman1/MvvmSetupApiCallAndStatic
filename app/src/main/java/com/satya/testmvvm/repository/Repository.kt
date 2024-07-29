package com.satya.testmvvm.repository

import android.content.Context
import com.satya.testmvvm.network.InternetCheck
import com.satya.testmvvm.network.Service
import com.satya.testmvvm.response.DataResponse
import com.satya.testmvvm.response.LoginBody
import com.satya.testmvvm.response.LoginResponse
import com.satya.testmvvm.response.TaskTwoResponse
import com.satya.testmvvm.response.TestBody
import com.satya.testmvvm.room.Database
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import javax.inject.Inject


class Repository @Inject constructor(
    private val service: Service,
) {

    suspend fun login(model : LoginBody): Response<LoginResponse> {
        return withContext(Dispatchers.IO) {
            service.login(model)
        }
    }

    suspend fun getProductDetails(id : Int): Response<TaskTwoResponse> {
        return withContext(Dispatchers.IO) {
            service.getProductDetails(id)
        }
    }
}