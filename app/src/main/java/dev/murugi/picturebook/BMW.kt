package dev.murugi.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BMW : AppCompatActivity() {
    lateinit var btnPrev3: Button
    lateinit var btnNext4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmw)
        btnPrev3 = findViewById(R.id.btnPrev3)
        btnPrev3.setOnClickListener {
            val intent = Intent(this, MercedesGullwing::class.java)
            startActivity(intent)
        }
        btnNext4 = findViewById(R.id.btnNext4)
        btnNext4.setOnClickListener {
            val intent = Intent(this, RollsRoyce::class.java)
            startActivity(intent)
        }
    }
}