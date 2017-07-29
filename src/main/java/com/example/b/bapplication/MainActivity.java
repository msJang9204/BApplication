package com.example.b.bapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addClick(View v){
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        TextView result =(TextView)findViewById(R.id.result);
        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());

        result.setText(Integer.toString(n1+ n2));

    }

    public void substractClick(View v){
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        TextView result =(TextView) findViewById(R.id.result);
        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());

        result.setText(Integer.toString(n1- n2));


    }

    public void multyplyClick(View v){
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        TextView result =(TextView) findViewById(R.id.result);
        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());

        result.setText(Integer.toString(n1 * n2));



    }


    public void divideClick(View v){
        EditText number1 = (EditText) findViewById(R.id.number1);
        EditText number2 = (EditText) findViewById(R.id.number2);
        TextView result =(TextView) findViewById(R.id.result);
        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());

        result.setText(Integer.toString(n1 / n2));

    }


}
