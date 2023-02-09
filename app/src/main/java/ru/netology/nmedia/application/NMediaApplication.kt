package ru.netology.nmedia.application

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import ru.netology.nmedia.di.DependencyContainerHomeWork

@HiltAndroidApp
class NMediaApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        DependencyContainerHomeWork.initApp(this)
    }
}