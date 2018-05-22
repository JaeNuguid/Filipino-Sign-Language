package com.bcs.fsl.filipinosignlanguage;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.ArrayList;
import java.util.Collections;

public class Greetings extends AppCompatActivity {


    public ArrayList<Sign> Signs = new ArrayList<Sign>();
    public VideoView video;
    public TextView title;
    public int index =0;



    public void initiateSigns(){
        Signs.add(new Sign("saan","Where?"));
        Signs.add(new Sign("saankagaling","Where are you from?"));
        Signs.add(new Sign("saankapupunta","Where are you going?"));

        Signs.add(new Sign("pano","How?"));
        Signs.add(new Sign("maybe","Maybe"));
        Signs.add(new Sign("maybenot","Maybe not"));
        Signs.add(new Sign("magkano","How much?"));
        Signs.add(new Sign("mahalmobasiya","Do you love her?"));
        Signs.add(new Sign("ooohinde","Yes Or No?"));
        Signs.add(new Sign("pasensiyana","I'm Sorry"));
        Signs.add(new Sign("kailan","When?"));
        Signs.add(new Sign("kailanbirthdaymo","When is your birthday?"));

        Signs.add(new Sign("ilan","How Many?"));
        Signs.add(new Sign("ilangtaonkana","How old are you?"));
        Signs.add(new Sign("ilankayongmagkakapatid","How many siblings do you have?"));

        Signs.add(new Sign("goodafternoon","Good afternoon"));
        Signs.add(new Sign("goodmorning","Good morning"));
        Signs.add(new Sign("goodnight","Good night"));
        Signs.add(new Sign("goodweathertoday","Good weather today"));
        Signs.add(new Sign("explain","Explain"));
        Signs.add(new Sign("ahh","I see"));
        Signs.add(new Sign("ano","What?"));
        Signs.add(new Sign("anoangrelihiyonmo","What's your religion?"));
        Signs.add(new Sign("anopaboritomongkulay","What's your favorite color?"));
        Signs.add(new Sign("anopaboritomongpagkain","What's your favorite food?"));
        Signs.add(new Sign("bakit","Why?"));
        Signs.add(new Sign("alamko","I know"));
        Signs.add(new Sign("hindikoalam","I don't know"));
        Signs.add(new Sign("hindikomaintindihan","I can't understand"));
        Signs.add(new Sign("naiintindihanko","I understand"));

        Signs.add(new Sign("sankanagaaral","Where are you studying?"));

        Signs.add(new Sign("sino","Who?"));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greetings);
        title = (TextView) findViewById(R.id.title);
        video = (VideoView) findViewById(R.id.imageView2);
        video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setVolume(0f, 0f);
                mp.setLooping(false);
            }
        });

        initiateSigns();
        Collections.shuffle(Signs);
        Sign s = Signs.get(0);


        String path = "android.resource://".concat(getPackageName()).concat("/raw/");
        Uri uri2 = Uri.parse(path+s.getFile());
        video.setVideoURI(uri2);
        video.requestFocus();
        video.start();

        title.setText(s.title);
    }
    public void goMenu(View v){
        Intent k = new Intent(this, MainActivity.class);
        startActivity(k);
    }


    public void goReplay(View v){
        video.start();

    }

    public void goNext(View v){

        index++;
        if(index  >= Signs.size()) index =0;
        Sign s = Signs.get(index);
        String path = "android.resource://".concat(getPackageName()).concat("/raw/");
        Uri uri2 = Uri.parse(path+s.getFile());
        video.setVideoURI(uri2);
        video.requestFocus();
        video.start();
        title.setText(s.title);
    }


    public void goPrevious(View v){
        index--;
        if(index  < 0) index = Signs.size()-1;
        Sign s = Signs.get(index);
        String path = "android.resource://".concat(getPackageName()).concat("/raw/");
        Uri uri2 = Uri.parse(path+s.getFile());
        video.setVideoURI(uri2);
        video.requestFocus();
        video.start();
        title.setText(s.title);

    }
}
