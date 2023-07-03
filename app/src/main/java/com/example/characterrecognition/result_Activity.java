package com.example.characterrecognition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class result_Activity extends AppCompatActivity {
    TextView txt_result;
    FloatingActionButton FabButton;
    String result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        findViews();
        eventClick();
        result = getIntent().getStringExtra("res");
        txt_result.setText(result);
    }
    public void findViews(){
        txt_result = findViewById(R.id.txt_result);
        FabButton = findViewById(R.id.FabButton);
    }
    public void eventClick(){
        FabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}