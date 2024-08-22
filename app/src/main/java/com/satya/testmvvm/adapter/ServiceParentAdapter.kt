package com.satya.testmvvm.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.satya.testmvvm.databinding.ServiceTypeRvLayoutBinding
import com.satya.testmvvm.response.ServiceModel

class ServiceParentAdapter(private val context: Context, private val listener: DegreeInterface) :
    RecyclerView.Adapter<ServiceParentAdapter.ViewHolder>() {

    private var list: List<ServiceModel.Data> = arrayListOf()
    lateinit var itemRecyclerAdapter: ServiceChildAdapter

    inner class ViewHolder(binding: ServiceTypeRvLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val binding = binding

        fun bind(data: ServiceModel.Data, position: Int) {
            binding.apply {
                title.text = data.serviceName
                setChildItemRV(childRV, data.subServices)
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): ServiceParentAdapter.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ServiceTypeRvLayoutBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position], position)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun setList(list: List<ServiceModel.Data>) {
        this.list = list
        notifyDataSetChanged()
    }

    interface DegreeInterface {
        fun sendClick(data: ServiceModel.Data.SubService, position: Int)
    }

    private fun setChildItemRV(
        recyclerView: RecyclerView, listChildModel: List<ServiceModel.Data.SubService>
    ) {

        itemRecyclerAdapter = ServiceChildAdapter(
            context,
            listChildModel, object : ServiceChildAdapter.DegreeInterface {
                override fun sendClick(data: ServiceModel.Data.SubService, position: Int) {
                    listener.sendClick(data, position)
                    notifyDataSetChanged()
                }
            }
        )
        recyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        recyclerView.adapter = itemRecyclerAdapter
    }
}