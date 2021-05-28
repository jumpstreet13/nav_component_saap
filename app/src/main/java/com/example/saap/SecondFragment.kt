package com.example.saap

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.net.toUri
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class SecondFragment : Fragment() {

    private lateinit var notificationsViewModel: SecondFragmentViewModel
    private val args by navArgs<SecondFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        notificationsViewModel =
            ViewModelProvider(this).get(SecondFragmentViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_second, container, false)
        val textView: TextView = root.findViewById(R.id.text_second)
        notificationsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
            val text = "${args.title} ${args.myArg}"

            textView.text = text
        })

        root.findViewById<Button>(R.id.to_heroes).setOnClickListener {
            findNavController().navigate("ruleTheGalaxy://heroes".toUri())
        }
        return root
    }
}