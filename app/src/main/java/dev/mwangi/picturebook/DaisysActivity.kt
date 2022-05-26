package dev.mwangi.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DaisysActivity : AppCompatActivity() {
    lateinit var btnNextDaisys:Button
    lateinit var btnBack:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daisys)
        btnNextDaisys=findViewById(R.id.btnNextDaisys)
        btnBack=findViewById(R.id.btnBack)
        btnNextDaisys.setOnClickListener {
            val intent=Intent(this, TulipsActivity::class.java)
            startActivity(intent)
        }
        btnBack.setOnClickListener {
            val intent=Intent(this, RosesActivity::class.java)
            startActivity(intent)
        }
    }
}