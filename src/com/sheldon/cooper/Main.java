package com.sheldon.cooper;

import android.app.Activity;
import android.os.Bundle;
import android.media.MediaPlayer;

public class Main extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        play();
    }

    public void play(){
    	MediaPlayer music = MediaPlayer.create(Main.this,R.raw.s_bazinga);
    	music.start();
    }
}
