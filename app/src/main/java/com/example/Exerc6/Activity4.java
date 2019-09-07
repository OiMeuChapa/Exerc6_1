package com.example.Exerc6;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class Activity4 extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        FloatingActionButton button = findViewById(R.id.Btn3);
        button.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent intent = new Intent(Activity4.this , Activity3.class);
        startActivity(intent);
    }
}

