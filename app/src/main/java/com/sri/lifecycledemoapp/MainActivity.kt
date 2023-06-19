package com.sri.lifecycledemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private var counter: Int =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("Demo","MainActivity onCreate called")
        setContentView(R.layout.activity_main)
    }


    override fun onStart() {
        super.onStart()
        Log.i("Demo","MainActivity onStart called")
    }

    override fun onResume() {
        Log.i("Demo","MainActivity onResume called")
        super.onResume()
    }

    override fun onPause() {
        Log.i("Demo","MainActivity onPause called")
        super.onPause()
    }

    override fun onStop() {
        Log.i("Demo","MainActivity onStop called")
        super.onStop()
    }

    override fun onDestroy() {
        Log.i("Demo","MainActivity onDestroy called")
        super.onDestroy()
    }



/**
  For incrementing the counter
 **/
    fun incrementCounter(){
        counter++
    }
}