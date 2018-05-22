package com.bcs.fsl.filipinosignlanguage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void goAlphabets(View v){
        Intent k = new Intent(this, Alphabets.class);
        startActivity(k);
    }
    public void goNumbers(View v){
        Intent k = new Intent(this, Numbers.class);
        startActivity(k);
    }
    public void goBasicSigns(View v){
        Intent k = new Intent(this, BasicSigns.class);
        startActivity(k);
    }
    public void goSearch(View v){
        Intent k = new Intent(this, Search.class);
        startActivity(k);
    }
    public void goGreetings(View v){
        Intent k = new Intent(this, Greetings.class);
        startActivity(k);
    }
    public void goQuiz(View v){
        Intent k = new Intent(this, Quiz.class);
        startActivity(k);
    }

}
