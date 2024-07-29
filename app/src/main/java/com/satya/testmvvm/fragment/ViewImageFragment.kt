package com.satya.testmvvm.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.satya.testmvvm.R
import com.satya.testmvvm.databinding.FragmentViewImageBinding

class ViewImageFragment : Fragment() {

    private lateinit var binding: FragmentViewImageBinding
    private var imageUrl = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_view_image, container, false)

        val url = arguments?.getString("image")

        Log.e("TAG", "onCreateViewSatya: $url", )

        if (url != null) {
            imageUrl = url
            Glide.with(requireActivity()).load(imageUrl).into(binding.productIV)
        }

        bacKHandle()

        return binding.root
    }

    private fun bacKHandle() {
        binding.apply {
            backIV.setOnClickListener {
                findNavController().popBackStack()
            }
        }
    }
}