package com.example.recyclerview_withviewbinding.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_withviewbinding.Task
import com.example.recyclerview_withviewbinding.databinding.RecyclerviewitemBinding

class MainAdapter(val taskList : List<Task>) : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        /*
        * Returning The Main View Holder inflating the binding layout
        * This is how the item layout is inflated when using the view binding
        * */
        return MainViewHolder(RecyclerviewitemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val task = taskList[position]
        // calling the bindItem function
        holder.bindItem(task)
    }

    override fun getItemCount(): Int {
        return taskList.size
    }

    inner class MainViewHolder(val itemBinding : RecyclerviewitemBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        fun bindItem (task: Task) {
            itemBinding.titleTv.text = task.title
            itemBinding.timeTv.text = task.timeStamp
        }
    }
}