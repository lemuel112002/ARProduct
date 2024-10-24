package com.example.arproduct

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class ActivityItemDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_item_details)

        val itemButton: Button = findViewById(R.id.item_button)
        itemButton.setOnClickListener {
            val intent = Intent(this, AugmentedRealityActivity::class.java)
            startActivity(intent)
        }
    }
}
