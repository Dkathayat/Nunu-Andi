package com.example.todo

import android.app.TaskStackBuilder.create
import android.media.AudioAttributes
import android.media.AudioManager
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*
import android.media.MediaPlayer.create as create1

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var mediaplayer = MediaPlayer.create(this,R.raw.andasong)

        imageView.setOnClickListener{
                imageView.setImageResource(R.drawable.yash)
                //mediaplayer = create(R.raw.andasong)
                mediaplayer.start()
                }

            }


        }
//val audioUrl = "https://www.youtube.com/watch?v=AX8Ik8QHk1E"
//mediaplayer = MediaPlayer()
//mediaplayer!!.setAudioStreamType(AudioManager.STREAM_MUSIC)