package com.example.BammidiSaiChandraSekharAssignmentThree;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;


public class splashja extends Activity {

    Handler handler;
    ProgressBar pb;
    Timer time;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(splashja.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },5000);
        pb=findViewById(R.id.progress);
        time=new Timer();
        TimerTask tt=new TimerTask() {
            @Override
            public void run() {
                count++;
                pb.setProgress(count);
                if(count==100)
                {
                  time.cancel();
                }
            }
        };
        time.schedule(tt,0,100);
    }
}
