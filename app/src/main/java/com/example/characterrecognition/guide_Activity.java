package com.example.characterrecognition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.VideoView;

public class guide_Activity extends AppCompatActivity {
    TextView txt_title;
    VideoView video_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        findViews();
        animation();
    }
    public void findViews(){
        txt_title  = findViewById(R.id.txt_title);
        video_view = findViewById(R.id.video_view);
    }
    public void animation(){
        Animation animation_txt_title = AnimationUtils.loadAnimation(this,R.anim.alpha);
        Animation animation_video_view = AnimationUtils.loadAnimation(this,R.anim.alpha);

        txt_title.setAnimation(animation_txt_title);
        video_view.setAnimation(animation_video_view);
    }
}