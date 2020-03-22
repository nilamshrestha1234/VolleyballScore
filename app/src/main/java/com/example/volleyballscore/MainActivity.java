package com.example.volleyballscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnscoreA1,btnscoreA2,btnscoreA3,btnscoreB1,btnscoreB2,btnscoreB3,reset;
    private TextView tvscoreA,tvscoreB;

    private int scoreA=0,scoreB=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnscoreA1=findViewById(R.id.btnscoreA1);
        btnscoreB1=findViewById(R.id.btnscoreB1);

        btnscoreA2=findViewById(R.id.btnscoreA2);

        btnscoreA3=findViewById(R.id.btnscoreA3);

        btnscoreB2=findViewById(R.id.btnscoreB2);

        btnscoreB3=findViewById(R.id.btnscoreB3);

        tvscoreA=findViewById(R.id.tvscoreA);
        tvscoreB=findViewById(R.id.tvscoreB);

        btnscoreA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreA++;
                tvscoreA.setText(""+scoreA);
            }
        });
        btnscoreA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreA=scoreA+2;
                tvscoreA.setText(""+scoreA);

            }
        });
        btnscoreA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreA=scoreA+3;
                tvscoreA.setText(""+scoreA);

            }
        });

        btnscoreB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreB=scoreB+1;
                tvscoreB.setText(""+scoreB);

            }
        });
        btnscoreB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreB=scoreB+2;
                tvscoreB.setText(""+scoreB);

            }
        });

        btnscoreB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreB=scoreB+3;
                tvscoreB.setText(""+scoreB);

            }
        });

        reset=findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreA=0;
                scoreB=0;
                tvscoreA.setText("0");
                tvscoreB.setText("0");
            }
        });


    }
}

