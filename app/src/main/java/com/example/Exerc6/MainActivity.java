package com.example.Exerc6;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.Btn);
        button.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, Activity2.class);
        startActivity(intent);
    }
}