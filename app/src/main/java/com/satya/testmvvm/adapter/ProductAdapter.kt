package com.satya.testmvvm.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.satya.testmvvm.databinding.RvLayoutBinding
import com.satya.testmvvm.response.DataResponse
import com.satya.testmvvm.response.TaskTwoResponse

class ProductAdapter(private val context: Context, private val userClick: OnClick) :
    RecyclerView.Adapter<ProductAdapter.ViewModel>() {

    private var list: List<TaskTwoResponse.Data.Image?> = arrayListOf()

    inner class ViewModel(binding: RvLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        val binding = binding

        fun bind(data: TaskTwoResponse.Data.Image, position: Int) {
            binding.apply {
                Glide.with(context).load(data.image).into(image)
            }

            itemView.setOnClickListener {
                userClick.youSelected(data)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewModel {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RvLayoutBinding.inflate(inflater, parent, false)
        return ViewModel(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewModel, position: Int) {
        holder.bind(list[position]!!, position)
    }

    fun setList(list: List<TaskTwoResponse.Data.Image?>?) {
        this.list = list as List<TaskTwoResponse.Data.Image>
        notifyDataSetChanged()
    }

    interface OnClick {
        fun youSelected(data: TaskTwoResponse.Data.Image)
    }
    }