package com.satya.testmvvm.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.satya.testmvvm.databinding.RvLayoutBinding
import com.satya.testmvvm.response.ServiceModel

class ProductAdapter(private val context: Context, private val userClick: OnClick) :
    RecyclerView.Adapter<ProductAdapter.ViewModel>() {

    private var list: List<ServiceModel.Data> = arrayListOf()

    inner class ViewModel(binding: RvLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        val binding = binding

        fun bind(data: ServiceModel.Data, position: Int) {
            binding.apply {
                // Glide.with(context).load(data.image).into(image)
                title.text = data.serviceName
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

    fun setList(list: List<ServiceModel.Data>) {
        this.list = list
        notifyDataSetChanged()
    }

    interface OnClick {
        fun youSelected(data: ServiceModel.Data)
    }
}