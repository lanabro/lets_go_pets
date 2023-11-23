package com.example.letsgopets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.ImageButton
import android.widget.EditText


class VerificationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification)
        val backButton: ImageButton = findViewById(R.id.backMainActivity)
        val checkButton: Button = findViewById(R.id.button3)
        val numberInput: EditText = findViewById(R.id.editCode)

        checkButton.setOnClickListener() {
            val userInput = numberInput.text.toString()
            if (userInput == "12345") {
                val intent = Intent(this, MapActivity::class.java)
                startActivity(intent)
            } else {
                numberInput.error = "Неверный код"
            }
        }
        backButton.setOnClickListener {
            backMainActivity()
        }

    }

    private fun backMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
    }

}