package com.sri.lifecycledemoapp.fragment_demo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sri.lifecycledemoapp.R


class DemoFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_demo, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Fragment's onViewCreated logic
    }

    override fun onStart() {
        super.onStart()
        // Fragment's onStart logic
    }

    override fun onResume() {
        super.onResume()
        // Fragment's onResume logic
    }

    override fun onPause() {
        super.onPause()
        // Fragment's onPause logic
    }

    override fun onStop() {
        super.onStop()
        // Fragment's onStop logic
    }

    override fun onDestroyView() {
        super.onDestroyView()
        // Fragment's onDestroyView logic
    }
    override fun onDestroy() {
        super.onDestroy()
        // Fragment's onDestroy logic
    }

    override fun onDetach() {
        super.onDetach()
        // Fragment's onDetach logic
    }
}