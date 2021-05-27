package com.example.saap.ui.superhero.marvel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MarvelViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Marvel Fragment"
    }
    val text: LiveData<String> = _text
}