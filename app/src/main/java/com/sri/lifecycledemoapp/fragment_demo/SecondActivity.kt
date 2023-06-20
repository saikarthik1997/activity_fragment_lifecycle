package com.sri.lifecycledemoapp.fragment_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.sri.lifecycledemoapp.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("Demo","SecondActivity onCreate called")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
    override fun onStart() {
        super.onStart()
        Log.i("Demo","SecondActivity onStart called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Demo","SecondActivity onRestart called")
    }

    override fun onResume() {
        Log.i("Demo","SecondActivity onResume called")
        super.onResume()
    }

    override fun onPause() {
        Log.i("Demo","SecondActivity onPause called")
        super.onPause()
    }

    override fun onStop() {
        Log.i("Demo","SecondActivity onStop called")
        super.onStop()
    }

    override fun onDestroy() {
        Log.i("Demo","SecondActivity onDestroy called")
        super.onDestroy()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.i("Demo","SecondActivity onSaveInstanceState called")
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.i("Demo","SecondActivity onRestoreInstanceState called")
    }
}