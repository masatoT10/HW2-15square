package com.SQUARES;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); SquareView[][] button = new SquareView[4][4];

        button[0][0] = findViewById(R.id.square0);
        button[0][1] = findViewById(R.id.square1);
        button[0][2] = findViewById(R.id.square2);
        button[0][3] = findViewById(R.id.square3);

        button[1][0] = findViewById(R.id.square4);
        button[1][1] = findViewById(R.id.square5);
        button[1][2] = findViewById(R.id.square6);
        button[1][3] = findViewById(R.id.square7);

        button[2][0] = findViewById(R.id.square8);
        button[2][1] = findViewById(R.id.square9);
        button[2][2] = findViewById(R.id.square10);
        button[2][3] = findViewById(R.id.square11);

        button[3][0] = findViewById(R.id.square12);
        button[3][1] = findViewById(R.id.square13);
        button[3][2] = findViewById(R.id.square14);
        button[3][3] = findViewById(R.id.square15);

        SquareController.setGame(button);
        show();
    }

    public void Reset(View view) {
        SquareController.scramble();
    }


}