package com.maverick.rsvrassignment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.maverick.rsvrassignment.databinding.MovieItemActivityBinding
import com.maverick.rsvrassignment.model.CastModel

class MovieAdapter(private val movie: ArrayList<CastModel>) :
    RecyclerView.Adapter<MovieAdapter.ViewHolder>() {
    class ViewHolder(var itemActivityBinding: MovieItemActivityBinding) :
        RecyclerView.ViewHolder(itemActivityBinding.root) {
        fun bindItem(castModel: CastModel) {
            itemActivityBinding.imageView.setImageResource(castModel.movieImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = MovieItemActivityBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(movie[position])
    }

    override fun getItemCount(): Int {
        return movie.size
    }
}