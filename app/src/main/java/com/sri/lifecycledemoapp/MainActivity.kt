package com.sri.lifecycledemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private var counter: Int =0
    private lateinit var counterTextView:TextView
    private lateinit var addButton:FloatingActionButton
    private lateinit var subtractButton:FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("Demo","MainActivity onCreate called")
        setContentView(R.layout.activity_main)
        counterTextView=findViewById(R.id.counter_textview)
        addButton=findViewById(R.id.addBtn)
        subtractButton=findViewById(R.id.subtractBtn)
        addButton.setOnClickListener {
            incrementCounter()
        }
        subtractButton.setOnClickListener {
            decrementCounter()
        }


    }


    override fun onStart() {
        super.onStart()
        Log.i("Demo","MainActivity onStart called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Demo","MainActivity onRestart called")
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

    override fun onSaveInstanceState(outState: Bundle) {
        Log.i("Demo","MainActivity onSaveInstanceState called")
        outState.putInt("count",counter)
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.i("Demo","MainActivity onRestoreInstanceState called")
        counter=savedInstanceState.getInt("count")
        Log.i("Demo","MainActivity: value of counter=$counter")
        counterTextView.text=counter.toString()
        super.onRestoreInstanceState(savedInstanceState)
    }



    fun incrementCounter(){
        counter++
        counterTextView.text=counter.toString()
    }


    fun decrementCounter(){
        counter--
        counterTextView.text=counter.toString()
    }
}