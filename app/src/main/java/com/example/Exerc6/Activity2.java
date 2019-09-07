package com.example.Exerc6;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class Activity2 extends AppCompatActivity implements View.OnClickListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Button button = findViewById(R.id.Btn1);
        button.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent intent = new Intent(Activity2.this , Activity3.class);
        startActivity(intent);
    }
}
