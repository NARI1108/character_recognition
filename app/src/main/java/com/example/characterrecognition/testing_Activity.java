package com.example.characterrecognition;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

public class testing_Activity extends AppCompatActivity {
    TextView txt_counter, txt_question, txt_question1, txt_question2, txt_question3, txt_question4, txt_question5;
    int score=0, counter=1, total_question=13;
    MediaPlayer sound_click, music;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing);
        sound_click = MediaPlayer.create(this,R.raw.button);
        findViews();
        animation();
        setQuestion();
    }
    public void findViews(){
        txt_counter = findViewById(R.id.txt_counter);
        txt_question = findViewById(R.id.txt_question);
        txt_question1 = findViewById(R.id.txt_question1);
        txt_question2 = findViewById(R.id.txt_question2);
        txt_question3 = findViewById(R.id.txt_question3);
        txt_question4 = findViewById(R.id.txt_question4);
        txt_question5 = findViewById(R.id.txt_question5);
    }
    public void animation(){
        Animation animation_txt_counter = AnimationUtils.loadAnimation(this,R.anim.alpha);
        Animation animation_txt_question = AnimationUtils.loadAnimation(this,R.anim.alpha);
        Animation animation_txt_question1 = AnimationUtils.loadAnimation(this,R.anim.translate_right);
        Animation animation_txt_question2 = AnimationUtils.loadAnimation(this,R.anim.translate_right);
        Animation animation_txt_question3 = AnimationUtils.loadAnimation(this,R.anim.translate_right);
        Animation animation_txt_question4 = AnimationUtils.loadAnimation(this,R.anim.translate_right);
        Animation animation_txt_question5 = AnimationUtils.loadAnimation(this,R.anim.translate_right);

        txt_counter.setAnimation(animation_txt_counter);
        txt_question.setAnimation(animation_txt_question);
        txt_question1.setAnimation(animation_txt_question1);
        txt_question2.setAnimation(animation_txt_question2);
        txt_question3.setAnimation(animation_txt_question3);
        txt_question4.setAnimation(animation_txt_question4);
        txt_question5.setAnimation(animation_txt_question5);
    }

    public void texts_click(View view){
        switch(view.getId()){
            case R.id.txt_question1: score+=1;
              break;
            case R.id.txt_question2: score+=2;
              break;
            case R.id.txt_question3: score+=3;
              break;
            case R.id.txt_question4: score+=4;
              break;
            case R.id.txt_question5: score+=5;
              break;
        }
        counter+=1;
        sound_click.start();
        setQuestion();
    }
    @Override
    protected void onResume(){
        music = MediaPlayer.create(this,R.raw.music);
        music.setLooping(true);
        music.start();
        super.onResume();
    }
    @Override
    protected void onPause(){
        if(music != null) music.release(); music = null;
        super.onPause();
    }
    @Override
    protected void onDestroy() {
        if( sound_click != null ) sound_click.release(); sound_click=null;
        super.onDestroy();
    }
    private void setQuestion(){
     txt_counter.setText("question"+counter+"from"+total_question);
     switch(counter){
         case 1:
             txt_question.setText(getResources().getString(R.string.question1));
             txt_question1.setText(getResources().getString(R.string.question1_1));
             txt_question2.setText(getResources().getString(R.string.question1_2));
             txt_question3.setText(getResources().getString(R.string.question1_3));
             txt_question4.setText(getResources().getString(R.string.question1_4));
             txt_question5.setText(getResources().getString(R.string.question1_5));
             break;
         case 2:
             txt_question.setText(getResources().getString(R.string.question2));
             txt_question1.setText(getResources().getString(R.string.question2_1));
             txt_question2.setText(getResources().getString(R.string.question2_2));
             txt_question3.setText(getResources().getString(R.string.question2_3));
             txt_question4.setText(getResources().getString(R.string.question2_4));
             txt_question5.setText(getResources().getString(R.string.question2_5));
             break;
         case 3:
             txt_question.setText(getResources().getString(R.string.question3));
             txt_question1.setText(getResources().getString(R.string.question3_1));
             txt_question2.setText(getResources().getString(R.string.question3_2));
             txt_question3.setText(getResources().getString(R.string.question3_3));
             txt_question4.setText(getResources().getString(R.string.question3_4));
             txt_question5.setText(getResources().getString(R.string.question3_5));
             break;
         case 4:
             txt_question.setText(getResources().getString(R.string.question4));
             txt_question1.setText(getResources().getString(R.string.question4_1));
             txt_question2.setText(getResources().getString(R.string.question4_2));
             txt_question3.setText(getResources().getString(R.string.question4_3));
             txt_question4.setText(getResources().getString(R.string.question4_4));
             txt_question5.setText(getResources().getString(R.string.question4_5));
             break;
         case 5:
             txt_question.setText(getResources().getString(R.string.question5));
             txt_question1.setText(getResources().getString(R.string.question5_1));
             txt_question2.setText(getResources().getString(R.string.question5_2));
             txt_question3.setText(getResources().getString(R.string.question5_3));
             txt_question4.setText(getResources().getString(R.string.question5_4));
             txt_question5.setText(getResources().getString(R.string.question5_5));
             break;
         case 6:
             txt_question.setText(getResources().getString(R.string.question6));
             txt_question1.setText(getResources().getString(R.string.question6_1));
             txt_question2.setText(getResources().getString(R.string.question6_2));
             txt_question3.setText(getResources().getString(R.string.question6_3));
             txt_question4.setText(getResources().getString(R.string.question6_4));
             txt_question5.setText(getResources().getString(R.string.question6_5));
             break;
         case 7:
             txt_question.setText(getResources().getString(R.string.question7));
             txt_question1.setText(getResources().getString(R.string.question7_1));
             txt_question2.setText(getResources().getString(R.string.question7_2));
             txt_question3.setText(getResources().getString(R.string.question7_3));
             txt_question4.setText(getResources().getString(R.string.question7_4));
             txt_question5.setText(getResources().getString(R.string.question7_5));
             break;
         case 8:
             txt_question.setText(getResources().getString(R.string.question8));
             txt_question1.setText(getResources().getString(R.string.question8_1));
             txt_question2.setText(getResources().getString(R.string.question8_2));
             txt_question3.setText(getResources().getString(R.string.question8_3));
             txt_question4.setText(getResources().getString(R.string.question8_4));
             txt_question5.setText(getResources().getString(R.string.question8_5));
             break;
         case 9:
             txt_question.setText(getResources().getString(R.string.question9));
             txt_question1.setText(getResources().getString(R.string.question9_1));
             txt_question2.setText(getResources().getString(R.string.question9_2));
             txt_question3.setText(getResources().getString(R.string.question9_3));
             txt_question4.setText(getResources().getString(R.string.question9_4));
             txt_question5.setText(getResources().getString(R.string.question9_5));
         case 10:
             txt_question.setText(getResources().getString(R.string.question10));
             txt_question1.setText(getResources().getString(R.string.question10_1));
             txt_question2.setText(getResources().getString(R.string.question10_2));
             txt_question3.setText(getResources().getString(R.string.question10_3));
             txt_question4.setText(getResources().getString(R.string.question10_4));
             txt_question5.setText(getResources().getString(R.string.question10_5));
             break;
         case 11:
             txt_question.setText(getResources().getString(R.string.question11));
             txt_question1.setText(getResources().getString(R.string.question11_1));
             txt_question2.setText(getResources().getString(R.string.question11_2));
             txt_question3.setText(getResources().getString(R.string.question11_3));
             txt_question4.setText(getResources().getString(R.string.question11_4));
             txt_question5.setText(getResources().getString(R.string.question11_5));
             break;
         case 12:
             txt_question.setText(getResources().getString(R.string.question12));
             txt_question1.setText(getResources().getString(R.string.question12_1));
             txt_question2.setText(getResources().getString(R.string.question12_2));
             txt_question3.setText(getResources().getString(R.string.question12_3));
             txt_question4.setText(getResources().getString(R.string.question12_4));
             txt_question5.setText(getResources().getString(R.string.question12_5));
             break;
         case 13:
             txt_question.setText(getResources().getString(R.string.question13));
             txt_question1.setText(getResources().getString(R.string.question13_1));
             txt_question2.setText(getResources().getString(R.string.question13_2));
             txt_question3.setText(getResources().getString(R.string.question13_3));
             txt_question4.setText(getResources().getString(R.string.question13_4));
             txt_question5.setText(getResources().getString(R.string.question13_5));
             break;
         default:
             break;
     }
    }
}