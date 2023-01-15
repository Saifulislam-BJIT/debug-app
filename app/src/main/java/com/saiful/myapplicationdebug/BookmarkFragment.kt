package com.saiful.myapplicationdebug

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class BookmarkFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bookmark, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        android.util.Log.d("TAG", "onViewCreated: Bookmark Fragment")
        Log.d("TAG", "onViewCreated: Bookmark Fragment")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG", "onPause: Bookmark Fragment")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG", "onResume: Bookmark Fragment")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("TAG", "onDestroyView: Bookmark Fragment")
    }
}