package com.example.fcm_notification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fcm_notification.databinding.ActivityMainBinding
import java.security.Key

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    var dataString: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        if (intent != null) {
            if (intent.hasExtra("key1")) {
                for (key in intent.extras!!.keySet()) {
                    dataString = dataString + intent.extras!!.getString(key) + "\n"
                }
                binding.textView.text = dataString
            }
        }
    }
}