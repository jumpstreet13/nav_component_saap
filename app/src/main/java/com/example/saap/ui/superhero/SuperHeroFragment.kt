package com.example.saap.ui.superhero

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.saap.R

class SuperHeroFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_hero, container, false)

        val navController = findNavController()

        root.findViewById<Button>(R.id.button).setOnClickListener {
            navController.navigate(R.id.action_navigation_heroes_to_marvelFragment)
        }
        root.findViewById<Button>(R.id.button2).setOnClickListener {
            navController.navigate(R.id.action_navigation_heroes_to_dcFragment)
        }

        return root
    }
}