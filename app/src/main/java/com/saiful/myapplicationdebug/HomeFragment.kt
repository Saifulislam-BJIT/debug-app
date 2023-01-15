package com.saiful.myapplicationdebug

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import com.saiful.myapplicationdebug.adapter.TabAdapter
import com.saiful.myapplicationdebug.adapter.TabAdapter.Companion.tabList
import com.saiful.myapplicationdebug.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("TAG", "onViewCreated: Home Fragment")

        val tabLayout = binding.tabLayoutHome
        val viewPage = binding.viewPager2

        val tabAdapter = TabAdapter(childFragmentManager, lifecycle)
        viewPage.adapter = tabAdapter
        TabLayoutMediator(tabLayout, viewPage) { tab, position ->
            tab.text = tabList[position].title
        }.attach()
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG", "onPause: Home Fragment")
//        val tabLayout = binding.tabLayoutHome
//        val viewPage = binding.viewPager2
//
//        val tabAdapter = TabAdapter(childFragmentManager, lifecycle)
//        viewPage.adapter = tabAdapter
//        TabLayoutMediator(tabLayout, viewPage) { tab, position ->
//            tab.text = tabList[position].title
//        }.attach()
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG", "onResume: Home Fragment")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("TAG", "onDestroyView: Home Fragment")
    }
}