package com.example.characterrecognition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class resource_Activity extends AppCompatActivity {
    WebView web_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource);
        findViews();
        webView();
    }
    public void findViews(){
        web_view = findViewById(R.id.web_view);
    }
    public void webView(){
        web_view.loadUrl("https://karboom.io/assessments/myers-briggs");
        web_view.getSettings().setJavaScriptEnabled(true);
        web_view.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
    }
}