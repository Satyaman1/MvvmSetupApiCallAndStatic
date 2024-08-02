package com.satya.testmvvm.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.satya.testmvvm.databinding.RvLayoutBinding
import com.satya.testmvvm.response.NavigationResponse

class ProductAdapter(private val context: Context, private val userClick: OnClick) :
    RecyclerView.Adapter<ProductAdapter.ViewModel>() {

    private var list: List<NavigationResponse.Result.Menu> = arrayListOf()
    private var click: Boolean = false

    inner class ViewModel(binding: RvLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        val binding = binding

        fun bind(data: NavigationResponse.Result.Menu, position: Int) {
            binding.apply {
                Glide.with(context).load(data.icon).into(image)
                textTV.text = data.label
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
        if (click) {
            return list.size
        } else return if (list.size > 4) 4 else list.size

    }

    override fun onBindViewHolder(holder: ViewModel, position: Int) {
        holder.bind(list[position]!!, position)
    }

    fun setList(list: List<NavigationResponse.Result.Menu?>?) {
        this.list = list as List<NavigationResponse.Result.Menu>
        notifyDataSetChanged()
    }

    fun setKey(click: Boolean) {
        this.click = click
        notifyDataSetChanged()
    }

    interface OnClick {
        fun youSelected(data: NavigationResponse.Result.Menu)
    }
}