package com.satya.testmvvm.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.satya.testmvvm.R
import com.satya.testmvvm.databinding.ChildServiceTypeRvLayoutBinding
import com.satya.testmvvm.response.ServiceModel


class ServiceChildAdapter(
    private val context: Context,
    private var list: List<ServiceModel.Data.SubService>,
    private val listener: DegreeInterface
) :
    RecyclerView.Adapter<ServiceChildAdapter.ViewHolder>() {

    inner class ViewHolder(binding: ChildServiceTypeRvLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val binding = binding

        fun bind(data: ServiceModel.Data.SubService, position: Int) {
            binding.apply {
                title.text = data.productDisplayName
                amountTV.text = "${context.getString(R.string.rs)} ${data.price}"
                if (data.isSelected == true) {
                    Glide.with(context).load(R.drawable.check_icon).into(makingSwitchIV1)
                } else {
                    Glide.with(context).load(R.drawable.empty_circle_icon).into(makingSwitchIV1)
                }
                itemView.setOnClickListener {
                    listener.sendClick(data, position)
                    notifyDataSetChanged()
                }
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ServiceChildAdapter.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ChildServiceTypeRvLayoutBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position], position)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    interface DegreeInterface {
        fun sendClick(data: ServiceModel.Data.SubService, position: Int)
    }
}