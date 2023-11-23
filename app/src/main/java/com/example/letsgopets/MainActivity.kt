package com.example.letsgopets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var editTextPhone: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextPhone = findViewById(R.id.editTextPhone)
        button = findViewById(R.id.button3)
        button.setOnClickListener(listener)

    }

    private val listener = View.OnClickListener { view ->
        when (view.getId()) {
            R.id.button3 -> {
                val intent = Intent(this@MainActivity, VerificationActivity::class.java)
                intent.putExtra("phone", editTextPhone.text)
                startActivity(intent)
                finish()
            }
        }
    }
}
