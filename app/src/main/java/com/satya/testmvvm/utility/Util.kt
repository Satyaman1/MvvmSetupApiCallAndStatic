package com.satya.testmvvm.utility

import android.annotation.SuppressLint
import android.content.Context
import android.util.Patterns
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.google.gson.Gson
import com.satya.testmvvm.network.NetworkResult
import okhttp3.ResponseBody
import retrofit2.Response
import java.util.regex.Pattern

class Util {

    companion object {
        fun isValid(password: String?): Boolean {
            val PASSWORD_PATTERN =
                "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$"
            val pattern = Pattern.compile(PASSWORD_PATTERN)
            val matcher = pattern.matcher(password)
            return matcher.matches()
        }

        fun toast(context: Context, string: String) =
            Toast.makeText(context, string, Toast.LENGTH_LONG).show()

        fun <T> error(error: ResponseBody?, type: Class<T>?): T {
            return Gson().fromJson(error!!.charStream(), type)
        }

        fun <T> error(error: Any?, type: Class<T>?): T {
            return Gson().fromJson((error!! as ResponseBody).charStream(), type)
        }

        fun <T> handleResponse(
            liveData: MutableLiveData<NetworkResult<Any>>,
            response: Response<T>
        ): Response<T> {
            liveData.value = if (response.isSuccessful && response.body() != null)
                NetworkResult.Success(response.body()!!)
            else if (!response.isSuccessful && response.errorBody() != null) {
                NetworkResult.Error("Error : ", response.errorBody())
            } else
                NetworkResult.Error("Something Went Wrong...")
            return response
        }

        @SuppressLint("LongLogTag")
        fun <T> print(body: Response<T>): Response<T> {
            //Log.e(TAG, "${body.code()} <<<<<< ${Gson().toJson(body.body() ?: body.errorBody())}")
            return body
        }
    }
}
