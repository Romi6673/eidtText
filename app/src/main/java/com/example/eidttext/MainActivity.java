package com.example.eidttext;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView answer;
    ImageView answer2;
    ImageView answer3;
    Button btn;
    Button btn2;
    Button btn3;
    TextView tv;
    TextView tv2;


    Random random;
    int x, y;
    EditText userInput;
    EditText userInput2;
    EditText userInput3;
    TextView  TextView;
    TextView  TextView2;
    TextView  TextView3;
    TextView  TextView4;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn = findViewById(R.id.btn);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        answer = findViewById(R.id.answer);
        answer2 = findViewById(R.id.answer2);
        answer3 = findViewById(R.id.answer3);
        tv = findViewById(R.id.tv);
        tv2 = findViewById(R.id.tv2);
        userInput = findViewById(R.id.userInput);
        userInput2 = findViewById(R.id.userInput2);
        userInput3 = findViewById(R.id.userInput3);
        TextView = findViewById(R.id.textView);
        TextView2 = findViewById(R.id.textView2);
        TextView3 = findViewById(R.id.textView3);
        TextView4 = findViewById(R.id.textView4);





        random = new Random();


        x = random.nextInt(89) + 10;
        y = random.nextInt(89) + 10;

        tv.setText("" + x);
        tv2.setText("" + y);

    }

    public void onClick1(View view) {
        int right2 = R.drawable.correct;
        int wrong2 = R.drawable.incorrect;
        String input = userInput.getText().toString();

        if (input.equals(String.valueOf(x)) || input.equals(String.valueOf(y))) {
            answer.setImageResource(right2);

        } else {
            answer.setImageResource(wrong2);
        }
        x = random.nextInt(89) + 10;
        y = random.nextInt(89) + 10;

        TextView.setText("" + x);
        TextView2.setText("" + y);

    }

    public void onClick2(View view) {
        int right2 = R.drawable.correct;
        int wrong2 = R.drawable.incorrect;
        String input = userInput2.getText().toString();

        if (input.equals(String.valueOf(x)) || input.equals(String.valueOf(y))) {
            answer2.setImageResource(right2);
        } else {
            answer2.setImageResource(wrong2);
        }
        x = random.nextInt(89) + 10;
        y = random.nextInt(89) + 10;

        TextView3.setText("" + x);
        TextView4.setText("" + y);

    }
    public void onClick3(View view) {
        int right2 = R.drawable.correct;
        int wrong2 = R.drawable.incorrect;
        String input = userInput3.getText().toString();

        if (input.equals(String.valueOf(x)) || input.equals(String.valueOf(y))) {
            answer3.setImageResource(right2);
        } else {
            answer3.setImageResource(wrong2);

        }
    }
}
