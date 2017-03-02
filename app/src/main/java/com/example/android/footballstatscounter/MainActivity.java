package com.example.android.footballstatscounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.R.attr.value;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import static com.example.android.footballstatscounter.R.id.foulsB;
import static com.example.android.footballstatscounter.R.id.score;

public class MainActivity extends AppCompatActivity {

    int scoreA=0,scoreB=0;
    int possession=50;
    int shotsA=0,shotsB=0;
    int foulsA=0,foulsB=0;
    int cornersA=0,cornersB=0;
    int offsidesA=0,offsidesB=0;

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

    public void shotA(View v){
        shotsA++;
        display(11);
    }

    public void shotB(View v){
        shotsB++;
        display(21);
    }

    public void foulA(View v){
        foulsA++;
        display(12);
    }

    public void foulB(View v){
        foulsB++;
        display(22);
    }

    public void cornerA(View v){
        cornersA++;
        display(13);
    }

    public void cornerB(View v){
        cornersB++;
        display(23);
    }

    public void offsideA(View v){
        offsidesA++;
        display(14);
    }

    public void offsideB(View v){
        offsidesB++;
        display(24);
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
                break;
            case 11:
                TextView shotViewA = (TextView) findViewById(R.id.shotsA);
                shotViewA.setText(String.valueOf(shotsA));
                break;
            case 21:
                TextView shotViewB = (TextView) findViewById(R.id.shotsB);
                shotViewB.setText(String.valueOf(shotsB));
                break;
            case 12:
                TextView foulViewA = (TextView) findViewById(R.id.foulsA);
                foulViewA.setText(String.valueOf(foulsA));
                break;
            case 22:
                TextView foulViewB = (TextView) findViewById(R.id.foulsB);
                foulViewB.setText(String.valueOf(foulsB));
                break;
            case 13:
                TextView cornerViewA = (TextView) findViewById(R.id.cornersA);
                cornerViewA.setText(String.valueOf(cornersA));
                break;
            case 23:
                TextView cornerViewB = (TextView) findViewById(R.id.cornersB);
                cornerViewB.setText(String.valueOf(cornersB));
                break;
            case 14:
                TextView offsideViewA = (TextView) findViewById(R.id.offsidesA);
                offsideViewA.setText(String.valueOf(offsidesA));
                break;
            case 24:
                TextView offsideViewB = (TextView) findViewById(R.id.offsidesB);
                offsideViewB.setText(String.valueOf(offsidesB));
                break;
        }
    }
}
