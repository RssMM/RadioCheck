package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.buttonGrid);

        btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, GridLayout.class));
            }
        });
        Button btn1 = (Button)findViewById(R.id.buttonFrame);

        btn1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FrameLayout.class));
            }
        });
        Button btn3 = (Button)findViewById(R.id.buttonTbale);

        btn3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TableLayout.class));
            }
        });

        Button btn4 = (Button)findViewById(R.id.buttonCualquier);

        btn4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CualquierLayout.class));
            }
        });

        Button btn5 = (Button)findViewById(R.id.buttonLinear);

        btn5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LinearLayout.class));
            }
        });

        Button btn6 = (Button)findViewById(R.id.buttonRelative);

        btn6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RelativeLayout.class));
            }
        });
    }
}