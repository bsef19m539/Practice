package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button btn;
    Button btnnext;
    Button btnprevious;
    TextView txtview;
    ImageView imgview;
    public int next;
    public int previous;
    String[] alphabets={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
   // String[] imgs={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    int[] imgs={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l,R.drawable.m,R.drawable.n,R.drawable.o,R.drawable.p,R.drawable.q,R.drawable.r,R.drawable.s, R.drawable.t,R.drawable.u,R.drawable.v,R.drawable.w,R.drawable.x,R.drawable.y,R.drawable.z };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        next=0;
        previous=0;
        btn=findViewById(R.id.btn1);
        btnnext=findViewById(R.id.button5);
        btnprevious=findViewById(R.id.button6);
        txtview=findViewById(R.id.textView3);
        imgview=findViewById(R.id.imageView2);
        Intent intent = getIntent();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(getApplicationContext(),"Hello Javatpoint",Toast.LENGTH_SHORT).show();
                imgview.setVisibility(View.VISIBLE);
            }
        });


        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(next==24)
                {
                    btnnext.setVisibility(View.INVISIBLE);
                }
                imgview.setVisibility(View.INVISIBLE);
                next=next+1;
                txtview.setText(alphabets[next]);
                imgview.setImageResource(imgs[next]);
                btnprevious.setVisibility(View.VISIBLE);


            }
        });
        btnprevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(next==1)
                {
                    btnprevious.setVisibility(View.INVISIBLE);
                }
                imgview.setVisibility(View.VISIBLE);
                next=next-1;
                txtview.setText(alphabets[next]);
                imgview.setImageResource(imgs[next]);
            }
        });


    }

    @Override
    protected void onResume() {
        super. onResume();
        if(next==4)
        {
            btnnext.setVisibility(View.INVISIBLE);
        }
        if(next==0)
        {
            btnprevious.setVisibility(View.INVISIBLE);
        }
    }

}