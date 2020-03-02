package com.example.scorekeeper;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: naming conventions
    /* https://source.android.com/setup/contribute/code-style#follow-field-naming-conventions */
    int mTeamA, mTeamB, mFoulsA, mFoulsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Incrementar A
     */
    private void incrementA() {
        mTeamA++;
    }

    /**
     * Incrementar e display ao clicar no botão
     */
    public void onIncrementABtnClick() {
        incrementA();
        displayResultA(mTeamA);
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

        // TODO: OPTIMIZAÇÃO DA INICIALIZAÇÃO DE VIEWS
        /*
         *   - Declarar como variável membro da classe
         *   - Inicializar no OnCreate()
         * */
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
        // TODO: Separação de conceitos
        displayResultA(mTeamA = 0);
        displayResultB(mTeamB = 0);
        displayFoulsA(mFoulsA = 0);
        displayFoulsB(mFoulsB = 0);
    }
}