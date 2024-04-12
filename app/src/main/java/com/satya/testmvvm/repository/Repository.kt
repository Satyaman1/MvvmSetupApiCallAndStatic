package com.satya.testmvvm.repository

import android.content.Context
import com.satya.testmvvm.network.InternetCheck
import com.satya.testmvvm.network.Service
import com.satya.testmvvm.response.DataResponse
import com.satya.testmvvm.response.TestBody
import com.satya.testmvvm.room.Database
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import javax.inject.Inject


class Repository @Inject constructor(
    private val service: Service,
    private val productDatabase: Database,
) {

    suspend fun getCountryCodeList(): Response<TestBody> {
        return withContext(Dispatchers.IO) {
            service.getCountryCodeList()
        }
    }

    suspend fun getProduct(): Response<DataResponse> {
        return withContext(Dispatchers.IO) {
            /*if (InternetCheck.isInternetAvailable(context)){

            }else{

            }*/
            productDatabase.productDao()
                .addProducts(service.getProduct().body()!!.products as List<DataResponse.Product>)
            service.getProduct()
        }
    }
}