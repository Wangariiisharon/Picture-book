package dev.mwangi.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SunflowerActivity : AppCompatActivity() {
    lateinit var btnPrevious:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sunflower)
        btnPrevious=findViewById(R.id.btnPrevious)
        btnPrevious.setOnClickListener {
            val intent=Intent(this,TulipsActivity::class.java)
            startActivity(intent)
        }
    }
}