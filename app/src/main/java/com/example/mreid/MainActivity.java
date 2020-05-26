package com.example.mreid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView app_logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        app_logo = (ImageView) findViewById(R.id.app_logo);
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.myanimation);
        app_logo.startAnimation(myanim);
        final Intent intent = new Intent(MainActivity.this, IntroActivity.class);
        Thread timer = new Thread(){
            public void run (){
                try {
                    sleep(6000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(intent);
                    finish();

                }

            }
        };
        timer.start();
    }
}
