package com.satya.testmvvm.repository

import com.satya.testmvvm.network.Service
import com.satya.testmvvm.response.DataResponse
import com.satya.testmvvm.response.TestBody
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import javax.inject.Inject


class Repository @Inject constructor(private val service: Service) {

    suspend fun getCountryCodeList(): Response<TestBody> {
        return withContext(Dispatchers.IO) {
            service.getCountryCodeList()
        }
    }

    suspend fun getProduct(): Response<DataResponse> {
        return withContext(Dispatchers.IO) {
            service.getProduct()
        }
    }
}