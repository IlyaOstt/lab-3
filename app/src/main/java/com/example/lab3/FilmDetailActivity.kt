package com.example.lab3

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class FilmDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_film_detail)

        val position = intent.getIntExtra("POSITION", 0)

        val film = FilmData.films[position]

        findViewById<ImageView>(R.id.iv_detail).setImageResource(film.imageResId)
        findViewById<TextView>(R.id.tv_detail_title).setText(film.nameFile)
        findViewById<TextView>(R.id.tv_detail_desc).setText(film.descFull)
    }
}