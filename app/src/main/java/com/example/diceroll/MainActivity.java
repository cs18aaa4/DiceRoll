package com.example.diceroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    TextView tv;
    Button btnDice;
    EditText etInput;
    TextView tvScore;
    private int Score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


 }

    public void onClick(View view) {

        btnDice = findViewById(R.id.btnDice);
        tv = findViewById(R.id.tv);
        etInput = findViewById(R.id.etInput);
        tvScore = findViewById(R.id.tvScore);
        Random r = new Random();
        int number =  r.nextInt(7) ;
        tv.setText(Integer.toString(number));
        int first = Integer.valueOf(tv.getText().toString());
        int second = Integer.valueOf(etInput.getText().toString());

        if (first == second){
            Toast.makeText(getApplicationContext(),"Congratulations",Toast.LENGTH_SHORT).show();
            Score++;
        }
        else {
            Toast.makeText(getApplicationContext(),"keep trying",Toast.LENGTH_SHORT).show();
        }

        int points = Score;
        String s = String.valueOf(points);
        tvScore.setText("score:" + s);

    }


}

