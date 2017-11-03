package com.example.kong56230.synthesizer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SynthesizerActivity extends AppCompatActivity {
    private static final String TAG = SynthesizerActivity.class.getName();
    private Button button1;
    private Button button2;
    private MediaPlayer mpA;
    private MediaPlayer mpB;
    private MediaPlayer mpC;
    private MediaPlayer mpCs;
    private MediaPlayer mpD;
    private MediaPlayer mpE;
    private MediaPlayer mpEE;
    private MediaPlayer mpF;
    private MediaPlayer mpFF;
    private final int WHOLE_NOTE = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        Button button1 = (Button) findViewById(R.id.adelebutton);
        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpEE = MediaPlayer.create(this, R.raw.scalef);
        mpFF = MediaPlayer.create(this, R.raw.scalehighfs);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpC = MediaPlayer.create(this, R.raw.scalec);
        mpCs = MediaPlayer.create(this, R.raw.scalecs);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);

    }



    private void delayPlaying(int delay) throws InterruptedException {
        Log.e("SynthesizerActivity", "Challenge 0 Button clicked");
        try {
            mpE.start();
            delayPlaying(WHOLE_NOTE);
            mpF.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void onButton1Click(View v) {
        mpE.seekTo(0);
        Log.i(TAG,"Button 1 Clicked");
        mpA.start();

    }
    public void onButton2Click(View v) throws InterruptedException {
        mpE.seekTo(0);
        mpEE.seekTo(0);
        mpA.seekTo(0);
        mpFF.seekTo(0);
        mpD.seekTo(0);
        mpCs.seekTo(0);
        mpB.seekTo(0);
        mpA.seekTo(0);
        Log.i(TAG,"Button 2 Clicked");
        mpA.start();
        delayPlaying(300);
        mpA.start();
        delayPlaying(300);
        mpEE.start();
        delayPlaying(300);
        mpEE.start();
        delayPlaying(300);
        mpFF.start();
        delayPlaying(300);
        mpFF.start();
        delayPlaying(300);
        mpEE.start();
        delayPlaying(300);
        mpD.start();
        delayPlaying(300);
        mpD.start();
        delayPlaying(300);
        mpCs.start();
        delayPlaying(300);
        mpCs.start();
        delayPlaying(300);
        mpB.start();
        delayPlaying(300);
        mpB.start();
        delayPlaying(300);
        mpA.start();
        delayPlaying(300);
    }
}