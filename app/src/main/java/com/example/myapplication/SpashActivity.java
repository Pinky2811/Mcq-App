package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SpashActivity extends AppCompatActivity {
    private TextView appName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spash);
        appName=findViewById(R.id.tvspach);

        Animation anim = AnimationUtils.loadAnimation(this,R.anim.myanim);
        appName.setAnimation(anim);


        Thread thread = new Thread(){
            public void run (){
                try {
                    sleep(3000);
                }catch (Exception e){
                    e.printStackTrace();

                }
                finally {
                    Intent i = new Intent(SpashActivity.this,MainActivity.class);
                    startActivity(i);

                }
            }
        };thread.start();
    }
}