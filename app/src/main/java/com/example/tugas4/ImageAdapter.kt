package com.example.tugas4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.compose.ui.layout.Layout
import androidx.recyclerview.widget.RecyclerView




class ImageAdapter (private  val wisataList: ArrayList<Image>):
        RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

    var onItemClick: ((Image) -> Unit)? = null

    class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id._image)
        val imageTitle: TextView = itemView.findViewById(R.id._imageTitle)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.activity_image, parent,
            false
        )
        return ImageViewHolder(view)

    }

    override fun getItemCount(): Int {
        return wisataList.size
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val wisata = wisataList[position]
        holder.imageView.setImageResource(wisata.imageSource)
        holder.imageTitle.text = wisata.imageTitle

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(wisata)
        }

    }
}



