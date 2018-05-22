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

public class Numbers extends AppCompatActivity {

    public ArrayList<Sign> Signs = new ArrayList<Sign>();
    public VideoView video;
    public TextView title;
    public int index =0;

    public void initiateNumbers(){

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
        Signs.add(new Sign("n26","number '26'"));
        Signs.add(new Sign("n27","number '27'"));
        Signs.add(new Sign("n28","number '28'"));
        Signs.add(new Sign("n29","number '29'"));
        Signs.add(new Sign("n30","number '30'"));
        Signs.add(new Sign("n31","number '31'"));
        Signs.add(new Sign("n32","number '32'"));
        Signs.add(new Sign("n33","number '33'"));
        Signs.add(new Sign("n34","number '34'"));
        Signs.add(new Sign("n35","number '35'"));
        Signs.add(new Sign("n36","number '36'"));
        Signs.add(new Sign("n37","number '37'"));
        Signs.add(new Sign("n38","number '38'"));
        Signs.add(new Sign("n39","number '39'"));
        Signs.add(new Sign("n40","number '40'"));
        Signs.add(new Sign("n41","number '41'"));
        Signs.add(new Sign("n42","number '42'"));
        Signs.add(new Sign("n43","number '43'"));
        Signs.add(new Sign("n44","number '44'"));
        Signs.add(new Sign("n45","number '45'"));
        Signs.add(new Sign("n46","number '46'"));
        Signs.add(new Sign("n47","number '47'"));
        Signs.add(new Sign("n48","number '48'"));
        Signs.add(new Sign("n49","number '49'"));
        Signs.add(new Sign("n50","number '50'"));
        Signs.add(new Sign("n51","number '51'"));
        Signs.add(new Sign("n52","number '52'"));
        Signs.add(new Sign("n53","number '53'"));
        Signs.add(new Sign("n54","number '54'"));
        Signs.add(new Sign("n55","number '55'"));
        Signs.add(new Sign("n56","number '56'"));
        Signs.add(new Sign("n57","number '57'"));
        Signs.add(new Sign("n58","number '58'"));
        Signs.add(new Sign("n59","number '59'"));
        Signs.add(new Sign("n60","number '60'"));
        Signs.add(new Sign("n61","number '61'"));
        Signs.add(new Sign("n62","number '62'"));
        Signs.add(new Sign("n63","number '63'"));
        Signs.add(new Sign("n64","number '64'"));
        Signs.add(new Sign("n65","number '65'"));
        Signs.add(new Sign("n66","number '66'"));
        Signs.add(new Sign("n67","number '67'"));
        Signs.add(new Sign("n68","number '68'"));
        Signs.add(new Sign("n69","number '69'"));
        Signs.add(new Sign("n70","number '70'"));
        Signs.add(new Sign("n71","number '71'"));
        Signs.add(new Sign("n72","number '72'"));
        Signs.add(new Sign("n73","number '73'"));
        Signs.add(new Sign("n74","number '74'"));
        Signs.add(new Sign("n75","number '75'"));
        Signs.add(new Sign("n76","number '76'"));
        Signs.add(new Sign("n77","number '77'"));
        Signs.add(new Sign("n78","number '78'"));
        Signs.add(new Sign("n79","number '79'"));
        Signs.add(new Sign("n80","number '80'"));
        Signs.add(new Sign("n81","number '81'"));
        Signs.add(new Sign("n82","number '82'"));
        Signs.add(new Sign("n83","number '83'"));
        Signs.add(new Sign("n84","number '84'"));
        Signs.add(new Sign("n85","number '85'"));
        Signs.add(new Sign("n86","number '86'"));
        Signs.add(new Sign("n87","number '87'"));
        Signs.add(new Sign("n88","number '88'"));
        Signs.add(new Sign("n89","number '89'"));
        Signs.add(new Sign("n90","number '90'"));
        Signs.add(new Sign("n91","number '91'"));
        Signs.add(new Sign("n92","number '92'"));
        Signs.add(new Sign("n93","number '93'"));
        Signs.add(new Sign("n94","number '94'"));
        Signs.add(new Sign("n95","number '95'"));
        Signs.add(new Sign("n96","number '96'"));
        Signs.add(new Sign("n97","number '97'"));
        Signs.add(new Sign("n98","number '98'"));
        Signs.add(new Sign("n99","number '99'"));
        Signs.add(new Sign("n100","number '100'"));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        title = (TextView) findViewById(R.id.title);
        video = (VideoView) findViewById(R.id.imageView2);
        initiateNumbers();
        Sign s = Signs.get(0);
        video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setVolume(0f, 0f);
                mp.setLooping(false);
            }
        });

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
