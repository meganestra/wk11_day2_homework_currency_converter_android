package com.example.user.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by user on 16/08/2016.
 */
public class Calculator extends AppCompatActivity {

    EditText mInputNumber;
    Button mCalculateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mInputNumber = (EditText)findViewById(R.id.input_number);
        mCalculateButton = (Button)findViewById(R.id.button);

        mCalculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Calculator: ", "clicked!");

                String inputString = mInputNumber.getText().toString();
                int inputNumber = Integer.parseInt(inputString);

                Intent intent = new Intent(Calculator.this, AnswerActivity.class);
                intent.putExtra("inputNumber", inputNumber);
                startActivity(intent);

            }
        });
    }

}