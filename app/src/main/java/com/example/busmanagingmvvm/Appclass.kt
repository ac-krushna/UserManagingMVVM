package com.example.busmanagingmvvm

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Singleton

@HiltAndroidApp
@Module
@InstallIn(ActivityComponent::class)
class Appclass:Application() {
    companion object  var context:Context?=null
    override fun onCreate() {
        super.onCreate()
        context=applicationContext
    }
    @Provides
    @Singleton
    fun myApplicationConstant():Context=context!!
}