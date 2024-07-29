package com.satya.testmvvm.repository

import com.satya.testmvvm.network.Service
import com.satya.testmvvm.response.NavigationResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import javax.inject.Inject


class Repository @Inject constructor(
    private val service: Service,
) {

    suspend fun getProduct(platform: Int, restApi: String): Response<NavigationResponse> {
        return withContext(Dispatchers.IO) {
            service.getProducts(platform, restApi)
        }
    }
}