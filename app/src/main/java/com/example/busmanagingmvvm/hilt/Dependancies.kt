package com.example.busmanagingmvvm.hilt

import android.content.Context
import com.example.busmanagingmvvm.R
import com.example.busmanagingmvvm.data.remotes.APIInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object Dependencies{
        @Provides
        @Singleton
        fun getRetrofit(BaseUrl: String): Retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://dummyapi.io/data/v1/user/")
                .build()

        @Provides
        @Singleton
        fun getApiCommunicator(retrofit: Retrofit): APIInterface = retrofit.create(APIInterface::class.java)

        @Provides
        @Singleton
        fun BaseURL(context: Context): String = context.getString(R.string.url)

}