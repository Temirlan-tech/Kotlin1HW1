package com.example.kotlin1hw1.ui

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kotlin1hw1.R
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.activity_second.edit_text

class SecondActivity : AppCompatActivity() {

    private val textToast = "Please enter data"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        getData()
        sendData()
    }

    private fun sendData() {
        btn_second.setOnClickListener {
            if (edit_text.length() == 0) {
                Toast.makeText(this, textToast, Toast.LENGTH_SHORT).show()

            } else {
                val data = edit_text.text.toString()
                setResult(Activity.RESULT_OK, Intent().putExtra(MainActivity.KEY, data))
                finish()
            }
        }
    }

    private fun getData() {
        val intent = intent

        val data = intent.getStringExtra(MainActivity.KEY).toString()
        text_view.text = data
        edit_text.setText(data)
    }
}