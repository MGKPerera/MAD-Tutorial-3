package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText edtNum1;
    EditText edtNum2;
    TextView lblSum;

    String num1;
    String num2;

    int n1,n2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        edtNum1 = findViewById(R.id.edtNumber1);
        edtNum2 = findViewById(R.id.edtNumber2);
        lblSum = findViewById(R.id.lblSum);

        Intent intent = getIntent();

         num1 = intent.getStringExtra("n1");
         num2 = intent.getStringExtra("n2");

        edtNum1.setText(num1);
        edtNum2.setText(num2);

        n1 = Integer.parseInt(num1);
        n2 = Integer.parseInt(num2);

    }

    public void add(View view){
        lblSum.setText(num1 + "+" + num2 +"=" +(n1+n2));
    }

    public void sub(View view){
        lblSum.setText(num1 + "-" + num2 +"=" +(n1-n2));
    }

    public void Multi(View view){
        lblSum.setText(num1 + "*" + num2 +"=" +(n1*n2));
    }

    public void divide(View view){
        lblSum.setText(num1 + "/" + num2 + "=" +(n1/n2));
    }
}