package com.example.scorekeeper;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamA, teamB, faultsA, faultsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Incrementar resultados e faltas
     */
    public void incrementA(View view) {
        displayResultA(teamA++);
    }

    public void incrementB(View view) {
        displayResultB(teamB++);
    }

    public void incrementFaultsA(View view) {
        displayFoulsA(faultsA++);
    }

    public void incrementFaultsB(View view) {
        displayFoulsB(faultsB++);
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
        displayResultA(teamA = 0);
        displayResultB(teamB = 0);
        displayFoulsA(faultsA = 0);
        displayFoulsB(faultsB = 0);
    }
}