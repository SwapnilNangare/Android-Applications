package com.example.fragmentcommunicationuisngviewmodel

import androidx.lifecycle.ViewModel

class viewModelClass:ViewModel()
{

    var number=0
    fun addNumber()
    {
        number++
    }
}