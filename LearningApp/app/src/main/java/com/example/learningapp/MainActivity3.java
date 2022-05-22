package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    Button submit;
    TextView txtview;
    RadioButton E,B,O,H,A,C,I,S,X;
    int score=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        submit=findViewById(R.id.button4);
        txtview=findViewById(R.id.textView2);
        E=findViewById(R.id.E);
        B=findViewById(R.id.B);
        O=findViewById(R.id.O);
        H=findViewById(R.id.H);
        A=findViewById(R.id.A);
        C=findViewById(R.id.C);
        I=findViewById(R.id.I);
        S=findViewById(R.id.S);
        X=findViewById(R.id.X);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(E.isChecked()){
                    score=score+1;
                }
                else{
                    E.setBackgroundColor(Color.GREEN);
                }
                if(B.isChecked()){
                    score=score+1;
                }
                else{
                    B.setBackgroundColor(Color.GREEN);
                }
                if(O.isChecked()){
                    score=score+1;
                }
                else{
                    O.setBackgroundColor(Color.GREEN);
                }
                if(H.isChecked()){
                    score=score+1;
                }
                else{
                    H.setBackgroundColor(Color.GREEN);
                }
                if(A.isChecked()){
                    score=score+1;
                }
                else{
                    A.setBackgroundColor(Color.GREEN);
                }
                if(C.isChecked()){
                    score=score+1;
                }
                else{
                    C.setBackgroundColor(Color.GREEN);
                }
                if(I.isChecked()){
                    score=score+1;
                }
                else{
                    I.setBackgroundColor(Color.GREEN);
                }
                if(S.isChecked()){
                    score=score+1;
                }
                else{
                    S.setBackgroundColor(Color.GREEN);
                }
                if(X.isChecked()){
                    score=score+1;
                }
                else{
                    X.setBackgroundColor(Color.GREEN);
                }
                txtview.setText("           Your score is "+score+" out of 9");
            }
        });
    }
}