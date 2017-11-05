package com.example.zhu56662.synthesizer;

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
    private MediaPlayer mpE;
    private MediaPlayer mpFs;
    private MediaPlayer mpG;
    private MediaPlayer mpA;
    private MediaPlayer mpB;
    private MediaPlayer mpCs;
    private MediaPlayer mpD;
    private final int WHOLE_NOTE = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        button1 = (Button)findViewById(R.id.babyButton);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpFs = MediaPlayer.create(this, R.raw.scalefs);
        mpG = MediaPlayer.create(this, R.raw.scaleg);
        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpCs = MediaPlayer.create(this, R.raw.scalecs);
        mpD = MediaPlayer.create(this, R.raw.scaled);
    }

    private void delayPlaying(int delay) throws InterruptedException{
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity","Audio playback interrupted");
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

}
