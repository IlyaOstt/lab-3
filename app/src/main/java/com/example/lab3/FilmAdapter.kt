package com.example.lab3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintSet
import androidx.recyclerview.widget.RecyclerView
import android.content.Intent

class FilmAdapter: RecyclerView.Adapter<FilmHolder>() {

    private val films = FilmData.films

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FilmHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return FilmHolder(view)
    }

    override fun onBindViewHolder(holder: FilmHolder, position: Int) {
        holder.bind(films[position])

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, FilmDetailActivity::class.java)
            intent.putExtra("POSITION", position)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return  films.size
    }

}