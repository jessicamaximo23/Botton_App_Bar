package com.example.bottom_bar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.bottom_bar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var  taskViewModel: TaskViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        taskViewModel = ViewModelProvider(this).get(TaskViewModel::class.java)
        binding.TaskButton.setOnClickListener {

                NewTaskSheet().show(supportFragmentManager, "This is a tag")
        }

        taskViewModel.name.observe(this){
            binding.TaskTitle.text = String.format("Task Name: %",it)
        }
        taskViewModel.desc.observe(this){
            binding.TaskDescription.text = String.format("Task Description: %",it)
        }
    }
}