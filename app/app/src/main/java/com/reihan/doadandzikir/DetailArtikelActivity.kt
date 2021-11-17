package com.reihan.doadandzikir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailArtikelActivity : AppCompatActivity() {

    companion object  {
        const val DATA_TITLE = "title"
        const val DATA_DESC = "data"
        const val DATA_IMAGE = "image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_detail_artikel)

        val dataTitle = intent.getStringExtra(DATA_TITLE)
        val dataDesc = intent.getStringExtra(DATA_DESC)
        val dataImage = intent.getIntExtra(DATA_IMAGE, 0)

        val tvtitle: TextView = findViewById(R.id.tv_Detail_title)
        tvtitle.text = dataTitle
        val tvDesc: TextView = findViewById(R.id.tv_Detail_desc)
        tvDesc.text = dataDesc
        val imgArtikel = findViewById<ImageView>(R.id.img_detailt)
        imgArtikel.setImageResource(dataImage)


    }
}