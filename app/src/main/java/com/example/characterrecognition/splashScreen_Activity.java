package com.example.characterrecognition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class splashScreen_Activity extends AppCompatActivity {
    LinearLayout img_splashScreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        splashScreen();
        findViews();
        animation();
    }
    public void splashScreen(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(splashScreen_Activity.this,MainActivity.class));
                finish();
            }
        },6000);
    }
    public void findViews(){
        img_splashScreen = findViewById(R.id.img_splashScreen);
    }
    public void animation(){
        Animation animation_splashScreen = AnimationUtils.loadAnimation(this,R.anim.alpha);

        img_splashScreen.setAnimation(animation_splashScreen);
    }
}