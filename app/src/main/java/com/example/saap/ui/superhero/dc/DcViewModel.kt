package com.example.saap.ui.superhero.dc

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DcViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is DC Fragment"
    }
    val text: LiveData<String> = _text
}