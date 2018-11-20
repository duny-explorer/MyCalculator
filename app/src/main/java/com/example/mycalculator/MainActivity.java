package com.example.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Sum(View view) {
        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        String s1 = num1.getText().toString();
        String s2 = num2.getText().toString();
        if (!s1.equals("") && !s2.equals("")) {
            TextView text = findViewById(R.id.text);
            float slag1 = Integer.parseInt(s1);
            float slag2 = Integer.parseInt(s2);
            float sum = slag1 + slag2;
            text.setText(sum + "");
        }
    }

    public void Sub(View view) {
        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        String s1 = num1.getText().toString();
        String s2 = num2.getText().toString();
        if (!s1.equals("") && !s2.equals("")) {
            TextView text = findViewById(R.id.text);
            float sub1 = Integer.parseInt(s1);
            float sub2 = Integer.parseInt(s2);
            float sub = sub1 - sub2;
            text.setText(sub + "");
        }
    }

    public void Mul(View view) {
        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        String s1 = num1.getText().toString();
        String s2 = num2.getText().toString();
        if (!s1.equals("") && !s2.equals("")) {
            TextView text = findViewById(R.id.text);
            float mul1 = Integer.parseInt(s1);
            float mul2 = Integer.parseInt(s2);
            float mul = mul1 * mul2;
            text.setText(mul + "");
        }
    }

    public void Div(View view) {
        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        String s1 = num1.getText().toString();
        String s2 = num2.getText().toString();
        if (!s1.equals("") && !s2.equals("")  && !s2.equals("0")) {
            TextView text = findViewById(R.id.text);
            float div1 = Integer.parseInt(s1);
            float div2 = Integer.parseInt(s2);
            float div = div1 / div2;
            text.setText(div + "");
        }
    }
}
