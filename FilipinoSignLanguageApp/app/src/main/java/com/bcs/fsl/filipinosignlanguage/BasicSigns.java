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

public class BasicSigns extends AppCompatActivity {


    public ArrayList<Sign> Signs = new ArrayList<Sign>();
    public VideoView video;
    public TextView title;
    public int index =0;

    public void initiateSigns(){


        Signs.add(new Sign("black","Black"));
        Signs.add(new Sign("blond","Blond"));
        Signs.add(new Sign("brown","Brown"));
        Signs.add(new Sign("brown","Brown"));
        Signs.add(new Sign("gray","Gray"));
        Signs.add(new Sign("green","Green"));
        Signs.add(new Sign("maroon","Maroon"));
        Signs.add(new Sign("orange","Orange"));
        Signs.add(new Sign("pink","Pink"));
        Signs.add(new Sign("purple","Purple"));
        Signs.add(new Sign("red","Red"));
        Signs.add(new Sign("tan","Tan"));
        Signs.add(new Sign("violet","Violet"));
        Signs.add(new Sign("white","White"));
        Signs.add(new Sign("yellow","Yellow"));

        Signs.add(new Sign("angel","Angel"));

        Signs.add(new Sign("april","April"));
        Signs.add(new Sign("argue","Argue"));
        Signs.add(new Sign("august","August"));
        Signs.add(new Sign("breakfast","Breakfast"));
        Signs.add(new Sign("calm","Calm"));
        Signs.add(new Sign("cereal","Cereal"));
        Signs.add(new Sign("chatter","Chatter"));
        Signs.add(new Sign("chew","Chew"));
        Signs.add(new Sign("christ","Christ"));
        Signs.add(new Sign("comfort","Comfort"));
        Signs.add(new Sign("communicate","Communicate"));
        Signs.add(new Sign("cry","Cry"));
        Signs.add(new Sign("day","Day"));
        Signs.add(new Sign("debate","Debate"));
        Signs.add(new Sign("december","December"));
        Signs.add(new Sign("describe","Describe"));
        Signs.add(new Sign("devil","Devil"));
        Signs.add(new Sign("dinner","Dinner"));
        Signs.add(new Sign("discuss","Discuss"));
        Signs.add(new Sign("divine","Divine"));
        Signs.add(new Sign("drink","Drink"));
        Signs.add(new Sign("dry","Dry"));
        Signs.add(new Sign("eat","Eat"));
        Signs.add(new Sign("emotion","Emotion"));
        Signs.add(new Sign("excite","Excite"));

        Signs.add(new Sign("feat","feat"));
        Signs.add(new Sign("febuary","February"));
        Signs.add(new Sign("feel","Feel"));
        Signs.add(new Sign("flexible","Flexible"));
        Signs.add(new Sign("food","Food"));
        Signs.add(new Sign("friday","Friday"));
        Signs.add(new Sign("gentle","Gentle"));
        Signs.add(new Sign("glory","Glory"));
        Signs.add(new Sign("god","God"));

        Signs.add(new Sign("grief","Grief"));
        Signs.add(new Sign("happy","Happy"));
        Signs.add(new Sign("hard","Hard"));
        Signs.add(new Sign("heaven","Heaven"));
        Signs.add(new Sign("hell","Hell"));
        Signs.add(new Sign("holy","Holy"));
        Signs.add(new Sign("hot","Hot"));
        Signs.add(new Sign("icantsee","I can't see"));
        Signs.add(new Sign("inspire","Inspire"));
        Signs.add(new Sign("interview","Interview"));
        Signs.add(new Sign("january","January"));
        Signs.add(new Sign("jesus","Jesus Christ"));
        Signs.add(new Sign("joy","Joy"));
        Signs.add(new Sign("july","July"));
        Signs.add(new Sign("june","June"));

        Signs.add(new Sign("laugh","Laugh"));
        Signs.add(new Sign("lazy","Lazy"));
        Signs.add(new Sign("lord","Lord"));
        Signs.add(new Sign("lunch","Lunch"));
        Signs.add(new Sign("march","March"));
        Signs.add(new Sign("may","May"));

        Signs.add(new Sign("mayonaise","Mayonnaise"));
        Signs.add(new Sign("meal","Meal"));
        Signs.add(new Sign("mercy","Mercy"));
        Signs.add(new Sign("miracle","Miracle"));
        Signs.add(new Sign("monday","Monday"));
        Signs.add(new Sign("months","Months"));
        Signs.add(new Sign("mood","Mood"));
        Signs.add(new Sign("november","November"));
        Signs.add(new Sign("october","October"));
        Signs.add(new Sign("oral","Oral"));
        Signs.add(new Sign("peace","Peace"));
        Signs.add(new Sign("pepper","Pepper"));
        Signs.add(new Sign("pink","Pink"));
        Signs.add(new Sign("pity","Pity"));
        Signs.add(new Sign("purple","Purple"));

        Signs.add(new Sign("sad","Sad"));
        Signs.add(new Sign("salt","Salt"));
        Signs.add(new Sign("saturday","Saturday"));
        Signs.add(new Sign("scold","Scold"));
        Signs.add(new Sign("september","September"));
        Signs.add(new Sign("shameless","Shameless"));
        Signs.add(new Sign("soft","Soft"));
        Signs.add(new Sign("solid","Solid"));
        Signs.add(new Sign("soul","Soul"));
        Signs.add(new Sign("speech","Speech"));
        Signs.add(new Sign("spirit","Spirit"));
        Signs.add(new Sign("strong","Strong"));
        Signs.add(new Sign("stuck","Stuck"));
        Signs.add(new Sign("sunday","Sunday"));
        Signs.add(new Sign("swallow","Swallow"));
        Signs.add(new Sign("talk","Talk"));
        Signs.add(new Sign("talkative","Talkative"));
        Signs.add(new Sign("tan","Tan"));
        Signs.add(new Sign("tell","Tell"));
        Signs.add(new Sign("thursday","Thursday"));
        Signs.add(new Sign("tired","Tired"));
        Signs.add(new Sign("trinity","Trinity"));
        Signs.add(new Sign("tuesday","Tuesday"));
        Signs.add(new Sign("turnleft","Turn Left"));
        Signs.add(new Sign("turnright","Turn Right"));
        Signs.add(new Sign("warn","warm"));
        Signs.add(new Sign("water","water"));
        Signs.add(new Sign("weak","weak"));
        Signs.add(new Sign("wednesday","Wednesday"));
        Signs.add(new Sign("week","Week"));
        Signs.add(new Sign("welcome","You're Welcome"));
        Signs.add(new Sign("welcomeguest","Welcome!"));
        Signs.add(new Sign("wet","Wet"));
        Signs.add(new Sign("year","Year"));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_signs);
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

    public void goReplay(View v){
        video.start();

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
