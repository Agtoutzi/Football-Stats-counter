package com.example.android.footballstatscounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.R.attr.value;
import static com.example.android.footballstatscounter.R.id.score;

public class MainActivity extends AppCompatActivity {

    int scoreA=0,scoreB=0;
    int possession=50;

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

    public void gainPossessionA(View v){
        if(possession<100)possession++;
        display(2);
    }

    public void gainPossessionB(View v){
        if(possession>0)possession--;
        display(2);
    }

    public void display(int code){
        switch (code){
            case 1:
                TextView scoreView = (TextView) findViewById(R.id.score);
                scoreView.setText(String.valueOf(scoreA) + " - " + String.valueOf(scoreB));
                break;
            case 2:
                TextView possessionViewA = (TextView) findViewById(R.id.possessionA);
                TextView possessionViewB = (TextView) findViewById(R.id.possessionB);
                possessionViewA.setText(String.valueOf(possession) + "%");
                possessionViewB.setText(String.valueOf(100 - possession) + "%");
        }
    }
}
