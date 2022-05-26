package dev.mwangi.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TulipsActivity : AppCompatActivity() {
    lateinit var btnNextTulips:Button
    lateinit var btnBAck:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tulips)
        btnNextTulips=findViewById(R.id.btnNextTulips)
        btnBAck=findViewById(R.id.btnBAck)

        btnNextTulips.setOnClickListener {
            val intent=Intent(this, SunflowerActivity::class.java)
            startActivity(intent)

        }
        btnBAck.setOnClickListener {
            val intent=Intent(this,DaisysActivity::class.java)
            startActivity(intent)
        }
    }
}