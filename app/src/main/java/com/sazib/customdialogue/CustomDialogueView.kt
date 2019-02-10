package com.iventure.bdcare.utils.view

import android.app.Activity
import android.app.Dialog
import android.view.View
import android.view.Window
import android.widget.Button
import android.widget.TextView
import com.sazib.customdialogue.R

class CustomDialogueView {

  fun showDialog(
    activity: Activity,
    msg: String
  ) {
    val dialog = Dialog(activity)
    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
    dialog.setCancelable(false)
    dialog.setContentView(R.layout.dialogue)

    val text = dialog.findViewById<View>(R.id.text_dialog) as TextView
    text.text = msg

    val dialogButton = dialog.findViewById<View>(R.id.btn_dialog) as Button
    dialogButton.setOnClickListener { dialog.dismiss() }

    dialog.show()
  }
}