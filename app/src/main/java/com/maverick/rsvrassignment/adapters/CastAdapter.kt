package com.maverick.rsvrassignment.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.maverick.rsvrassignment.databinding.CastItemActivityBinding
import com.maverick.rsvrassignment.model.CastModel

class CastAdapter(private val castList: ArrayList<CastModel>) :
    RecyclerView.Adapter<CastAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = CastItemActivityBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(castList[position])
    }

    override fun getItemCount(): Int {
        return castList.size
    }

    class ViewHolder(var itemActivityBinding: CastItemActivityBinding) :
        RecyclerView.ViewHolder(itemActivityBinding.root) {
        fun bindItem(castModel: CastModel) {
            itemActivityBinding.imageView.setImageResource(castModel.image)
            itemActivityBinding.name.text = castModel.name
        }
    }
}