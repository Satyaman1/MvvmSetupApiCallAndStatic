package com.satya.testmvvm

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.android.material.button.MaterialButton
import com.satya.testmvvm.adapter.ProductAdapter
import com.satya.testmvvm.databinding.ActivityMainBinding
import com.satya.testmvvm.network.CustomProgressLoading
import com.satya.testmvvm.network.NetworkResult
import com.satya.testmvvm.response.NavigationResponse
import com.satya.testmvvm.utility.Util
import com.satya.testmvvm.viewModel.NavigationViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val myViewModel by viewModels<NavigationViewModel>()
    private lateinit var loading: CustomProgressLoading
    private lateinit var binding: ActivityMainBinding
    private lateinit var productAdapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        loading = CustomProgressLoading(this)

        binding.main.open()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        sideMenu()

    }

    private fun sideMenu() {
        myViewModel.getProduct(1, "Sesapi", "E4e1927490e7559c1720088132")

        apiCalling()

        binding.apply {
            setAdapter(rv)

            seeMoreClick(seeMoreButton)
        }
    }

    private fun seeMoreClick(seeMoreButton: MaterialButton) {
        var click = true
        seeMoreButton.setOnClickListener {
            if (click){
                productAdapter.setKey(true)
            }else{
                productAdapter.setKey(false)
            }
            click = !click
        }
    }

    private fun setAdapter(recyclerView: RecyclerView) {
        binding.apply {
            productAdapter = ProductAdapter(this@MainActivity, object : ProductAdapter.OnClick {
                override fun youSelected(data: NavigationResponse.Result.Menu) {
                    Log.e("TAG", "youSelected==>: $data")
                }
            })

            recyclerView.adapter = productAdapter
        }
    }

    private fun apiCalling() {
        myViewModel.getProducts.observe(this) {
            loading.hideProgress()
            try {
                when (it) {
                    is NetworkResult.Success -> {
                        val body = it.data as NavigationResponse
                        Log.e("TAG", "apiCalling: $body")
                        binding.apply {
                            userNameTV.text = body.result?.title
                            Glide.with(this@MainActivity).load(body.result?.user_photo)
                                .into(userProfileIV)
                            for (data in body.result?.menus!!) {
                                when (data?.`class`) {
                                    "core_mini_messages" -> {
                                        messageLayout.apply {
                                            staticDataSetup(
                                                textTV,
                                                image,
                                                data.icon.toString(),
                                                data.label.toString()
                                            )
                                        }
                                    }

                                    "core_mini_notifications" -> {
                                        notificationLayout.apply {
                                            staticDataSetup(
                                                textTV,
                                                image,
                                                data.icon.toString(),
                                                data.label.toString()
                                            )
                                        }
                                    }

                                    "core_main_settings" -> {
                                        settingLayout.apply {
                                            staticDataSetup(
                                                textTV,
                                                image,
                                                data.icon.toString(),
                                                data.label.toString()
                                            )
                                        }
                                    }

                                    "core_footer_privacy" -> {
                                        privacyLayout.apply {
                                            staticDataSetup(
                                                textTV,
                                                image,
                                                data.icon.toString(),
                                                data.label.toString()
                                            )
                                        }
                                    }

                                    "core_footer_terms" -> {
                                        termsLayout.apply {
                                            staticDataSetup(
                                                textTV,
                                                image,
                                                data.icon.toString(),
                                                data.label.toString()
                                            )
                                        }
                                    }

                                    "core_footer_contact" -> {
                                        contactLayout.apply {
                                            staticDataSetup(
                                                textTV,
                                                image,
                                                data.icon.toString(),
                                                data.label.toString()
                                            )
                                        }
                                    }

                                    "core_main_sesapi_rate" -> {
                                        rateUsButton.apply {
                                            staticDataSetup(
                                                rateUs,
                                                image,
                                                data.icon.toString(),
                                                data.label.toString()
                                            )
                                        }
                                    }

                                    "core_mini_auth" -> {
                                        staticDataSetup(
                                            signOutTV,
                                            null,
                                            data.icon.toString(),
                                            data.label.toString()
                                        )
                                    }
                                }
                            }
                        }
                        productAdapter.setList(body.result?.menus)
                    }

                    is NetworkResult.Error -> {
                        val body = Util.error(it.data, NavigationResponse::class.java)
                        Util.toast(this, "$body")
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

    private fun staticDataSetup(tv: TextView, iv: ImageView?, iconUrl: String, title: String) {
        iv?.let { Glide.with(this@MainActivity).load(iconUrl).into(it) }
        tv.text = title
    }
}