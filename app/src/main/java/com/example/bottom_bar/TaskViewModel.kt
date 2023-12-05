package com.example.bottom_bar

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TaskViewModel:ViewModel() {

    var name = MutableLiveData<String>()
    var desc = MutableLiveData<String>()
}