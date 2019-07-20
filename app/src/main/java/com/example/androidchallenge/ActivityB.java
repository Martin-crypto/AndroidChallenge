package com.example.androidchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;


public class ActivityB extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        String url = "http://andela.com/alc/";

        WebView web = (WebView) findViewById(R.id.webView);
        web.loadUrl(url);


    }
}
