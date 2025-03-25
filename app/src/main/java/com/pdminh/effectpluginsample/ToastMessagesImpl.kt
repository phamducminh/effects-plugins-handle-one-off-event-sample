package com.pdminh.effectpluginsample

import android.content.Context
import android.widget.Toast
import com.elveum.effects.annotations.HiltEffect

@HiltEffect
class ToastMessagesImpl(
    private val context: Context,
) : ToastMessages {
    override fun showToast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}