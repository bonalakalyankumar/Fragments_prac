 package com.example.myfirstfragement

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

 class MainActivity : AppCompatActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)

         val bottomNav: BottomNavigationView = findViewById(R.id.btm_nav)

         openfragment(MyFirstFragment())

         bottomNav.setOnNavigationItemSelectedListener {
             val id = it.itemId
             when (id) {
                 R.id.menu_home -> {
                    openfragment(MyFirstFragment())
                 }

                 R.id.menu_profile -> {
                     openfragment(SecondFragment())

                 }

                 R.id.menu_cart -> {
                     openfragment(ThirdFragment())
                 }
             }
             return@setOnNavigationItemSelectedListener true
         }

     }

     private fun openfragment(fragment: Fragment) {
         supportFragmentManager.beginTransaction()
             .replace(R.id.fcv, fragment)
             .commit()

     }
 }