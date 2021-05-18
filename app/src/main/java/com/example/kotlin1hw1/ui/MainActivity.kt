package com.example.kotlin1hw1.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin1hw1.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.edit_text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendData()
        getData()
    }

    private fun getData() {
        val intent = intent
        val data = intent.getStringExtra("key")
        edit_text.setText(data)
    }

    private fun sendData() {
        btn_send.setOnClickListener {
            if (edit_text.length() == 0) {
                Toast.makeText(this, "Please enter data", Toast.LENGTH_SHORT).show()

            } else {
                val data  = edit_text.text.toString()
                val intent = Intent(this, SecondActivity::class.java)
                    intent.putExtra("key", data)
                    intent.putExtra("key2", data)
                    startActivity(intent)

            }
        }
    }
}

//ДЗ: На первой активити добавить EditText + Button, при вводе если значения в
//editText пустое и вы нажали на button, то отобразить Toast, то что EditText не может быть пустым,
//иначе Перейти на вторую активити и отобразить значение из первого активити в TextView.
//ДЗ (доп): На первой активити добавить EditText + Button, при вводе если значения в editText пустое и
//вы нажали на button, то отобразить Toast, что EditText не может быть пустым, иначе Перейти на вторую активити и
//отобразить значение из EditText, также добавить Button, если EditText не пуст, то вернуться на 1 активити
//и отобразить текст из 2 активити.