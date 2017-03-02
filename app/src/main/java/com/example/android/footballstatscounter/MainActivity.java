package com.example.android.footballstatscounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.R.attr.value;
import static com.example.android.footballstatscounter.R.id.score;

public class MainActivity extends AppCompatActivity {

    int scoreA=0,scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goalTeamA(View v){
        scoreA++;
        display(1);
    }

    public void goalTeamB(View v){
        scoreB++;
        display(1);
    }

    public void display(int code){
        switch (code){
            case 1:
                TextView scoreView = (TextView) findViewById(R.id.score);
                scoreView.setText(String.valueOf(scoreA) + " - " + String.valueOf(scoreB));
                break;

        }
    }
}
