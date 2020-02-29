package com.example.yourfeedback;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Complete extends AppCompatActivity {
    Button btn;
    String name;
    TextView t;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete);
        /*LinearLayout ll = findViewById(R.id.ll);
        AnimationDrawable ad = (AnimationDrawable) ll.getBackground();
        ad.setEnterFadeDuration(2000);
        ad.setExitFadeDuration(2000);
        ad.start();*/
        btn = (Button)findViewById(R.id.b);
        Intent in = getIntent();
        name = in.getStringExtra("name");
        t = (TextView)findViewById(R.id.thank);
        t.setText(name);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Complete.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
