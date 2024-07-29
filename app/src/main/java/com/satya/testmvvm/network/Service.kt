package com.satya.testmvvm.network

import com.satya.testmvvm.network.Api.GET_PRODUCT_DETAILS
import com.satya.testmvvm.network.Api.LOGIN
import com.satya.testmvvm.response.LoginBody
import com.satya.testmvvm.response.LoginResponse
import com.satya.testmvvm.response.TaskTwoResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Query

interface Service {

    @POST(LOGIN)
    suspend fun login(@Body model: LoginBody): Response<LoginResponse>

    @POST(GET_PRODUCT_DETAILS)
    suspend fun getProductDetails(@Query("id") id: Int): Response<TaskTwoResponse>
}
