package com.example.characterrecognition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class testing_Activity extends AppCompatActivity {
    TextView txt_counter, txt_question1, txt_question2,txt_question3,txt_question4,txt_question5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing);
        findViews();
    }
    public void findViews(){
        txt_counter = findViewById(R.id.txt_counter);
        txt_question1 = findViewById(R.id.txt_question1);
        txt_question2 = findViewById(R.id.txt_question2);
        txt_question3 = findViewById(R.id.txt_question3);
        txt_question4 = findViewById(R.id.txt_question4);
        txt_question5 = findViewById(R.id.txt_question5);
    }
}