package com.example.kotlin1hw1.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kotlin1hw1.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.activity_second.edit_text

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        getData()
        sendData()
    }

    private fun sendData() {
        btn_second.setOnClickListener {
            if (edit_text.length() == 0) {
                Toast.makeText(this, "Please enter data", Toast.LENGTH_SHORT).show()

            } else {
                val data  = edit_text.text.toString()
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("key", data)
                startActivity(intent)
            }
        }
    }

    private fun getData() {
        val intent = intent

        val data = intent.getStringExtra("key")
        text_view.text = data

        val data2 = intent.getStringExtra("key2")
        edit_text.setText(data2)
    }
}