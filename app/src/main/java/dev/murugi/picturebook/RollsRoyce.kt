package dev.murugi.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RollsRoyce : AppCompatActivity() {
    lateinit var btnPrev4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rolls_royce)
        btnPrev4 = findViewById(R.id.btnPrev4)
        btnPrev4.setOnClickListener {
            val intent = Intent(this, BMW::class.java)
            startActivity(intent)
        }
    }
}