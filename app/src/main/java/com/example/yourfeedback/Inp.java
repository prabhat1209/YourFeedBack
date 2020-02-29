package com.example.yourfeedback;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class Inp extends AppCompatActivity {
    ResponseAdapter res;
    Button b1,b2;
    RecyclerView resRCV;
    ArrayList<in> iList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inp);
        b1 = (Button) findViewById(R.id.back);
        b2 = (Button) findViewById(R.id.sub);
        /*LinearLayout ll = findViewById(R.id.ll);
        AnimationDrawable ad = (AnimationDrawable) ll.getBackground();
        ad.setEnterFadeDuration(2000);
        ad.setExitFadeDuration(2000);
        ad.start();*/

        iList = new ArrayList<in>();
        in gf = (in) getIntent().getSerializableExtra("resp");
        iList.add(gf);
        res = new ResponseAdapter(this, iList);
        resRCV = (RecyclerView) findViewById(R.id.recycler);
        resRCV.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        resRCV.setAdapter(res);
        res.notifyDataSetChanged();
        String name = "";
        name = gf.name;

        final String finalName = name;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Inp.this,MainActivity.class);

                startActivity(i);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent j = new Intent(Inp.this,Complete.class);
                j.putExtra("name", finalName);
                startActivity(j);

            }
        });


    }
}
