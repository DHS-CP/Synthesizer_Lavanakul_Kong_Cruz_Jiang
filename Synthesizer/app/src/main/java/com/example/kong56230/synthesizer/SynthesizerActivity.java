package com.example.kong56230.synthesizer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;

public class SynthesizerActivity extends AppCompatActivity {
    private static final String TAG = SynthesizerActivity.class.getName();
   
    public Button button1;
    public Button button2;
    public MediaPlayer mpA;
    public MediaPlayer mpB;
    public MediaPlayer mpC;
    public MediaPlayer mpCs;
    public MediaPlayer mpD;
    public MediaPlayer mpE;
    public MediaPlayer mpHighE;
    public MediaPlayer mpF;
    public MediaPlayer mpHFs;
    private MediaPlayer mpFs;
    private MediaPlayer mpG;
    private final int WHOLE_NOTE = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        Button button1 = (Button) findViewById(R.id.Button1);
        Button button2 = (Button) findViewById(R.id.Button2);

        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpC = MediaPlayer.create(this, R.raw.scalec);
        mpCs = MediaPlayer.create(this, R.raw.scalecs);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpHighE = MediaPlayer.create(this, R.raw.scalehighe);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpFs = MediaPlayer.create(this, R.raw.scalefs);
        mpHFs = MediaPlayer.create(this, R.raw.scalehighfs);
        mpG = MediaPlayer.create(this, R.raw.scaleg);
    }



    private void delayPlaying(int delay) throws InterruptedException {
        Log.e("SynthesizerActivity", "Challenge 0 Button clicked");
        try {
            Thread.sleep(delay); //
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void onButton1Click(View v) throws InterruptedException {
        mpE.seekTo(0);
        Log.i(TAG,"Button 1 Clicked");
        delayPlaying(WHOLE_NOTE/2);
        mpE.start();
        delayPlaying(WHOLE_NOTE/2);
        mpFs.start();
        delayPlaying(WHOLE_NOTE/2);
        mpG.start();
        delayPlaying(WHOLE_NOTE/2);
        mpA.start();
        delayPlaying(WHOLE_NOTE/2);
        mpB.start();
        delayPlaying(WHOLE_NOTE/2);
        mpCs.start();
        delayPlaying(WHOLE_NOTE/2);
        mpD.start();
        delayPlaying(WHOLE_NOTE/2);
        mpE.start();
        delayPlaying(WHOLE_NOTE/2);

    }

    public void onButton2Click(View v) throws InterruptedException {

        mpA.seekTo(0);
        Log.i(TAG,"Button 2 Clicked");
        delayPlaying(WHOLE_NOTE/2);
        mpA.start();
        delayPlaying(WHOLE_NOTE);
        mpA.pause();

        mpA.seekTo(0);
        mpA.start();
        delayPlaying(WHOLE_NOTE);
        mpA.pause();

        mpHighE.seekTo(0);
        mpHighE.start();
        delayPlaying(WHOLE_NOTE);
        mpHighE.pause();

        mpHighE.seekTo(0);
        mpHighE.start();
        delayPlaying(WHOLE_NOTE);
        mpHighE.pause();

        mpHFs.seekTo(0);
        mpHFs.start();
        delayPlaying(WHOLE_NOTE);
        mpHFs.pause();

        mpHFs.seekTo(0);
        mpHFs.start();
        delayPlaying(WHOLE_NOTE);
        mpHFs.pause();

        mpHighE.seekTo(0);
        mpHighE.start();
        delayPlaying(WHOLE_NOTE);
        mpHighE.pause();

        mpD.seekTo(0);
        mpD.start();
        delayPlaying(WHOLE_NOTE);
        mpD.pause();

        mpD.seekTo(0);
        mpD.start();
        delayPlaying(WHOLE_NOTE);
        mpD.pause();

        mpCs.seekTo(0);
        mpCs.start();
        delayPlaying(WHOLE_NOTE);
        mpCs.pause();

        mpCs.seekTo(0);
        mpCs.start();
        delayPlaying(WHOLE_NOTE);
        mpCs.pause();

        mpB.seekTo(0);
        mpB.start();
        delayPlaying(WHOLE_NOTE);
        mpB.pause();

        mpB.seekTo(0);
        mpB.start();
        delayPlaying(WHOLE_NOTE);
        mpB.pause();

        mpA.seekTo(0);
        mpA.start();
        delayPlaying(WHOLE_NOTE);
        mpA.pause();
        }
        public void onButton3Click(View V) throws InterruptedException{
            mpA.seekTo(0);
            Log.i(TAG,"Button 3 Clicked");
            mpA.start();
            delayPlaying(WHOLE_NOTE);
            mpA.pause();
            mpA.seekTo(0);
            mpA.start();
            delayPlaying(WHOLE_NOTE);
            mpA.pause();
            mpA.seekTo(0);
            mpHighE.start();
            delayPlaying(WHOLE_NOTE);
            mpHighE.pause();
            mpHighE.seekTo(0);
            mpHighE.start();
            delayPlaying(WHOLE_NOTE);
            mpHighE.pause();
            mpHighE.seekTo(0);
            mpHFs.start();
            delayPlaying(WHOLE_NOTE);
            mpHFs.pause();
            mpHFs.seekTo(0);
            mpHFs.start();
            delayPlaying(WHOLE_NOTE);
            mpHFs.pause();
            mpHFs.seekTo(0);
            mpHighE.start();
            delayPlaying(WHOLE_NOTE);
            delayPlaying(WHOLE_NOTE);
            mpHighE.pause();
            mpHighE.seekTo(0);
            mpD.start();
            delayPlaying(WHOLE_NOTE);
            mpD.pause();
            mpD.seekTo(0);
            mpD.start();
            delayPlaying(WHOLE_NOTE);
            mpD.pause();
            mpD.seekTo(0);
            mpCs.start();
            delayPlaying(WHOLE_NOTE);
            mpCs.pause();
            mpCs.seekTo(0);
            mpCs.start();
            delayPlaying(WHOLE_NOTE);
            mpCs.pause();
            mpCs.seekTo(0);
            mpB.start();
            delayPlaying(WHOLE_NOTE);
            mpB.pause();
            mpB.seekTo(0);
            mpB.start();
            delayPlaying(WHOLE_NOTE);
            mpB.pause();
            mpB.seekTo(0);
            mpA.start();
            delayPlaying(WHOLE_NOTE);
            delayPlaying(WHOLE_NOTE);
            mpA.pause();
            mpA.seekTo(0);
            mpHighE.start();
            delayPlaying(WHOLE_NOTE);
            mpHighE.pause();
            mpHighE.seekTo(0);
            mpHighE.start();
            delayPlaying(WHOLE_NOTE);
            mpHighE.pause();
            mpHighE.seekTo(0);
            mpD.start();
            delayPlaying(WHOLE_NOTE);
            mpD.pause();
            mpD.seekTo(0);
            mpD.start();
            delayPlaying(WHOLE_NOTE);
            mpD.pause();
            mpD.seekTo(0);
            mpCs.start();
            delayPlaying(WHOLE_NOTE);
            mpCs.pause();
            mpCs.seekTo(0);
            mpCs.start();
            delayPlaying(WHOLE_NOTE);
            mpCs.pause();
            mpCs.seekTo(0);
            mpB.start();
            delayPlaying(WHOLE_NOTE);
            delayPlaying(WHOLE_NOTE);
            mpB.pause();
            mpB.seekTo(0);
            mpHighE.start();
            delayPlaying(WHOLE_NOTE);
            mpHighE.pause();
            mpHighE.seekTo(0);
            mpHighE.start();
            delayPlaying(WHOLE_NOTE);
            mpHighE.pause();
            mpHighE.seekTo(0);
            mpD.start();
            delayPlaying(WHOLE_NOTE);
            mpD.pause();
            mpD.seekTo(0);
            mpD.start();
            delayPlaying(WHOLE_NOTE);
            mpD.pause();
            mpD.seekTo(0);
            mpCs.start();
            delayPlaying(WHOLE_NOTE);
            mpCs.pause();
            mpCs.seekTo(0);
            mpCs.start();
            delayPlaying(WHOLE_NOTE);
            mpCs.pause();
            mpCs.seekTo(0);
            mpB.start();
            delayPlaying(WHOLE_NOTE);
            delayPlaying(WHOLE_NOTE);
            mpB.pause();
            mpB.seekTo(0);
            mpA.start();
            delayPlaying(WHOLE_NOTE);
            mpA.pause();
            mpA.seekTo(0);
            mpA.start();
            delayPlaying(WHOLE_NOTE);
            mpA.pause();
            mpA.seekTo(0);
            mpHighE.start();
            delayPlaying(WHOLE_NOTE);
            mpHighE.pause();
            mpHighE.seekTo(0);
            mpHighE.start();
            delayPlaying(WHOLE_NOTE);
            mpHighE.pause();
            mpHighE.seekTo(0);
            mpHFs.start();
            delayPlaying(WHOLE_NOTE);
            mpHFs.pause();
            mpHFs.seekTo(0);
            mpHFs.start();
            delayPlaying(WHOLE_NOTE);
            mpHFs.pause();
            mpHFs.seekTo(0);
            mpHighE.start();
            delayPlaying(WHOLE_NOTE);
            delayPlaying(WHOLE_NOTE);
            mpHighE.pause();
            mpHighE.seekTo(0);
            mpD.start();
            delayPlaying(WHOLE_NOTE);
            mpD.pause();
            mpD.seekTo(0);
            mpD.start();
            delayPlaying(WHOLE_NOTE);
            mpD.pause();
            mpD.seekTo(0);
            mpCs.start();
            delayPlaying(WHOLE_NOTE);
            mpCs.pause();
            mpCs.seekTo(0);
            mpCs.start();
            delayPlaying(WHOLE_NOTE);
            mpCs.pause();
            mpCs.seekTo(0);
            mpB.start();
            delayPlaying(WHOLE_NOTE);
            mpB.pause();
            mpB.seekTo(0);
            mpB.start();
            delayPlaying(WHOLE_NOTE);
            mpB.pause();
            mpB.seekTo(0);
            mpA.start();
            delayPlaying(WHOLE_NOTE);
            delayPlaying(WHOLE_NOTE);
            mpA.pause();
            mpA.seekTo(0);

        }
    }

