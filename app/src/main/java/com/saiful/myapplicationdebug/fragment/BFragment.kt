package com.saiful.myapplicationdebug.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.saiful.myapplicationdebug.R


class BFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("TAG", "onViewCreated: B Fragment")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG", "onPause: B Fragment")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG", "onResume: B Fragment")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("TAG", "onDestroyView: B Fragment")
    }

    override fun onStart() {
        super.onStart()
        Log.d("TAG", "onStart: B Fragment")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG", "onStop: B Fragment")
    }
}