package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    TextView alpha;
    ImageView imgView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        alpha=findViewById(R.id.textView);
        imgView=findViewById(R.id.imageView);

        Intent intent=getIntent();
        alpha.setText(intent.getStringExtra("name"));
        imgView.setImageResource(intent.getIntExtra("image",0));
    }
}