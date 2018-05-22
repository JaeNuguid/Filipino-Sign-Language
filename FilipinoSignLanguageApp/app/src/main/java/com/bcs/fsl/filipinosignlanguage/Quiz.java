package com.bcs.fsl.filipinosignlanguage;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Dictionary;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Quiz extends AppCompatActivity {


    public ArrayList<Sign> Signs = new ArrayList<Sign>();
    public ArrayList<Sign> Questions = new ArrayList<Sign>();
    String correctAnswer = "";
    Button a,b,c,d;
    TextView title;
    public VideoView video;
    Random r = new Random();
    public int score = 0;
    public void initiateSigns(){
        Signs.add(new Sign("n1","number '1'"));
        Signs.add(new Sign("n2","number '2'"));
        Signs.add(new Sign("n3","number '3'"));
        Signs.add(new Sign("n4","number '4'"));
        Signs.add(new Sign("n5","number '5'"));
        Signs.add(new Sign("n6","number '6'"));
        Signs.add(new Sign("n7","number '7'"));
        Signs.add(new Sign("n8","number '8'"));
        Signs.add(new Sign("n9","number '9'"));
        Signs.add(new Sign("n10","number '10'"));
        Signs.add(new Sign("n11","number '11'"));
        Signs.add(new Sign("n12","number '12'"));
        Signs.add(new Sign("n13","number '13'"));
        Signs.add(new Sign("n14","number '14'"));
        Signs.add(new Sign("n15","number '15'"));
        Signs.add(new Sign("n16","number '16'"));
        Signs.add(new Sign("n17","number '17'"));
        Signs.add(new Sign("n18","number '18'"));
        Signs.add(new Sign("n19","number '19'"));
        Signs.add(new Sign("n20","number '20'"));
        Signs.add(new Sign("n21","number '21'"));
        Signs.add(new Sign("n22","number '22'"));
        Signs.add(new Sign("n23","number '23'"));
        Signs.add(new Sign("n24","number '24'"));
        Signs.add(new Sign("n25","number '25'"));
        Signs.add(new Sign("saan","Where?"));
        Signs.add(new Sign("saankagaling","Where Are You From?"));
        Signs.add(new Sign("saankapupunta","Where Are You Going?"));

        Signs.add(new Sign("pano","How?"));

        Signs.add(new Sign("ooohinde","Yes Or No?"));
        Signs.add(new Sign("pasensiyana","I'm Sorry"));
        Signs.add(new Sign("kailan","When?"));
        Signs.add(new Sign("kailanbirthdaymo","When Is Your Birthday?"));

        Signs.add(new Sign("ilan","How Many?"));
        Signs.add(new Sign("ilangtaonkana","How Old Are You?"));
        Signs.add(new Sign("ilankayongmagkakapatid","How Many Siblings Do You Have?"));

        Signs.add(new Sign("goodafternoon","Good Afternoon"));
        Signs.add(new Sign("goodmorning","Good Morning"));
        Signs.add(new Sign("goodnight","Good Night"));
        Signs.add(new Sign("goodweathertoday","Good Weather Today"));
        Signs.add(new Sign("explain","Explain"));
        Signs.add(new Sign("ahh","I see"));
        Signs.add(new Sign("ano","What?"));
        Signs.add(new Sign("anoangrelihiyonmo","What's your religion?"));
        Signs.add(new Sign("anopaboritomongkulay","What's your favorite color?"));
        Signs.add(new Sign("anopaboritomongpagkain","What's your favorite food?"));
        Signs.add(new Sign("bakit","Why?"));
        Signs.add(new Sign("alamko","I know"));
        Signs.add(new Sign("hindikoalam","I Don't Know"));
        Signs.add(new Sign("hindikomaintindihan","I Can't Understand"));
        Signs.add(new Sign("naiintindihanko","I Understand"));

        Signs.add(new Sign("sankanagaaral","Where Are You Studying?"));

        Signs.add(new Sign("sino","Who?"));
        Signs.add(new Sign("black","color 'Black'"));
        Signs.add(new Sign("blond","color 'Blond'"));
        Signs.add(new Sign("brown","color 'Brown'"));
        Signs.add(new Sign("brown","color 'Brown'"));
        Signs.add(new Sign("gray","color 'Gray'"));
        Signs.add(new Sign("green","color 'Green'"));
        Signs.add(new Sign("maroon","color 'Maroon'"));
        Signs.add(new Sign("orange","color 'Orange'"));
        Signs.add(new Sign("pink","color 'Pink'"));
        Signs.add(new Sign("purple","color 'Purple'"));
        Signs.add(new Sign("red","color 'Red'"));
        Signs.add(new Sign("tan","color 'Tan'"));
        Signs.add(new Sign("violet","color 'Violet'"));
        Signs.add(new Sign("white","color 'White'"));
        Signs.add(new Sign("yellow","color 'Yellow'"));

        Signs.add(new Sign("angel","Angel"));

        Signs.add(new Sign("april","month 'April'"));
        Signs.add(new Sign("argue","Argue"));
        Signs.add(new Sign("august","month 'August'"));
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
        Signs.add(new Sign("febuary","month 'February'"));
        Signs.add(new Sign("feel","Feel"));
        Signs.add(new Sign("flexible","Flexible"));
        Signs.add(new Sign("food","Food"));
        Signs.add(new Sign("friday","day 'Friday'"));
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
        Signs.add(new Sign("icantsee","I Can't See"));
        Signs.add(new Sign("inspire","Inspire"));
        Signs.add(new Sign("interview","Interview"));
        Signs.add(new Sign("january","month 'January'"));
        Signs.add(new Sign("jesus","Jesus Christ"));
        Signs.add(new Sign("joy","Joy"));
        Signs.add(new Sign("july","month 'July'"));
        Signs.add(new Sign("june","month 'June'"));

        Signs.add(new Sign("laugh","Laugh"));
        Signs.add(new Sign("lazy","Lazy"));
        Signs.add(new Sign("lord","Lord"));
        Signs.add(new Sign("lunch","Lunch"));
        Signs.add(new Sign("magkano","How Much?"));
        Signs.add(new Sign("mahalmobasiya","Do You Love Her/Him?"));
        Signs.add(new Sign("march","month 'March'"));
        Signs.add(new Sign("may","month 'May'"));
        Signs.add(new Sign("maybe","Maybe"));
        Signs.add(new Sign("maybeNot","Maybe not"));
        Signs.add(new Sign("mayonaise","Mayonnaise"));
        Signs.add(new Sign("meal","Meal"));
        Signs.add(new Sign("mercy","Mercy"));
        Signs.add(new Sign("miracle","Miracle"));
        Signs.add(new Sign("monday","day 'Monday'"));
        Signs.add(new Sign("months","Months"));
        Signs.add(new Sign("mood","Mood"));
        Signs.add(new Sign("november","month 'November'"));
        Signs.add(new Sign("october","month 'October'"));
        Signs.add(new Sign("oral","Oral"));
        Signs.add(new Sign("peace","Peace"));
        Signs.add(new Sign("pepper","Pepper"));
        Signs.add(new Sign("pink","Pink"));
        Signs.add(new Sign("pity","Pity"));
        Signs.add(new Sign("purple","Purple"));

        Signs.add(new Sign("sad","Sad"));
        Signs.add(new Sign("salt","Salt"));
        Signs.add(new Sign("saturday","day 'Saturday'"));
        Signs.add(new Sign("scold","Scold"));
        Signs.add(new Sign("september","month 'September'"));
        Signs.add(new Sign("shameless","Shameless"));
        Signs.add(new Sign("soft","Soft"));
        Signs.add(new Sign("solid","Solid"));
        Signs.add(new Sign("soul","Soul"));
        Signs.add(new Sign("speech","Speech"));
        Signs.add(new Sign("spirit","Spirit"));
        Signs.add(new Sign("strong","Strong"));
        Signs.add(new Sign("stuck","Stuck"));
        Signs.add(new Sign("sunday","day 'Sunday'"));
        Signs.add(new Sign("swallow","Swallow"));
        Signs.add(new Sign("talk","Talk"));
        Signs.add(new Sign("talkative","Talkative"));
        Signs.add(new Sign("tan","Tan"));
        Signs.add(new Sign("tell","Tell"));
        Signs.add(new Sign("thursday","day 'Thursday'"));
        Signs.add(new Sign("tired","Tired"));
        Signs.add(new Sign("trinity","Trinity"));
        Signs.add(new Sign("tuesday","day 'Tuesday'"));
        Signs.add(new Sign("turnleft","Turn Left"));
        Signs.add(new Sign("turnright","Turn Right"));
        Signs.add(new Sign("warm","warm"));
        Signs.add(new Sign("water","water"));
        Signs.add(new Sign("weak","weak"));
        Signs.add(new Sign("wednesday","day 'Wednesday'"));
        Signs.add(new Sign("week","Week"));
        Signs.add(new Sign("welcome","You're Welcome"));
        Signs.add(new Sign("welcomeguest","Welcome!"));
        Signs.add(new Sign("wet","Wet"));
        Signs.add(new Sign("year","Year"));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        title = (TextView) findViewById(R.id.title);
        video = (VideoView) findViewById(R.id.imageView2);
        a = (Button) findViewById(R.id.button1);
        b = (Button) findViewById(R.id.button2);
        c = (Button) findViewById(R.id.button3);
        d = (Button) findViewById(R.id.button4);
        initiateSigns();
        nextQuestion();

    }

    public void goMenu(View v){
        Intent k = new Intent(this, MainActivity.class);
        startActivity(k);
    }

    public void answer(View v){
        Button btn = (Button) v;
        String answer = btn.getText().toString();

        if(answer.equals(correctAnswer)){
            score += 3;
        }else{
            score -= 1;
        }
    title.setText("Score: "+score);


   nextQuestion();

   }


    public void goReplay(View v){
        video.start();

    }
   public void nextQuestion(){
        Questions.clear();
       Collections.shuffle(Signs);
       for(int x=0; x<4;x++)
           Questions.add(Signs.get(x));
       int ans = getRan();
       String path = "android.resource://".concat(getPackageName()).concat("/raw/");
       correctAnswer = Questions.get(ans).getTitle();
       Uri uri2 = Uri.parse(path+Questions.get(ans).getFile());
       video.setVideoURI(uri2);
       video.requestFocus();
       video.start();

       a.setText(Questions.get(0).getTitle());
       b.setText(Questions.get(1).getTitle());
       c.setText(Questions.get(2).getTitle());
       d.setText(Questions.get(3).getTitle());
   }

    public int getRan(){
        Random r = new Random();
        return  r.nextInt((3 - 0) + 1) + 0;
    }
}
