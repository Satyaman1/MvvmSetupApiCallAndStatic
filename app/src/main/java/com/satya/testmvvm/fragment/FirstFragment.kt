package com.satya.testmvvm.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.satya.testmvvm.R
import com.satya.testmvvm.databinding.FragmentFirstBinding
import com.satya.testmvvm.network.CustomProgressLoading
import com.satya.testmvvm.network.NetworkResult
import com.satya.testmvvm.network.TokenManager
import com.satya.testmvvm.response.LoginBody
import com.satya.testmvvm.response.LoginResponse
import com.satya.testmvvm.response.TestBody
import com.satya.testmvvm.utility.Util
import com.satya.testmvvm.viewModel.LoginViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    private val myViewModel by viewModels<LoginViewModel>()
    private lateinit var loading: CustomProgressLoading

    @Inject
    lateinit var tokenManager: TokenManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_first, container, false)

        loading = CustomProgressLoading(requireActivity())

        binding.loginButton.setOnClickListener {
            checkIfNotNull()
        }

        return binding.root
    }

    private fun checkIfNotNull() {
        binding.apply {
            val email = email.text.trim().toString()
            val password = password.text.trim().toString()

            if (email.isNullOrEmpty()) {
                Util.toast(requireActivity(), "Please enter your email here")
            } else if (password.isNullOrEmpty()) {
                Util.toast(requireActivity(), "Please enter your password here")
            } else {
                val model = LoginBody()
                model.password = password
                model.email = email
                loginData(model)
            }
        }
    }

    private fun loginData(model: LoginBody) {
        myViewModel.login(model)
        myViewModel.login.observe(viewLifecycleOwner) {
            loading.hideProgress()
            binding.apply {
                try {
                    when (it) {
                        is NetworkResult.Success -> {
                            val body = it.data as LoginResponse
                            Util.toast(requireActivity(), body.message.toString())
                            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
                            val token =  tokenManager.saveToken(body.token.toString())
                        }

                        is NetworkResult.Error -> {
                            val body = Util.error(it.data, LoginResponse::class.java)
                            Util.toast(requireContext(), "$body")
                        }

                        is NetworkResult.Loading -> {
                            loading.showProgress()
                        }
                    }
                } catch (e: Exception) {
                    Log.e("SATYA", "observer: $e")
                }

            }

        }
    }
}