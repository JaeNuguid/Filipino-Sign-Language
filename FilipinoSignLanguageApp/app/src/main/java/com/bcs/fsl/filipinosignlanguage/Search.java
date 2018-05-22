package com.bcs.fsl.filipinosignlanguage;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.VideoView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Search extends AppCompatActivity {


    public ArrayList<Sign> Signs = new ArrayList<Sign>();
    public EditText text;
    public VideoView video;
    public void initiateSigns(){

        Signs.add(new Sign("n1","1"));
        Signs.add(new Sign("n2","2"));
        Signs.add(new Sign("n3","3"));
        Signs.add(new Sign("n4","4"));
        Signs.add(new Sign("n5","5"));
        Signs.add(new Sign("n6","6"));
        Signs.add(new Sign("n7","7"));
        Signs.add(new Sign("n8","8"));
        Signs.add(new Sign("n9","9"));
        Signs.add(new Sign("n10","10"));
        Signs.add(new Sign("n11","11"));
        Signs.add(new Sign("n12","12"));
        Signs.add(new Sign("n13","13"));
        Signs.add(new Sign("n14","14"));
        Signs.add(new Sign("n15","15"));
        Signs.add(new Sign("n16","16"));
        Signs.add(new Sign("n17","17"));
        Signs.add(new Sign("n18","18"));
        Signs.add(new Sign("n19","19"));
        Signs.add(new Sign("n20","20"));
        Signs.add(new Sign("n21","21"));
        Signs.add(new Sign("n22","22"));
        Signs.add(new Sign("n23","23"));
        Signs.add(new Sign("n24","24"));
        Signs.add(new Sign("n25","25"));
        Signs.add(new Sign("n26","26"));
        Signs.add(new Sign("n27","27"));
        Signs.add(new Sign("n28","28"));
        Signs.add(new Sign("n29","29"));
        Signs.add(new Sign("n30","30"));
        Signs.add(new Sign("n31","31"));
        Signs.add(new Sign("n32","32"));
        Signs.add(new Sign("n33","33"));
        Signs.add(new Sign("n34","34"));
        Signs.add(new Sign("n35","35"));
        Signs.add(new Sign("n36","36"));
        Signs.add(new Sign("n37","37"));
        Signs.add(new Sign("n38","38"));
        Signs.add(new Sign("n39","39"));
        Signs.add(new Sign("n40","40"));
        Signs.add(new Sign("n41","41"));
        Signs.add(new Sign("n42","42"));
        Signs.add(new Sign("n43","43"));
        Signs.add(new Sign("n44","44"));
        Signs.add(new Sign("n45","45"));
        Signs.add(new Sign("n46","46"));
        Signs.add(new Sign("n47","47"));
        Signs.add(new Sign("n48","48"));
        Signs.add(new Sign("n49","49"));
        Signs.add(new Sign("n50","50"));
        Signs.add(new Sign("n51","51"));
        Signs.add(new Sign("n52","52"));
        Signs.add(new Sign("n53","53"));
        Signs.add(new Sign("n54","54"));
        Signs.add(new Sign("n55","55"));
        Signs.add(new Sign("n56","56"));
        Signs.add(new Sign("n57","57"));
        Signs.add(new Sign("n58","58"));
        Signs.add(new Sign("n59","59"));
        Signs.add(new Sign("n60","60"));
        Signs.add(new Sign("n61","61"));
        Signs.add(new Sign("n62","62"));
        Signs.add(new Sign("n63","63"));
        Signs.add(new Sign("n64","64"));
        Signs.add(new Sign("n65","65"));
        Signs.add(new Sign("n66","66"));
        Signs.add(new Sign("n67","67"));
        Signs.add(new Sign("n68","68"));
        Signs.add(new Sign("n69","69"));
        Signs.add(new Sign("n70","70"));
        Signs.add(new Sign("n71","71"));
        Signs.add(new Sign("n72","72"));
        Signs.add(new Sign("n73","73"));
        Signs.add(new Sign("n74","74"));
        Signs.add(new Sign("n75","75"));
        Signs.add(new Sign("n76","76"));
        Signs.add(new Sign("n77","77"));
        Signs.add(new Sign("n78","78"));
        Signs.add(new Sign("n79","79"));
        Signs.add(new Sign("n80","80"));
        Signs.add(new Sign("n81","81"));
        Signs.add(new Sign("n82","82"));
        Signs.add(new Sign("n83","83"));
        Signs.add(new Sign("n84","84"));
        Signs.add(new Sign("n85","85"));
        Signs.add(new Sign("n86","86"));
        Signs.add(new Sign("n87","87"));
        Signs.add(new Sign("n88","88"));
        Signs.add(new Sign("n89","89"));
        Signs.add(new Sign("n90","90"));
        Signs.add(new Sign("n91","91"));
        Signs.add(new Sign("n92","92"));
        Signs.add(new Sign("n93","93"));
        Signs.add(new Sign("n94","94"));
        Signs.add(new Sign("n95","95"));
        Signs.add(new Sign("n96","96"));
        Signs.add(new Sign("n97","97"));
        Signs.add(new Sign("n98","98"));
        Signs.add(new Sign("n99","99"));
        Signs.add(new Sign("n100","100"));
        Signs.add(new Sign("saan","Where?"));
        Signs.add(new Sign("saankagaling","Where Are You From?"));
        Signs.add(new Sign("saankapupunta","Where Are You Going?"));

        Signs.add(new Sign("pano","How?"));

        Signs.add(new Sign("ooohinde","Yes Or No?"));
        Signs.add(new Sign("pasensiyana","I'm Sorry"));
        Signs.add(new Sign("kailan","When?"));
        Signs.add(new Sign("kailanbirthdaymo","When Is Your Birthay?"));

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
        setContentView(R.layout.activity_search);
        text = (EditText) findViewById(R.id.text);
        video = (VideoView) findViewById(R.id.imageView2);
        video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setVolume(0f, 0f);
                mp.setLooping(false);
            }
        });

        initiateSigns();
    }


    public static double similarity(String s1, String s2) {
        String longer = s1, shorter = s2;
        if (s1.length() < s2.length()) { // longer should always have greater length
            longer = s2; shorter = s1;
        }
        int longerLength = longer.length();
        if (longerLength == 0) { return 1.0; /* both strings are zero length */ }
        return (longerLength - editDistance(longer, shorter)) / (double) longerLength;
    }

    public void goSearch(View v){
    String txt = text.getText().toString();
    HashMap<Sign, Double> score = new HashMap<Sign, Double>();

    for(Sign s : Signs){
            score.put(s, similarity(txt,s.title));
    }
        Double highest = -100.0;
            Sign jae = null;
        Map.Entry<Sign, Double> maxEntry = null;
        for (Map.Entry<Sign, Double> entry : score.entrySet()) {

            if(entry.getValue().doubleValue() > highest){
                highest = entry.getValue().doubleValue();
                jae = entry.getKey();
            }
            }
        String path = "android.resource://".concat(getPackageName()).concat("/raw/");
        Uri uri2 = Uri.parse(path+jae.getFile());
        video.setVideoURI(uri2);
        video.requestFocus();
        video.start();
        text.setText(""+jae.getTitle());
    }


    public void goReplay(View v){
        video.start();

    }

    public static int editDistance(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int[] costs = new int[s2.length() + 1];
        for (int i = 0; i <= s1.length(); i++) {
            int lastValue = i;
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0)
                    costs[j] = j;
                else {
                    if (j > 0) {
                        int newValue = costs[j - 1];
                        if (s1.charAt(i - 1) != s2.charAt(j - 1))
                            newValue = Math.min(Math.min(newValue, lastValue),
                                    costs[j]) + 1;
                        costs[j - 1] = lastValue;
                        lastValue = newValue;
                    }
                }
            }
            if (i > 0)
                costs[s2.length()] = lastValue;
        }
        return costs[s2.length()];
    }


    public void goMenu(View v){
        Intent k = new Intent(this, MainActivity.class);
        startActivity(k);
    }
}
