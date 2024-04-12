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

class ProductAdapter(private val context: Context, private val userClick: OnClick) :
    RecyclerView.Adapter<ProductAdapter.ViewModel>(), Filterable {

    private var list: List<DataResponse.Product> = arrayListOf()
    private var filterList: List<DataResponse.Product> = arrayListOf()

    inner class ViewModel(binding: RvLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        val binding = binding

        fun bind(data: DataResponse.Product, position: Int) {
            binding.apply {
                Glide.with(context).load(data.thumbnail).into(image)
                title.text = data.title
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
        holder.bind(list[position], position)
    }

    fun setList(list: List<DataResponse.Product?>?) {
        this.list = list as List<DataResponse.Product>
        this.filterList = list
        notifyDataSetChanged()
    }

    interface OnClick {
        fun youSelected(data: DataResponse.Product)
    }

    override fun getFilter(): Filter {
        var filter = object : Filter() {
            override fun performFiltering(p0: CharSequence?): FilterResults {
                var filterResults = FilterResults()
                if (p0.isNullOrEmpty()) {
                    filterResults.values = filterList
                    filterResults.count = filterList.size
                } else {
                    var searchChar = p0.toString().toLowerCase()

                    var filteredResult =
                        ArrayList<DataResponse.Product>()

                    for (data in filterList) {
                        if (data.brand!!.toLowerCase()
                                .contains(searchChar)
                        ) {
                            filteredResult.add(data)
                        }
                    }

                    filterResults.values = filteredResult
                    filterResults.count = filteredResult.size
                }

                return filterResults
            }

            override fun publishResults(p0: CharSequence?, filterResult: FilterResults?) {
                try {
                    if (filterResult != null) {
                        list =
                            filterResult.values as List<DataResponse.Product>
                    }
                } catch (e: Exception) {
                    Log.e("SATYA", "publishResults: $e")
                }
                notifyDataSetChanged()
            }
        }
        return filter
    }
}