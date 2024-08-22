package com.satya.testmvvm.repository

import com.satya.testmvvm.network.Service
import com.satya.testmvvm.response.ServiceBody
import com.satya.testmvvm.response.ServiceModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import javax.inject.Inject


class Repository @Inject constructor(
    private val service: Service,
) {

    suspend fun service(model: ServiceBody): Response<ServiceModel> {
        return withContext(Dispatchers.IO) {
            service.service(model)
        }
    }
}