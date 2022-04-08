package com.example.livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {

 val factLiveData=MutableLiveData<String>("This a fact")


    fun updateLiveData()
    {
        factLiveData.value="Another Facts"
    }
}