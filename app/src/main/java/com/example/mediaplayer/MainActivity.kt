package com.example.mediaplayer

import android.media.MediaPlayer
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mediaplayer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mediaDo = MediaPlayer.create(this, R.raw.zvuk_notyi_do)
        val mediaRe = MediaPlayer.create(this, R.raw.zvuk_notyi_re)
        val mediaMi = MediaPlayer.create(this, R.raw.zvuk_notyi_mi)
        val mediaFa = MediaPlayer.create(this, R.raw.zvuk_notyi_fa)
        val mediaSol = MediaPlayer.create(this, R.raw.zvuk_notyi_sol)
        val mediaLya = MediaPlayer.create(this, R.raw.zvuk_notyi_lya)
        val mediaSi = MediaPlayer.create(this, R.raw.zvuk_notyi_si)
        val mediaDo2 = MediaPlayer.create(this, R.raw.zvuk_notyi_do_vo_vtoroy_oktave)

        binding.btnDo.setOnClickListener {
            mediaDo.start()
        }

        binding.btnRe.setOnClickListener {
            mediaRe.start()
        }

        binding.btnMi.setOnClickListener {
            mediaMi.start()
        }

        binding.btnFa.setOnClickListener {
            mediaFa.start()
        }

        binding.btnSol.setOnClickListener {
            mediaSol.start()
        }

        binding.btnLa.setOnClickListener {
            mediaLya.start()
        }

        binding.btnSi.setOnClickListener {
            mediaSi.start()
        }

        binding.btnDo2.setOnClickListener {
            mediaDo2.start()
        }
    }
}