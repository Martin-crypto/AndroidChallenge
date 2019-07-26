package com.example.androidchallenge;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import de.hdodenhof.circleimageview.CircleImageView;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        CircleImageView mcircleImageView = (CircleImageView) findViewById(R.id.CircleImageView);

    }
}
