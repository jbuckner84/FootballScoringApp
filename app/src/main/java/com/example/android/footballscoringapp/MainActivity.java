package com.example.android.footballscoringapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreMichigan = 0;

    int scoreOhioState = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Michigan.
     */
    public void displayForMichigan(int scoreMichigan) {
        TextView scoreView = (TextView) findViewById(R.id.michigan_score);
        scoreView.setText(String.valueOf(scoreMichigan));
    }

    /**
     * Adds 6 Points to Michigan's Score
     */
    public void clickTouchdownMichigan(View v) {
        scoreMichigan = scoreMichigan + 6;
        displayForMichigan(scoreMichigan);
    }

    /**
     * Adds 3 Points for Michigan's Score
     */
    public void clickFieldGoalMichigan(View v) {
        scoreMichigan = scoreMichigan + 3;
        displayForMichigan(scoreMichigan);
    }

    /**
     * Adds 1 Point for Michigan's Score
     */
    public void clickExtraPointMichigan(View v) {
        scoreMichigan = scoreMichigan + 1;
        displayForMichigan(scoreMichigan);
    }

    /**
     * Adds 2 Points for Michigan's Score
     */
    public void clickSafetyMichigan(View v) {
        scoreMichigan = scoreMichigan + 2;
        displayForMichigan(scoreMichigan);
    }

    /**
     * Displays the given score Ohio State.
     */
    public void displayForOhioState(int scoreOhioState) {
        TextView scoreView = (TextView) findViewById(R.id.Osu_score);
        scoreView.setText(String.valueOf(scoreOhioState));
    }

    /**
     * Adds 6 Points to Ohio States's Score
     */
    public void clickTouchdownOhioState(View v) {
        scoreOhioState = scoreOhioState + 6;
        displayForOhioState(scoreOhioState);
    }

    /**
     * Adds 3 Points for Ohio States's Score
     */
    public void clickFieldGoalOhioState(View v) {
        scoreOhioState = scoreOhioState + 3;
        displayForOhioState(scoreOhioState);
    }

    /**
     * Adds 1 Point for Ohio States's Score
     */
    public void clickExtraPointOhioState(View v) {
        scoreOhioState = scoreOhioState + 1;
        displayForOhioState(scoreOhioState);
    }

    /**
     * Adds 2 Points for Ohio State's Score
     */
    public void clickSafetyOhioState(View v) {
        scoreOhioState = scoreOhioState + 2;
        displayForOhioState(scoreOhioState);
    }

    /**
     * This button resets Both Michigan and Ohio State Scores
     */
    public void resetScore(View v) {
        scoreMichigan = 0;
        scoreOhioState = 0;
        displayForMichigan(scoreMichigan);
        displayForOhioState(scoreOhioState);
    }
}
