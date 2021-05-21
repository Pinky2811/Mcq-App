package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
      CardView card_gk,card_computer, card_geography, card_indian_history,card_Sports,card_gujarati;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        card_gk = findViewById(R.id.card_gk);
        card_computer= findViewById(R.id.card_computer);
        card_geography= findViewById(R.id.card_geography);
        card_indian_history = findViewById(R.id.card_indian_history);
        card_Sports = findViewById(R.id.card_Sports);
        card_gujarati = findViewById(R.id.card_gujarati);

        card_gk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),QuestionActivity.class);
                startActivity(intent);


            }
        });
        card_computer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),ComQuestionActivity.class);
                startActivity(intent);


            }
        });
        card_geography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),GeoQuestionActivity.class);
                startActivity(intent);


            }
        });
        card_indian_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),HisQuestionActivity.class);
                startActivity(intent);

            }
        });
        card_Sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),SpoQuestionActivity.class);
                startActivity(intent);

            }
        });
        card_gujarati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),GujQuestionActivity.class);
                startActivity(intent);

            }
        });
    }
      private void showToast(String message) {
          Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
      }
}