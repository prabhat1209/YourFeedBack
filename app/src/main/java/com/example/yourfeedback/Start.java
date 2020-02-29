package com.example.yourfeedback;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Start extends AppCompatActivity {

    Button btn, info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        info = (Button)findViewById(R.id.info);
        btn = (Button)findViewById(R.id.start);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://developers.google.com/community/gdg"));
                startActivity(viewIntent);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Start.this,MainActivity.class);
                startActivity(i);
            }
        });
        ConstraintLayout ll = findViewById(R.id.lay);
        AnimationDrawable ad = (AnimationDrawable) ll.getBackground();
        ad.setEnterFadeDuration(2000);
        ad.setExitFadeDuration(2000);
        ad.start();
    }
}
