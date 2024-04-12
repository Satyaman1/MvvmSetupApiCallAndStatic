package com.satya.testmvvm.network

import com.satya.testmvvm.network.Api.COUNTRY_CODE_SELECTION
import com.satya.testmvvm.network.Api.GET_PRODUCTS
import com.satya.testmvvm.response.DataResponse
import com.satya.testmvvm.response.TestBody
import retrofit2.Response
import retrofit2.http.GET

interface Service {

    @GET(COUNTRY_CODE_SELECTION)
    suspend fun getCountryCodeList(): Response<TestBody>

    @GET(GET_PRODUCTS)
    suspend fun getProduct(): Response<DataResponse>
}
