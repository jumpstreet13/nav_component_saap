package com.example.saap.ui.superhero.marvel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.saap.R

class MarvelFragment : Fragment() {

    private lateinit var notificationsViewModel: MarvelViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        notificationsViewModel =
            ViewModelProvider(this).get(MarvelViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_marvel, container, false)
        val textView: TextView = root.findViewById(R.id.text_marvel)
        notificationsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}