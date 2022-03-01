package com.voduchuy.baithuchanh2.Adapter

import android.os.Parcel
import android.os.Parcelable
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.voduchuy.baithuchanh2.Adapter.MusicAdapter.*
import com.voduchuy.baithuchanh2.Model.Music

class MusicAdapter(
    private val listMusics: List<Music>
) : RecyclerView.Adapter<MusicViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MusicViewHolder.from(parent)

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.bind(listMusics[position])
    }

    override fun getItemCount() = listMusics.size
}
