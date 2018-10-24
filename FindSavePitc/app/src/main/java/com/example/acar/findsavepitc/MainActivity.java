package com.example.acar.findsavepitc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView ımageView1,ımageView2,ımageView3,ımageView4,ımageView5,ımageView6,ımageView7,ımageView8,ımageView9,ımageView10,ımageView11,ımageView12;
    ImageView[] ımageViews;
    int [] idler;
    int durum=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ımageView1 = (ImageView)findViewById(R.id.imageView);
        ımageView2 = (ImageView)findViewById(R.id.imageView2);
        ımageView3 = (ImageView)findViewById(R.id.imageView3);
        ımageView4 = (ImageView)findViewById(R.id.imageView4);
        ımageView5 = (ImageView)findViewById(R.id.imageView5);
        ımageView6 = (ImageView)findViewById(R.id.imageView6);
        ımageView7 = (ImageView)findViewById(R.id.imageView7);
        ımageView8 = (ImageView)findViewById(R.id.imageView8);
        ımageView9 = (ImageView)findViewById(R.id.imageView9);
        ımageView10 = (ImageView)findViewById(R.id.imageView10);
        ımageView11 = (ImageView)findViewById(R.id.imageView11);
        ımageView11 = (ImageView)findViewById(R.id.imageView12);
        idler = new int[]{R.drawable.r1,R.drawable.r2,R.drawable.r3,R.drawable.r4,R.drawable.r5,R.drawable.r6};




    }

    public void ResimDegistir(View view){
        durum=durum+1;

        Random r = new Random();
        ımageView3.setImageResource(idler[r.nextInt(6)]);
        if(durum==2){


           durum=0;
        }
    }
}
