package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ComQuestionActivity extends AppCompatActivity {

    TextView tv;
    Button submitbutton, quitbutton;
    RadioGroup radio_g;
    RadioButton rb1,rb2,rb3,rb4;

    String questions[] = {
            "Who is the father of computer?",
            "What is a computer's brain called?",
            " What is the main page of any website called..",
            "Which part of a computer is called a nerve center?",
            "What is the official language for the development of Android?",
            "In which of the following is the speed of functioning of a computer?",
            "Which is the largest network in the world?",
            "Who invented the computer mouse?",
            "Who is the founder of Microsoft company?",
            "IC used in computer  (IC) Chip is made up of ?",
    };
    String answers[] = {"Charles Babbage","CPU","Homepage","Control Unit","Java","MHz","Internet","Douglas Englebert","both b and c","Silicon",};
    String opt[] = {
            "Charles Babbage","Bill Gates","Both A&B","Macmillan",
            "software","monitor","Hardware","CPU",
            "Homepage","Search Engine","Bookmark","Browser Page",
            "Hardware","Programs","Software","Control Unit",
            "FORTRON","COBOL","Ada","Java",
            "milliseconds","Megabytes","bit","MHz",
            "Intranet","VPN","Internet","WAN",
            "Douglas Englebert","Charles Babbage","Simon Colton","John Bax ",
            "Steve Jobs","Paul Allen","Bill Gates","both b and c",
            "Silica","Silicon","Iron Oxide","Chromium",
    };
    int flag=0;
    public static int marks=0,correct=0,wrong=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        final TextView score = (TextView)findViewById(R.id.textView4);
        Intent intent = getIntent();
        submitbutton=(Button)findViewById(R.id.button3);
        quitbutton=(Button)findViewById(R.id.buttonquit);
        tv=(TextView) findViewById(R.id.tvque);

        radio_g=(RadioGroup)findViewById(R.id.answersgrp);
        rb1=(RadioButton)findViewById(R.id.radioButton);
        rb2=(RadioButton)findViewById(R.id.radioButton2);
        rb3=(RadioButton)findViewById(R.id.radioButton3);
        rb4=(RadioButton)findViewById(R.id.radioButton4);
        tv.setText(questions[flag]);
        rb1.setText(opt[0]);
        rb2.setText(opt[1]);
        rb3.setText(opt[2]);
        rb4.setText(opt[3]);
        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //int color = mBackgroundColor.getColor();
                //mLayout.setBackgroundColor(color);

                if(radio_g.getCheckedRadioButtonId()==-1)
                {
                    Toast.makeText(getApplicationContext(), "Please select one choice", Toast.LENGTH_SHORT).show();
                    return;
                }
                RadioButton uans = (RadioButton) findViewById(radio_g.getCheckedRadioButtonId());
                String ansText = uans.getText().toString();
//                Toast.makeText(getApplicationContext(), ansText, Toast.LENGTH_SHORT).show();
                if(ansText.equals(answers[flag])) {
                    correct++;
                    Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                }
                else {
                    wrong++;
                    Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
                }

                flag++;

                if (score != null)
                    score.setText(""+correct);

                if(flag<questions.length)
                {
                    tv.setText(questions[flag]);
                    rb1.setText(opt[flag*4]);
                    rb2.setText(opt[flag*4 +1]);
                    rb3.setText(opt[flag*4 +2]);
                    rb4.setText(opt[flag*4 +3]);
                }
                else
                {
                    marks=correct;
                    Intent in = new Intent(getApplicationContext(),ComResultActivity.class);
                    startActivity(in);
                }
                radio_g.clearCheck();
            }
        });

        quitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ComResultActivity.class);
                startActivity(intent);
            }
        });

    }
}