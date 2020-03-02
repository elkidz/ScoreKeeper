package com.example.scorekeeper;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

<<<<<<< Updated upstream
    int teamA, teamB, faultsA, faultsB = 0;
=======
    // TODO: naming conventions
    /* https://source.android.com/setup/contribute/code-style#follow-field-naming-conventions */
    int mTeamA, mTeamB, mFoulsA, mFoulsB = 0;
>>>>>>> Stashed changes

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Incrementar A
     */
<<<<<<< Updated upstream
    public void incrementA(View view) {
        teamA++;
        displayResultA(teamA);
=======
    private void incrementA() {
        mTeamA++;
    }

    /**
     * Incrementar e display ao clicar no botão
     */
    public void onIncrementABtnClick() {
        incrementA();
        displayResultA(mTeamA);
>>>>>>> Stashed changes
    }

    /**
     * Incrementar B
     */
    private void incrementB() {
        mTeamA++;
    }

    /**
     * Incrementar B e display ao clicar no botão
     */
    public void onIncrementBBtnClick() {
        incrementB();
        displayResultB(mTeamA);
    }

    public void incrementFaultsA(View view) {
        mFoulsA++;
        displayFoulsA(mFoulsA);
    }

    public void incrementFaultsB(View view) {
        mFoulsB++;
        displayFoulsB(mFoulsB);
    }

    /**
     * Displays - Mostrar os resultados e faltas
     */
    private void displayResultA(int number) {
        TextView quantityTextView = findViewById(R.id.score_a);
        quantityTextView.setText("" + number);
    }

    private void displayResultB(int number) {
        TextView quantityTextView = findViewById(R.id.score_b);
        quantityTextView.setText("" + number);
    }

    private void displayFoulsA(int number) {
        TextView quantityTextView = findViewById(R.id.fouls_a);
        quantityTextView.setText("" + number);
    }

    private void displayFoulsB(int number) {
        TextView quantityTextView = findViewById(R.id.fouls_b);
        quantityTextView.setText("" + number);
    }

    /**
     * Reset dos valores
     */
    public void reset(View view) {
<<<<<<< Updated upstream
        displayResultA(teamA = 0);
        displayResultB(teamB = 0);
        displayFoulsA(faultsA = 0);
        displayFoulsB(faultsB = 0);
=======
        // TODO: Separação de conceitos
        displayResultA(mTeamA = 0);
        displayResultB(mTeamB = 0);
        displayFoulsA(mFoulsA = 0);
        displayFoulsB(mFoulsB = 0);
>>>>>>> Stashed changes
    }
}