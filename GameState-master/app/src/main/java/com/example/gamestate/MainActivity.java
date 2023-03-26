package com.example.gamestate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        Button b = findViewById(R.id.runT);
        EditText et = findViewById(R.id.editTextTextMultiLine);
        
        onClick(b);

    }

    @Override
    public void onClick(View view) {
        //clears the text
        et.setText("");

        //second part
        View firstInstance = new GameState(f);
        GameState secondInstance = new GameState(firstInstance.numBlackPieces, firstInstance.numWhitePieces, firstInstance.isBlackTurn, firstInstance.gameOver, firstInstance.board);


    }
}