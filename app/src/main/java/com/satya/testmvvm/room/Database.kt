package com.satya.testmvvm.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.satya.testmvvm.response.DataResponse

@Database(entities = [DataResponse.Product::class], version = 1)
abstract class Database : RoomDatabase() {

    abstract fun productDao(): DAO

}