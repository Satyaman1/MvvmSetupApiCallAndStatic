package com.satya.testmvvm.response

import android.os.Parcelable
import com.google.errorprone.annotations.Keep
import kotlinx.parcelize.Parcelize

@Keep
@Parcelize
data class TestBody(
    val id: Int? = null
) : Parcelable
