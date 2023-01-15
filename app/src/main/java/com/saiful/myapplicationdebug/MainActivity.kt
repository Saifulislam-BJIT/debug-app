package com.saiful.myapplicationdebug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.saiful.myapplicationdebug.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.findNavController()
//        setupActionBarWithNavController(navController)

        binding.bottomMenu.setOnItemSelectedListener {
//            val navController = findNavController(R.id.nav_host_fragment)
            when(it.itemId) {
                R.id.action_bookmark -> navController.navigate(R.id.bookmarkFragment)
                R.id.action_setting -> navController.navigate(R.id.settingFragment)
                else -> navController.navigate(R.id.homeFragment)
            }
            true
        }

//        Log.d(TAG, "onCreate: ")
    }
}