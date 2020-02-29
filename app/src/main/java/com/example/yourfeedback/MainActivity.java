package com.example.yourfeedback;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ScrollView sview;
    TextView tage;
    EditText nameet, emailet, collegeet, mobileet, linet, fbet, ghet, resumeet, joinet, pexet, tellet, refet, t12;
    Button next;
    SeekBar seekBar;
    CheckBox e1, e2, e3, e4, e5, e6, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, tc;
    Spinner spinner;
    RadioButton m, f, ot;
    int age = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout ll = findViewById(R.id.ll);
        AnimationDrawable ad = (AnimationDrawable) ll.getBackground();
        ad.setEnterFadeDuration(2000);
        ad.setExitFadeDuration(2000);
        ad.start();


        sview = (ScrollView)findViewById(R.id.sview);
        nameet = (EditText) findViewById(R.id.nameedt);
        emailet = (EditText) findViewById(R.id.email);
        collegeet = (EditText) findViewById(R.id.clg);
        mobileet = (EditText) findViewById(R.id.mob);
        linet = (EditText) findViewById(R.id.lpro);
        fbet = (EditText) findViewById(R.id.fb);
        ghet = (EditText) findViewById(R.id.ghp);
        resumeet = (EditText) findViewById(R.id.rl);
        joinet = (EditText) findViewById(R.id.join);
        pexet = (EditText) findViewById(R.id.pex);
        tellet = (EditText) findViewById(R.id.tell);
        refet = (EditText) findViewById(R.id.ref);
        next = (Button) findViewById(R.id.next);
        m = (RadioButton) findViewById(R.id.male);
        f = (RadioButton) findViewById(R.id.female);
        ot = (RadioButton) findViewById(R.id.other);
        spinner = (Spinner) findViewById(R.id.spinner);
        seekBar = (SeekBar) findViewById(R.id.sage);
        e1 = (CheckBox) findViewById(R.id.e1);
        e2 = (CheckBox) findViewById(R.id.e2);
        e3 = (CheckBox) findViewById(R.id.e3);
        e4 = (CheckBox) findViewById(R.id.e4);
        e5 = (CheckBox) findViewById(R.id.e5);
        e6 = (CheckBox) findViewById(R.id.e6);
        t1 = (CheckBox) findViewById(R.id.t1);
        t2 = (CheckBox) findViewById(R.id.t2);
        t3 = (CheckBox) findViewById(R.id.t3);
        t4 = (CheckBox) findViewById(R.id.t4);
        t5 = (CheckBox) findViewById(R.id.t5);
        t6 = (CheckBox) findViewById(R.id.t6);
        t7 = (CheckBox) findViewById(R.id.t7);
        t8 = (CheckBox) findViewById(R.id.t8);
        t9 = (CheckBox) findViewById(R.id.t9);
        t10 = (CheckBox) findViewById(R.id.t10);
        t11 = (CheckBox) findViewById(R.id.t11);
        t12 = (EditText) findViewById(R.id.t12);
        tage = (TextView) findViewById(R.id.tage);
        tc = (CheckBox) findViewById(R.id.tc);
        t12.setEnabled(false);
        s1 = (CheckBox) findViewById(R.id.s1);
        s2 = (CheckBox) findViewById(R.id.s2);
        s3 = (CheckBox) findViewById(R.id.s3);
        s4 = (CheckBox) findViewById(R.id.s4);
        s5 = (CheckBox) findViewById(R.id.s5);
        s6 = (CheckBox) findViewById(R.id.s6);
        s7 = (CheckBox) findViewById(R.id.s7);
        s8 = (CheckBox) findViewById(R.id.s8);
        s9 = (CheckBox) findViewById(R.id.s9);
        s10 = (CheckBox) findViewById(R.id.s10);
        s11 = (CheckBox) findViewById(R.id.s11);
        

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int min = 1;
                if (progress < 1) {
                    age = min;
                } else {
                    age = progress;
                    tage.setText(Integer.toString(age));
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (adapterView.getItemAtPosition(i).equals("Select Year")) {

                } else {

                    String item = adapterView.getItemAtPosition(i).toString();

                   //Toast.makeText(adapterView.getContext(), "Selected : " + item, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        t11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                t12.setEnabled(true);

            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //EditText nameet, emailet, collegeet, mobileet, linet, fbet, ghet, resumeet, joinet, pexet, tellet, refet, t12;
                String name = nameet.getText().toString();
                String mobile = mobileet.getText().toString();
                String email = emailet.getText().toString();
                String college = collegeet.getText().toString();
                String mob = mobileet.getText().toString();
                String lin = linet.getText().toString();
                String fb = fbet.getText().toString();
                String gh = ghet.getText().toString();
                String resume = resumeet.getText().toString();
                String join = joinet.getText().toString();
                String pex = pexet.getText().toString();
                String tell = tellet.getText().toString();
                String ref = refet.getText().toString();
                String other = t12.getText().toString();
                String age = Integer.toString(seekBar.getProgress());
                String year = spinner.getSelectedItem().toString();
                String gender = " ";
                if (m.isChecked()) {
                    gender = "Male";
                }
                if (f.isChecked()) {
                    gender = "Female";
                }
                if (ot.isChecked()) {
                    gender = "Other";
                }
                String area = " ";
                if (e1.isChecked()) {
                    area = area + "Reaching Out (Companies / Colleges)";
                }
                if (e2.isChecked()) {
                    area = area + "Designing ";
                }
                if (e3.isChecked()) {
                    area = area + "Marketing";
                }
                if (e4.isChecked()) {
                    area = area + "Writing";
                }
                if (e5.isChecked()) {
                    area = area + "Programming";
                }
                if (e6.isChecked()) {
                    area = area + "Management";
                }
                String tech = " ";
                if (t1.isChecked()) {
                    tech = tech + "Python";
                }
                if (t2.isChecked()) {
                    tech = tech + "JavaScript";
                }
                if (t3.isChecked()) {
                    tech = tech + "React";
                }
                if (t4.isChecked()) {
                    tech = tech + "Angular";
                }
                if (t5.isChecked()) {
                    tech = tech + "HTML + CSS";
                }
                if (t6.isChecked()) {
                    tech = tech + "PHP";
                }
                if (t7.isChecked()) {
                    tech = tech + "Node Js";
                }
                if (t8.isChecked()) {
                    tech = tech + "SQL / NoSQL";
                }
                if (t9.isChecked()) {
                    tech = tech + "c#";
                }
                if (t10.isChecked()) {
                    tech = tech + "Go";
                }
                if (t11.isChecked()) {
                    tech = tech + other;
                }
                String working = " ";
                if (s1.isChecked()) {
                    working = working + "Web Development ";
                }
                if (s2.isChecked()) {
                    working = working + "App Development ";
                }
                if (s3.isChecked()) {
                    working = working + "Software Development ";
                }
                if (s4.isChecked()) {
                    working = working + "Data Science / ML / DL ";
                }
                if (s5.isChecked()) {
                    working = working + "Blockchain ";
                }
                if (s6.isChecked()) {
                    working = working + "Cloud Computing ";
                }
                if (s7.isChecked()) {
                    working = working + "DevOpd";
                }
                if (s8.isChecked()) {
                    working = working + "Quantum Computing ";
                }
                if (s9.isChecked()) {
                    working = working + "Competitive Programming ";
                }
                if (s10.isChecked()) {
                    working = working + "Product Development ";
                }
                if (s11.isChecked()) {
                    working = working + "Cyber Security ";
                }

                in response = new in(name, email, gender, age, college, year, mob, area, tech, working, lin, fb, gh, resume, join, pex, tell, ref);

                if (name.length() == 0 || email.length() == 0 || gender.length() == 0 || college.length() == 0 || area.length() == 0 || tech.length() == 0 || working.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Fill Mandatory Fields ! ", Toast.LENGTH_LONG).show();
                } else if (mobile.length() != 10) {
                    Toast.makeText(getApplicationContext(), "Mobile Number is of wrong length !", Toast.LENGTH_LONG).show();
                } else if (year == "Select Year") {
                    Toast.makeText(getApplicationContext(), "Please Select Year Of Study !", Toast.LENGTH_LONG).show();
                } else if (tc.isChecked() == false) {
                    Toast.makeText(getApplicationContext(), "Please Accept Terms and Conditions !", Toast.LENGTH_LONG).show();
                } else {
                    Intent i = new Intent(MainActivity.this, Inp.class);
                    i.putExtra("resp", response);
                    startActivity(i);
                }

            }
        });


    }


}
