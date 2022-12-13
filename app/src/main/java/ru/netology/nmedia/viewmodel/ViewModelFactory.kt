package ru.netology.nmedia.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ru.netology.nmedia.auth.AppAuth
import ru.netology.nmedia.repository.PostRepository

class ViewModelFactory(
    private val repository: PostRepository,
    private val appAuth: AppAuth,
) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T =
        when {
            modelClass.isAssignableFrom(PostViewModel::class.java) -> {
                PostViewModel(repository, appAuth)
            }
            modelClass.isAssignableFrom(AuthViewModel::class.java) -> {
                AuthViewModel(appAuth)
            }
            else -> error("Unknown ViewModel class: $modelClass")
        } as T
}