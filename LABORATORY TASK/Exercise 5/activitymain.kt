package com.example.laboratorytask

import android.os.Bundle
import android.widget.Button
import android.widget.ImageSwitcher
import android.widget.ImageView
import android.widget.ViewSwitcher
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var previousBtn: Button
    private lateinit var nextBtn: Button
    private lateinit var imgSw: ImageSwitcher
    private val images = arrayOf(R.drawable.nailong1, R.drawable.nailong2, R.drawable.nailong3)
    private var position = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        previousBtn = findViewById(R.id.btnPrevious)
        nextBtn = findViewById(R.id.btnNext)
        imgSw = findViewById(R.id.imgSw)

        imgSw.setFactory {
            ImageView(this).apply {
                setImageResource(images[position])
            }
        }

        imgSw.setInAnimation(this, android.R.anim.slide_in_left)
        imgSw.setOutAnimation(this, android.R.anim.slide_out_right)

        previousBtn.setOnClickListener {
            if (position > 0) position-- else position = 0
            imgSw.setImageResource(images[position])
        }

        nextBtn.setOnClickListener {
            if (position < images.size - 1) position++
            imgSw.setImageResource(images[position])
        }
    }
}
