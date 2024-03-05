package com.example.eidttext;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView answer;
    Button btn;
    TextView tv;
    TextView tv2;

    Random random;
    int x,y;
    EditText userInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn = findViewById(R.id.btn);
        answer = findViewById(R.id.answer);
        tv = findViewById(R.id.tv);
        tv2 = findViewById(R.id.tv2);
        userInput = findViewById(R.id.userInput);

        random = new Random();

        int right2 = R.drawable.right2;
        int wrong2 = R.drawable.wrong2;
        x = random.nextInt(89) + 10;
        y = random.nextInt(89) + 10;

        tv.setText("" + x);
        tv2.setText("" + y);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = userInput.getText().toString();

                if (input.equals(String.valueOf(x)) || input.equals(String.valueOf(y))) {
                    answer.setImageResource(right2);
                } else {
                    answer.setImageResource(wrong2);
                }
            }
        });
    }}