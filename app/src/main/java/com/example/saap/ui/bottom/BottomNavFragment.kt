package com.example.saap.ui.bottom

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.saap.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNavFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_bottom_nav, container, false)
        val navView: BottomNavigationView = root.findViewById(R.id.nav_view)

        val navController =
            (childFragmentManager.findFragmentById(R.id.bottom_nav_host_fragment) as NavHostFragment).navController

        navView.setupWithNavController(navController)
        return root
    }
}