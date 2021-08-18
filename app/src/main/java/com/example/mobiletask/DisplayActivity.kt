package com.example.mobiletask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobiletask.databinding.ActivityDisplayBinding

class DisplayActivity : AppCompatActivity() {
    var binding: ActivityDisplayBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        binding = ActivityDisplayBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        //Getting intent Extra

        val name = intent.getStringExtra("NAME_EXTRA")

        val email= intent.getStringExtra("EMAIL_EXTRA")

        val track = intent.getStringExtra("TRACK_EXTRA")
       val display = intent.getStringExtra("DISPLAY_EXTRA")

        binding?.txtName?.text = name
        binding?.txtEmail?.text = email
        binding?.txtTrac?.text = track
        binding?.txtDisplay?.text = display
    }
}