package com.hermawan.zalada;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash extends AppCompatActivity {
    private int waktu_loading=2000;
    Handler handler;
    MediaPlayer sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        sound = MediaPlayer.create(this, R.raw.lazada);
        sound.setLooping(false);
        sound.setVolume(1,1);
        sound.start();


        handler=new Handler(Looper.myLooper());
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splash=new Intent(splash.this, login.class);
                startActivity(splash);
                finish();
            }
        }, waktu_loading);
    }
}