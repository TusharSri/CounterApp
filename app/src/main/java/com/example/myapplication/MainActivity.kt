package com.example.myapplication

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.viewmodel.MainActivityViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainActivityViewModel
    private lateinit var buttonCounter: Button
    private lateinit var textview_counter:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        buttonCounter = findViewById(R.id.button_count)
        textview_counter = findViewById(R.id.textview_counter)
        buttonCounter.setOnClickListener{
            viewModel.currentNumber.value = viewModel.currentNumber.value?.plus(1)
        }

        viewModel.currentNumber.observe(this, Observer {
            textview_counter.text = it.toString()
        })
    }
}