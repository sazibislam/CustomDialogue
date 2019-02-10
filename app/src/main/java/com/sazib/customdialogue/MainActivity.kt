package com.sazib.customdialogue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.iventure.bdcare.utils.view.CustomDialogueView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener {
            CustomDialogueView().showDialog(this, "Put your message!!")
        }
    }
}
