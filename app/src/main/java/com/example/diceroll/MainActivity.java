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
    Button btnDiceBreaker;
    EditText etInput;
    TextView tvScore;
    TextView tvNumbers;
    TextView tvQuestions;
    private int number;
    private int Score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDice = findViewById(R.id.btnDice);
        tv = findViewById(R.id.tv);
        etInput = findViewById(R.id.etInput);
        tvScore = findViewById(R.id.tvScore);
        btnDiceBreaker = findViewById(R.id.btnDiceBreaker);
        tvNumbers = findViewById(R.id.tvNumbers);
        tvQuestions = findViewById(R.id.tvQuestions);


 }

    public void roll_the_dice() {

        Random r = new Random();
        number =  r.nextInt(7) ;
    }

    public void dice(View view){
        roll_the_dice();
        tv.setText(Integer.toString(this.number));
        int first = Integer.valueOf(tv.getText().toString());
        int second = Integer.valueOf(etInput.getText().toString());

        if (first == second){
            Toast.makeText(getApplicationContext(),"Congratulations",Toast.LENGTH_SHORT).show();
            Score++;
        }


        int points = Score;
        String s = String.valueOf(points);
        tvScore.setText("score:" + s);
    }




    public void onClick(View view) {


        roll_the_dice();
        tvNumbers.setText(Integer.toString(number));


       if (number == 1){
           tvQuestions.setText("If you could go anywhere in the world, where would you go?");
       }
       else if (number ==2){
           tvQuestions.setText("If you were stranded on a desert island, what three things would you want to take with you?");
       }
       else if (number ==3){
           tvQuestions.setText("If you could eat only one food for the rest of your life, what would that be?");
       }
       else if (number ==4){
           tvQuestions.setText("If you won a million dollars, what is the first thing you would buy?");
       }
       else if (number ==5){
           tvQuestions.setText("If you could spaned the day with one fictional character, who would it be?\n");
       }
       else if (number ==6){
           tvQuestions.setText("If you found a magic lantern and a genie gave you three wishes, what would you wish?");
       }
    }
}