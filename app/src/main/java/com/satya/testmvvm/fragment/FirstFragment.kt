package com.satya.testmvvm.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.satya.testmvvm.R
import com.satya.testmvvm.databinding.FragmentFirstBinding
import com.satya.testmvvm.network.CustomProgressLoading
import com.satya.testmvvm.network.TokenManager
import com.satya.testmvvm.viewModel.NavigationViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    private val myViewModel by viewModels<NavigationViewModel>()
    private lateinit var loading: CustomProgressLoading

    @Inject
    lateinit var tokenManager: TokenManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_first, container, false)

        loading = CustomProgressLoading(requireActivity())

        return binding.root
    }


}