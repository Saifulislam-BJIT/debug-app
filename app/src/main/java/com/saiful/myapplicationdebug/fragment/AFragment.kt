package com.saiful.myapplicationdebug.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.saiful.myapplicationdebug.R


class AFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false)
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG", "onPause: A Fragment")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG", "onResume: A Fragment")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("TAG", "onDestroyView: A Fragment")
    }
}