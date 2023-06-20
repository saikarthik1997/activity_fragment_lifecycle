package com.sri.lifecycledemoapp.fragment_demo

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sri.lifecycledemoapp.R


class DemoFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("Demo","DemoFragment onCreate called")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("Demo","DemoFragment onCreateView called")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_demo, container, false)

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.i("Demo","DemoFragment onViewCreated called")
        super.onViewCreated(view, savedInstanceState)
        // Fragment's onViewCreated logic
    }

    override fun onStart() {
        Log.i("Demo","DemoFragment onStart called")
        super.onStart()
        // Fragment's onStart logic
    }

    override fun onResume() {
        Log.i("Demo","DemoFragment onResume called")
        super.onResume()
        // Fragment's onResume logic
    }

    override fun onPause() {
        Log.i("Demo","DemoFragment onPause called")
        super.onPause()
        // Fragment's onPause logic
    }

    override fun onStop() {
        Log.i("Demo","DemoFragment onStop called")
        super.onStop()
        // Fragment's onStop logic
    }

    override fun onDestroyView() {
        Log.i("Demo","DemoFragment onDestroyView called")
        super.onDestroyView()
        // Fragment's onDestroyView logic
    }
    override fun onDestroy() {
        Log.i("Demo","DemoFragment onDestroy called")
        super.onDestroy()
        // Fragment's onDestroy logic
    }

    override fun onDetach() {
        Log.i("Demo","DemoFragment onDetach called")
        super.onDetach()
        // Fragment's onDetach logic
    }
}