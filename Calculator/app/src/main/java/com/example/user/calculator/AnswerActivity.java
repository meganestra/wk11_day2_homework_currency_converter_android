package com.example.user.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by user on 16/08/2016.
 */
public class AnswerActivity extends AppCompatActivity {

    TextView mAnswerNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        mAnswerNumber = (TextView)findViewById(R.id.answer_number);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        int input = extras.getInt("inputNumber");

        double inputDoubled = input * 1.30;

        String stringInput = Double.toString(inputDoubled);

        mAnswerNumber.setText(stringInput);

    }

}
