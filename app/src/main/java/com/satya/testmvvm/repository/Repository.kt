package com.satya.testmvvm.repository

import com.satya.testmvvm.network.Service
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import javax.inject.Inject


class Repository @Inject constructor(
    private val service: Service,
) {
}