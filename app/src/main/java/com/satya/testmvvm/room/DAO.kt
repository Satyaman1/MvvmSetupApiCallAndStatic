package com.satya.testmvvm.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.satya.testmvvm.response.DataResponse

@Dao
interface DAO {

    @Insert
    suspend fun addProducts(product: List<DataResponse.Product>)

    /* @Query("SELECT * FROM ProductDetails")
     suspend fun getProducts(): List<DataResponse.Product>*/
}