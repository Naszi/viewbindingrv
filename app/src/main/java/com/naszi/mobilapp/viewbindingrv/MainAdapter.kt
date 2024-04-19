package com.naszi.mobilapp.viewbindingrv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.naszi.mobilapp.viewbindingrv.databinding.RecyclerviewItemBinding

class MainAdapter(
    private val taskList: List<Task>
): RecyclerView.Adapter<MainAdapter.MainViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.MainViewHolder {
        return  MainViewHolder(RecyclerviewItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ))
    }

    override fun onBindViewHolder(holder: MainAdapter.MainViewHolder, position: Int) {
        val task = taskList[position]
        holder.bindItem(task)
    }

    override fun getItemCount(): Int {
        return taskList.size
    }

    inner class MainViewHolder(
        private val itemBinding: RecyclerviewItemBinding
    ): RecyclerView.ViewHolder(itemBinding.root) {
        fun bindItem(task: Task) {
            itemBinding.titleTv.text = task.title
            itemBinding.timeTv.text = task.title
        }
    }

}