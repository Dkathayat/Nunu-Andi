package com.example.todo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            if (firstName.length()==0) {
                Toast.makeText(this, "Enter Name", Toast.LENGTH_SHORT).show()
            } else {
                result.setText(" Welcome to my andii family " + firstName.text)
            }

            firstName.onEditorAction(EditorInfo.IME_ACTION_DONE)
        }
        button2.setOnClickListener {
            intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }

}