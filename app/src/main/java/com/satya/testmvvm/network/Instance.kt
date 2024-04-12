package com.satya.testmvvm.network

import android.content.Context
import androidx.room.Room
import com.satya.testmvvm.room.Database
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class Instance {

    @Singleton
    @Provides
    fun providesRetrofit(): Retrofit.Builder {
        return Retrofit.Builder().baseUrl(Api.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
    }

    @Singleton
    @Provides
    fun provideOkHttpClient(interceptor: AuthInterceptor): OkHttpClient {
        var loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return OkHttpClient.Builder()
            .readTimeout(5, TimeUnit.MINUTES)
            .writeTimeout(5, TimeUnit.MINUTES)
            .connectTimeout(5, TimeUnit.MINUTES)
            .addInterceptor(interceptor)
            .addInterceptor(loggingInterceptor)
            .build()
    }

    @Singleton
    @Provides
    fun getInstance(
        retrofitBuilder: Retrofit.Builder,
        okHttpClient: OkHttpClient? = null
    ): Service {
        return retrofitBuilder.client(okHttpClient).build()
            .create(Service::class.java)
    }

    @Singleton
    @Provides
    fun getDatabase(@ApplicationContext app: Context): com.satya.testmvvm.room.Database {
        var INSTANCE: com.satya.testmvvm.room.Database? = null
        if (INSTANCE == null) {
            synchronized(this) {
                INSTANCE =
                    Room.databaseBuilder(
                        context = app,
                        com.satya.testmvvm.room.Database::class.java,
                        "ProductDetails"
                    )
                        .build()
            }
        }
        return INSTANCE!!
    }

    @Singleton
    @Provides
    fun provideYourDao(db: Database) = db.productDao()
}