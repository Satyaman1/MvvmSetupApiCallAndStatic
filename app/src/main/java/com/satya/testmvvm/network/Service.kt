package com.satya.testmvvm.network

import com.satya.testmvvm.network.Api.SERVICE
import com.satya.testmvvm.response.ServiceBody
import com.satya.testmvvm.response.ServiceModel
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface Service {

    @POST(SERVICE)
    suspend fun service(@Body model: ServiceBody): Response<ServiceModel>

}
