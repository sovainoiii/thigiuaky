package com.example.giuaky

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.giuaky.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = getIntent()

        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("phone")
        val email = intent.getStringExtra("email")

        binding.name.setText(name)
        binding.phone.setText(phone)
        binding.email.setText(email)

    }
}