package com.sri.lifecycledemoapp.fragment_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sri.lifecycledemoapp.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
}