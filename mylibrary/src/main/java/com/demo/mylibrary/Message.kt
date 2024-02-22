package com.demo.mylibrary

import android.content.Context
import android.widget.Toast

class Message {
    companion object {
        fun showToastMessage(context: Context, message: String) {
            Toast.makeText(context,message,Toast.LENGTH_LONG).show()
        }
    }
}