package com.voduchuy.baithuchanh2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.voduchuy.baithuchanh2.Model.Music
import com.voduchuy.baithuchanh2.databinding.ActivityAddMusic2Binding

class AddMusic : AppCompatActivity() {
    private lateinit var binding: ActivityAddMusic2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAddMusic2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLuu.setOnClickListener(View.OnClickListener {
            val name = binding.edtBaiHat.text.toString()
            val singer = binding.edtTenCaSi.text.toString()

            val music = Music(name, singer)

            MainActivity.Musics.add(music)


            finish()

        })
    }
}