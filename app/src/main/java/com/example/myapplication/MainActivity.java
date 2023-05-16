package com.example.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton play , pause , stop;
    MediaPlayer mediaPlayer;
    boolean isPlaying = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = findViewById(R.id.play);
        pause = findViewById(R.id.pause);
        stop = findViewById(R.id.stop);

        mediaPlayer=MediaPlayer.create(this, R.raw.a);


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isPlaying) {
                    mediaPlayer.start();
                    isPlaying = true;
                }
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                    isPlaying = false;
                }
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                    mediaPlayer.seekTo(0);
                    isPlaying = false;
                }
            }
        });


    }
}