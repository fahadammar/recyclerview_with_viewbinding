package com.example.recyclerview_withviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview_withviewbinding.Adapter.MainAdapter
import com.example.recyclerview_withviewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding : ActivityMainBinding? = null
    private var adapter : MainAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        adapter = MainAdapter(TaskListSingleton.taskList)

        // Now RcyclerView Adapter assign
        binding?.taskRv?.adapter = adapter

        // We Can assign the layout manager below, but we can also assign directly in the XML
        // binding?.taskRv?.layoutManager = LinearLayoutManager(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

}