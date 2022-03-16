package com.example.giuaky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.giuaky.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener {
            val intent = Intent(this@MainActivity, ResultActivity::class.java)

            val name = binding.eName.text.toString()
            val phone = binding.ePhone.text.toString()
            val email = binding.eEmail.text.toString()

            intent.putExtra("name", name)
            intent.putExtra("phone", phone)
            intent.putExtra("email", email)

            startActivity(intent)
        }

    }

}