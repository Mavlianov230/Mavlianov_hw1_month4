package com.example.mavlianov_hw1_month4.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.mavlianov_hw1_month4.R
import com.example.mavlianov_hw1_month4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_Host_Fragment) as NavHostFragment

        navController = navHostFragment.navController

       // val bottomNavigationView = findViewById<BottomNavigationView>(R.id.nav_Host_Fragment) as BottomNavigationView
       // bottomNavigationView.setupWithNavController(navController)
    }
}