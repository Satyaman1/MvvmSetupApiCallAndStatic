package com.satya.testmvvm.network

import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class AuthInterceptor @Inject constructor() : Interceptor {

    @Inject
    lateinit var tokenManager: TokenManager

    override fun intercept(chain: Interceptor.Chain): Response {

        val request = chain.request().newBuilder()

        val token = tokenManager.getToken()

        if (!token.isNullOrEmpty()) {
            request.addHeader(Api.AUTHORIZATION, "Bearer $token")
        }

        return chain.proceed(request.build())
    }
}