package com.example.mobiletask

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobiletask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding: ActivityMainBinding? = null
    var name: String = ""
    var email: String = ""
    var track: String = ""
    var displayName: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)




        //Setting up clickListener to the submit button
        binding?.btnSubmit?.setOnClickListener {

            getData()

            val intent = Intent(this, DisplayActivity::class.java)
            intent.putExtra("NAME_EXTRA", name)
            intent.putExtra("TRACK_EXTRA", track)
            intent.putExtra("EMAIL_EXTRA", email)
            intent.putExtra("DISPLAY_EXTRA", displayName)
            startActivity(intent)

            }

        //connecting to hng website
        binding?.btnLearn?.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://internship.zuri.team/"))
            val optionIntent = Intent.createChooser(browserIntent,"Open with")
            startActivity(optionIntent)
        }


    }
    private fun getData(  ) {
        name = binding?.edName?.text.toString()
        track = binding?.edTrack?.text.toString()
        email = binding?.edEmail?.text.toString()
        displayName = binding?.edDisplay?.text.toString()

    }
    }
