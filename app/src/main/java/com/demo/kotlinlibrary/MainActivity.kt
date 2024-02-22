package com.demo.kotlinlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.demo.mylibrary.Message.Companion.showToastMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showToastMessage(this, "Data")
    }
}