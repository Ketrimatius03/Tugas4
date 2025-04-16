package com.example.tugas4

import android.os.Bundle
import  android.widget.ImageView
import  android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)


            val wisata = intent.getParcelableExtra<Image>("wisata")
            if (wisata != null) {
                val imageView = findViewById<ImageView>(R.id.imageDetail)
                val textViewTitle = findViewById<TextView>(R.id._imageTitle)
                val textViewDesc = findViewById<TextView>(R.id._imageDesc)

                imageView.setImageResource(wisata.imageSource)
                textViewTitle.text = wisata.imageTitle
                textViewDesc.text = wisata.imageDesc
            } else {
            }
        }
    }



