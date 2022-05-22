package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openRepository(View v) {
        Uri webpage = Uri.parse("https://github.com/bsef19m539/Practice");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

            startActivity(intent);

    }
    public void startLearning(View v) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }
    public void startQuiz(View v) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);

    }
}