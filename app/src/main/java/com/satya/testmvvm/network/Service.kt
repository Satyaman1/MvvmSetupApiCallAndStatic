package com.satya.testmvvm.network

import com.satya.testmvvm.network.Api.END_POINT
import com.satya.testmvvm.response.NavigationResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Service {
    @GET(END_POINT)
    suspend fun getProducts(
        @Query("sesapi_platform") platform: Int,
        @Query("restApi") restApi: String,
        @Query("auth_token")auth:String
    ): Response<NavigationResponse>
}
