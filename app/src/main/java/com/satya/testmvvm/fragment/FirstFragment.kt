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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_first, container, false)

        return binding.root
    }


}