package com.satya.testmvvm.utility

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.satya.testmvvm.network.Constants
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class SessionManager : Application() {
    /**
     * INITIALIZATION FOR SESSION
     */

    override fun onCreate() {
        super.onCreate()
        instance = this
        context = baseContext
        if (auth == null) {
            auth = SessionManager()
            preferences = context!!.getSharedPreferences("Satya", MODE_PRIVATE)
            editor = preferences!!.edit()
        }
    }

    fun setLanguagePref(localeKey: String) {
        val pref = getSharedPreferences(PREFS, Context.MODE_PRIVATE).edit()
        pref.putString(LOCALE, localeKey)
        pref.apply()
    }

    fun getLanguagePref(): String? {
        val pref = getSharedPreferences(PREFS, Context.MODE_PRIVATE)
        return pref.getString(LOCALE, "en")
    }

    companion object {
        private var context: Context? = null
        private var editor: SharedPreferences.Editor? = null
        private var auth: SessionManager? = null
        private var preferences: SharedPreferences? = null
        var instance: SessionManager? = null
        const val PREFS: String = "SHARED_PREFS"
        const val LOCALE: String = "LOCALE"
        var deviceToken: String = ""

        /**
         * SETTER FOR SESSION DATA
         */
        fun setIsLoggedIn(value: Boolean): Boolean {
            return saveBoolean(Constants.IS_LOGGED_IN, value)
        }

        /**
         * GETTER FOR SESSION DATA
         */
        val isLoggedIn: Boolean
            get() = getBoolean(Constants.IS_LOGGED_IN)


        /**
         * DESTROY SESSION OR LOGOUT
         */
        fun destroySession() {
            editor!!.clear()
            editor!!.commit()
            editor!!.apply()
        }

        /**
         * SAVE VALUE IN SESSION
         */
        fun saveInt(key: String, value: Int): Int {
            editor!!.putInt(key, value)
            editor!!.commit()
            editor!!.apply()
            return value
        }

        fun saveString(key: String, value: String): String {
            editor!!.putString(key, value)
            editor!!.commit()
            editor!!.apply()
            return value
        }

        private fun saveObject(key: String, value: Any): Any {
            editor!!.putString(key, Gson().toJson(value))
            editor!!.commit()
            editor!!.apply()
            return value
        }

        fun saveBoolean(key: String, value: Boolean): Boolean {
            editor!!.putBoolean(key, value)
            editor!!.commit()
            editor!!.apply()
            return value
        }

        /**
         * GET VALUE IN SESSION
         */
        fun getBoolean(key: String): Boolean {
            return preferences!!.getBoolean(key, false)
        }

        fun getInt(key: String): Int {
            return preferences!!.getInt(key, 0)
        }

        fun getString(key: String): String? {
            return preferences!!.getString(key, "")
        }
    }
}