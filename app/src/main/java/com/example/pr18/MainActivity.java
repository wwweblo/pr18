package com.example.pr18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button ex2Button;
    Button ex3Button;
    Button ex4Button;
    Button ex5Button;
    Button ex6Button;
    Button ex7Button;
    Button ex8Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ex2Button = findViewById(R.id.ex2_button);
        ex2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ex2.class);
                startActivity(intent);
            }
        });

        ex3Button = findViewById(R.id.ex3_button);
        ex3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ex3.class);
                startActivity(intent);
            }
        });

        ex4Button = findViewById(R.id.ex4_button);
        ex4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ex4.class);
                startActivity(intent);
            }
        });

        ex5Button = findViewById(R.id.ex5_button);
        ex5Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ex5.class);
                startActivity(intent);
            }
        });

        ex6Button = findViewById(R.id.ex6_button);
        ex6Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ex6.class);
                startActivity(intent);
            }
        });

        ex7Button = findViewById(R.id.ex7_button);
        ex7Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ex7.class);
                startActivity(intent);
            }
        });

        ex8Button = findViewById(R.id.ex8_button);
        ex8Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ex8.class);
                startActivity(intent);
            }
        });


    }
}