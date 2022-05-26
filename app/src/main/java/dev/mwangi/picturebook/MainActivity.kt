package dev.mwangi.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnNextIntro: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnNextIntro=findViewById(R.id.btnNextInto)
        btnNextIntro.setOnClickListener {
            val intent=Intent(this, RosesActivity::class.java)
            startActivity(intent)
        }
    }
}