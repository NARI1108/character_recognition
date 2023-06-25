package com.example.characterrecognition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class testing_Activity extends AppCompatActivity {
    TextView txt_counter, txt_question1, txt_question2,txt_question3,txt_question4,txt_question5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing);
        findViews();
        animation();
    }
    public void findViews(){
        txt_counter = findViewById(R.id.txt_counter);
        txt_question1 = findViewById(R.id.txt_question1);
        txt_question2 = findViewById(R.id.txt_question2);
        txt_question3 = findViewById(R.id.txt_question3);
        txt_question4 = findViewById(R.id.txt_question4);
        txt_question5 = findViewById(R.id.txt_question5);
    }
    public void animation(){
        Animation animation_txt_counter = AnimationUtils.loadAnimation(this,R.anim.alpha);
        Animation animation_txt_question1 = AnimationUtils.loadAnimation(this,R.anim.translate_right);
        Animation animation_txt_question2 = AnimationUtils.loadAnimation(this,R.anim.translate_right);
        Animation animation_txt_question3 = AnimationUtils.loadAnimation(this,R.anim.translate_right);
        Animation animation_txt_question4 = AnimationUtils.loadAnimation(this,R.anim.translate_right);
        Animation animation_txt_question5 = AnimationUtils.loadAnimation(this,R.anim.translate_right);

        txt_counter.setAnimation(animation_txt_counter);
        txt_question1.setAnimation(animation_txt_question1);
        txt_question2.setAnimation(animation_txt_question2);
        txt_question3.setAnimation(animation_txt_question3);
        txt_question4.setAnimation(animation_txt_question4);
        txt_question5.setAnimation(animation_txt_question5);
    }
}