package com.example.playlistmaker

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val searchBtn = findViewById<Button>(R.id.search_btn)

        val searchBtnClickListener: View.OnClickListener = object : View.OnClickListener{
            override fun onClick(v: View?) {
                val intent = Intent(this@MainActivity, SearchActivity::class.java)
                startActivity(intent)
            }
        }
        searchBtn.setOnClickListener(searchBtnClickListener)

        val mediaBtn = findViewById<Button>(R.id.media_btn)

        mediaBtn.setOnClickListener {
            val intent = Intent(this, MediaActivity::class.java)
            startActivity(intent)
        }

        val settingsBtn = findViewById<Button>(R.id.settings_btn)

        settingsBtn.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
    }
}