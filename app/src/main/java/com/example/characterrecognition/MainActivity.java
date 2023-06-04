package com.example.characterrecognition;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn_test, btn_about_us, btn_contact_us, btn_exit;
    MediaPlayer music;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        animation();
        setOnClickListener();
    }
    @Override
    public void onResume(){
        music = MediaPlayer.create(this,R.raw.music);
        music.start();
        super.onResume();
    }
    @Override
    protected void onPause() {
        if(music != null) music.release(); music=null;
        super.onPause();
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
    public void setOnClickListener(){
        btn_test.setOnClickListener(this);
        btn_about_us.setOnClickListener(this);
        btn_contact_us.setOnClickListener(this);
        btn_exit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){
            case R.id.btn_test:
                startActivity(new Intent(this,testing_Activity.class));
                break;
            case R.id.btn_about_us:
                new AlertDialog.Builder(this).setTitle(R.string.about_us).setMessage(R.string.about_us_txt).setIcon(R.drawable.icon).show();
                break;
            case R.id.btn_contact_us:
                startActivity(new Intent(MainActivity.this,contact_Us_Activity.class));
                break;
            case R.id.btn_exit:
                exit_Dialog();
        }
    }
    public void onBackPressed(){
        exit_Dialog();
    }
    void exit_Dialog(){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("Do you wanna exit?");
        alert.setCancelable(false);
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                 finish();
            }
        });
        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        alert.create().show();
    }
}