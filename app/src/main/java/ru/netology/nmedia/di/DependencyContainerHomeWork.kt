package ru.netology.nmedia.di

import android.content.Context
import com.google.android.gms.common.GoogleApiAvailability

class DependencyContainerHomeWork (
    private val context: Context) {

    companion object{

        @Volatile
        private val instance: DependencyContainerHomeWork? = null

        fun initApp(context: Context){
            instance = DependencyContainerHomeWork(context)
        }

        fun getInstance(): DependencyContainerHomeWork {
            return instance ?: synchronized(this){
                instance ?: DependencyContainerHomeWork().also { instance = it }
            }
        }
    }

    private val googleApiAvailability = GoogleApiAvailability.getInstance()
}