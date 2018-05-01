package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }
    int AScore = 0;
        int BScore = 0;

    public void plusThree(View view){
         AScore = AScore + 3;
        displayForTeamA(AScore);
    }
    public void plusTwo
            (View view){
         AScore = AScore +2;
        displayForTeamA(AScore);
    }
    public void plusOne(View view){
                 AScore = AScore + 1;
    displayForTeamA(AScore);    }
    public void plusThreeThree(View view) {
        BScore= BScore +3;
        displayForTeamB(BScore);
    }
    public void plusTwoTwo (View view) {
        BScore = BScore +2;
        displayForTeamB(BScore);

    }
    public void  plusOneOne (View view){
        BScore = BScore +1 ;
        displayForTeamB(BScore
        );
    }
    public void zero(View view){
        AScore=0;
        BScore=0;
        displayForTeamB(BScore);
        displayForTeamA(AScore);
    }

    public void displayForTeamA(int AScore) {

        TextView scoreView = (TextView) findViewById(R.id.team_a_score);

        scoreView.setText("" +AScore);

    }
    public void displayForTeamB(int BScore) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText("" +BScore);

    }
}
