package com.bcs.fsl.filipinosignlanguage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Alphabets extends AppCompatActivity {


    public ArrayList<Sign> Signs = new ArrayList<Sign>();
    public ImageView image;
    public TextView title;
    public int index =0;

    public void initiateAlphabets(){

        Signs.add(new Sign(R.drawable.a+"","letter 'A'"));
        Signs.add(new Sign(R.drawable.b+"","letter 'B'"));
        Signs.add(new Sign(R.drawable.c+"","letter 'C'"));
        Signs.add(new Sign(R.drawable.d+"","letter 'D'"));
        Signs.add(new Sign(R.drawable.e+"","letter 'E'"));
        Signs.add(new Sign(R.drawable.f+"","letter 'F'"));
        Signs.add(new Sign(R.drawable.g+"","letter 'G'"));
        Signs.add(new Sign(R.drawable.h+"","letter 'H'"));
        Signs.add(new Sign(R.drawable.i+"","letter 'I'"));
        Signs.add(new Sign(R.drawable.j+"","letter 'J'"));
        Signs.add(new Sign(R.drawable.k+"","letter 'K'"));
        Signs.add(new Sign(R.drawable.l+"","letter 'L'"));
        Signs.add(new Sign(R.drawable.n+"","letter 'M'"));
        Signs.add(new Sign(R.drawable.m+"","letter 'N'"));
        Signs.add(new Sign(R.drawable.o+"","letter 'O'"));
        Signs.add(new Sign(R.drawable.p+"","letter 'P'"));
        Signs.add(new Sign(R.drawable.q+"","letter 'Q'"));
        Signs.add(new Sign(R.drawable.r+"","letter 'R'"));
        Signs.add(new Sign(R.drawable.s+"","letter 'S'"));
        Signs.add(new Sign(R.drawable.t+"","letter 'T'"));
        Signs.add(new Sign(R.drawable.u+"","letter 'U'"));
        Signs.add(new Sign(R.drawable.v+"","letter 'V'"));
        Signs.add(new Sign(R.drawable.w+"","letter 'W'"));
        Signs.add(new Sign(R.drawable.x+"","letter 'X'"));
        Signs.add(new Sign(R.drawable.y+"","letter 'Y'"));
        Signs.add(new Sign(R.drawable.z+"","letter 'Z'"));
        }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);
        title = (TextView) findViewById(R.id.title);
        image = (ImageView) findViewById(R.id.imageView2);
        initiateAlphabets();
    }

    public void goMenu(View v){
        Intent k = new Intent(this, MainActivity.class);
        startActivity(k);
    }

    public void goNext(View v){
        index++;

        if(index  >= Signs.size()) index =0;
        Sign s = Signs.get(index);
        image.setImageResource(Integer.parseInt(s.getFile()));
        title.setText(s.title);
    }


    public void goPrevious(View v){
        index--;

        if(index  < 0) index = Signs.size()-1;
        Sign s = Signs.get(index);
        image.setImageResource(Integer.parseInt(s.getFile()));
        title.setText(s.title);

    }

}
