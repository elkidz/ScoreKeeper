package com.example.scorekeeper;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int equipaA = 0;
    int equipaB = 0;
    int faultsA = 0;
    int faultsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Incrementar resultados
     */
    public void incrementA(View view) {
        equipaA = equipaA + 1;
        displayResultA(equipaA);
    }

    public void incrementB(View view) {
        equipaB = equipaB + 1;
        displayResultB(equipaB);
    }

    /**
     * Incrementar faltas
     */
    public void incrementFaultsA(View view) {
        faultsA = faultsA + 1;
        displayFoulsA(faultsA);
    }

    public void incrementFaultsB(View view) {
        faultsB = faultsB + 1;
        displayFoulsB(faultsB);
    }

    /**
     * Mostrar os resultados
     */
    private void displayResultA(int number) {
        TextView quantityTextView = findViewById(R.id.score_a);
        quantityTextView.setText("" + number);
    }

    private void displayResultB(int number) {
        TextView quantityTextView = findViewById(R.id.score_b);
        quantityTextView.setText("" + number);
    }

    /**
     * Mostrar os faltas
     */
    private void displayFoulsA(int number) {
        TextView quantityTextView = findViewById(R.id.fouls_a);
        quantityTextView.setText("" + number);
    }

    private void displayFoulsB(int number) {
        TextView quantityTextView = findViewById(R.id.fouls_b);
        quantityTextView.setText("" + number);
    }

    public void reset(View view) {
        displayResultA(0);
        displayResultB(0);
        displayFoulsA(0);
        displayFoulsB(0);
        equipaA = 0;
        equipaB = 0;
        faultsA = 0;
        faultsB = 0;
    }
}