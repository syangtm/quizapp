package com.example.ssyang.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submit(View view){
        int score = 0;
        RadioButton q1 = (RadioButton) findViewById(R.id.right1);
        if(q1.isChecked())
            score++;
        RadioButton q2 = (RadioButton) findViewById(R.id.right2);
        if(q2.isChecked())
            score++;
        RadioButton q3 = (RadioButton) findViewById(R.id.right3);
        if(q3.isChecked())
            score++;
        CheckBox q4right1 = (CheckBox) findViewById(R.id.click2);
        CheckBox q4right2 = (CheckBox) findViewById(R.id.click3);
        CheckBox q4wrong1 = (CheckBox) findViewById(R.id.click1);
        CheckBox q4wrong2 = (CheckBox) findViewById(R.id.click4);
        if((q4right1.isChecked() && q4right2.isChecked()) && !(q4wrong1.isChecked() || q4wrong2.isChecked()))
            score++;
        EditText q5 = (EditText) findViewById(R.id.right5);
        String q51 = (String) q5.getText().toString();
        if(q51.toLowerCase().matches( "oliver") )
            score++;

        Toast.makeText(getApplicationContext(), "You got " + score + " correct!!", Toast.LENGTH_LONG).show();

    }
}
