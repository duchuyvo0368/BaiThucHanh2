package com.voduchuy.baithuchanh2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.voduchuy.baithuchanh2.Adapter.MusicAdapter
import com.voduchuy.baithuchanh2.Model.Music
import com.voduchuy.baithuchanh2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.listMusic.run {
            layoutManager=LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            adapter=MusicAdapter(Musics)

        }
        binding.btnThem.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, AddMusic::class.java)
            startActivity(intent)
        })
    }
    override fun onResume() {
        super.onResume()
        binding.listMusic.adapter?.notifyDataSetChanged()
    }

    companion object {
        val Musics = mutableListOf<Music>()
    }

}

