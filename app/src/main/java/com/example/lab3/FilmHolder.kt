package com.example.lab3

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.motion.widget.KeyPosition
import androidx.recyclerview.widget.RecyclerView

class FilmHolder(item: View): RecyclerView.ViewHolder(item){

    val imageView = item.findViewById<ImageView>(R.id.iv_film)
    val textView_name = item.findViewById<TextView>(R.id.tv_nameFilm)
    val textView_desc = item.findViewById<TextView>(R.id.tv_descFilm)
    val textView_day = item.findViewById<TextView>(R.id.tv_day)

    fun bind(film: Film){
        imageView.setImageResource(film.imageResId)
        textView_name.setText(film.nameFile)
        textView_desc.setText(film.descShort)
        textView_day.setText(film.day)
    }
}