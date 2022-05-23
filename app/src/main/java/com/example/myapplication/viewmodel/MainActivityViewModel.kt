package com.example.myapplication.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {

    val currentNumber: MutableLiveData<Int> = MutableLiveData<Int>(0)

}