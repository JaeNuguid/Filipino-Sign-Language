package com.bcs.fsl.filipinosignlanguage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread myThread = new Thread(){
            @Override
            public void run(){
                try {
                    sleep(3000);
                    Intent k = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(k);
                    finish();
                } catch (Exception e){

                }
            }
        };

        myThread.start();
    }
}
