package com.example.characterrecognition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    Button btn_test, btn_about_us, btn_contact_us, btn_exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        animation();
    }
    public void findViews(){
        btn_test = findViewById(R.id.btn_test);
        btn_about_us = findViewById(R.id.btn_about_us);
        btn_contact_us = findViewById(R.id.btn_contact_us);
        btn_exit = findViewById(R.id.btn_exit);
    }
    public void animation(){
        Animation animation_btn_test = AnimationUtils.loadAnimation(this,R.anim.translate_left);
        Animation animation_btn_about_us = AnimationUtils.loadAnimation(this,R.anim.translate_left);
        Animation animation_btn_contact_us = AnimationUtils.loadAnimation(this,R.anim.translate_left);
        Animation animation_btn_exit = AnimationUtils.loadAnimation(this,R.anim.translate_left);

        btn_test.setAnimation(animation_btn_test);
        btn_about_us.setAnimation(animation_btn_about_us);
        btn_contact_us.setAnimation(animation_btn_contact_us);
        btn_exit.setAnimation(animation_btn_exit);
    }
}