package com.pdminh.effectpluginsample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val toastMessages: ToastMessages,
) : ViewModel() {

    fun doSomething() {
        viewModelScope.launch {
            try {
                // execute async operation here
            } catch (e: CustomException) {
                // initiate a one-off event
                toastMessages.showToast(e.localizedMessage)
            }
        }
    }
}