package com.example.motospare

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        bottomNavigation.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.page_home -> {
                    // Handle home navigation
                    true
                }
                R.id.page_search -> {
                    // Handle search navigation
                    true
                }
                R.id.page_profile -> {
                    // Handle profile navigation
                    true
                }
                else -> false
            }
        }
    }
}