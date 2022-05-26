package dev.mwangi.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RosesActivity : AppCompatActivity() {
    lateinit var btnNextRoses:Button
    lateinit var btnPRevious:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roses)
        btnNextRoses=findViewById(R.id.btnNextRoses)
        btnPRevious=findViewById(R.id.btnPRevious)
        btnNextRoses.setOnClickListener {
            val intent=Intent(this, DaisysActivity::class.java)
            startActivity(intent)
        }
        btnPRevious.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }


    }
}