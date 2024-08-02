package com.satya.testmvvm.network

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Window
import android.widget.ProgressBar
import com.satya.testmvvm.R

class CustomProgressLoading(var context: Context) {

    var dialog: Dialog? = null

    private var progressBar: ProgressBar? = null

    fun showProgress() {

        if (dialog == null) {

            dialog = Dialog(context)

            dialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)

            dialog?.setContentView(R.layout.custom_progress_loader)

            dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT)) //TODO Uncomment if you want to show transparent backgraound

            progressBar = dialog?.findViewById(R.id.progressbar)
        }

        if (dialog != null && !dialog!!.isShowing) {

            dialog?.setCancelable(false)

            dialog?.setCanceledOnTouchOutside(false)

            try {

                dialog?.show()

            } catch (e: Exception) {

                dialog!!.dismiss()
            }
        }
    }

    fun hideProgress() {

        if (dialog != null && dialog!!.isShowing) {

            dialog!!.dismiss()
        }
    }
}