package com.example.giuaky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.giuaky.databinding.ActivityAddBinding
import com.example.giuaky.recycleview.Info

class AddActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityAddBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.save.setOnClickListener {

            val name = binding.eName.text.toString()
            val phone = binding.ePhone.text.toString()

            intent = Intent(this@AddActivity, MainActivity::class.java)

            val info = Info(name, phone)
            MainActivity.Info.add(info)

            startActivity(intent)

        }

    }
}