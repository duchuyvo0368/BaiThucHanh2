package com.voduchuy.baithuchanh2.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.voduchuy.baithuchanh2.Model.Music
import com.voduchuy.baithuchanh2.databinding.ItemMusicBinding

class MusicViewHolder private constructor(
    private val binding: ItemMusicBinding
) : RecyclerView.ViewHolder(binding.root) {

    companion object {
        fun from(parent: ViewGroup): MusicViewHolder {
            val binding = ItemMusicBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return MusicViewHolder(binding)
        }
    }

    fun bind(music: Music) {
        binding.tvBaiHat.text = music.tenBaiHat
        binding.tenCaSi.text = music.tenCaSi
    }
}
