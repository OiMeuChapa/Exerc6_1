package com.example.Exerc6;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Activity3 extends AppCompatActivity implements View.OnClickListener{

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_3);

            FloatingActionButton button = findViewById(R.id.Btn2);
            button.setOnClickListener(this);
        }

    public void onClick(View v) {
        Intent intent = new Intent(Activity3.this , Activity4.class);
        startActivity(intent);
    }
}

