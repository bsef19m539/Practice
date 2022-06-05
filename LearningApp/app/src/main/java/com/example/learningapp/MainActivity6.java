package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity6 extends AppCompatActivity {
    ListView listView;
    String[] alphabets={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    // String[] imgs={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    int[] imgs={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l,R.drawable.m,R.drawable.n,R.drawable.o,R.drawable.p,R.drawable.q,R.drawable.r,R.drawable.s, R.drawable.t,R.drawable.u,R.drawable.v,R.drawable.w,R.drawable.x,R.drawable.y,R.drawable.z };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        ArrayList<Alphabet> arrayList = new ArrayList<Alphabet>();
        for(int i=0;i<25;i++)
        {
            arrayList.add(new Alphabet(alphabets[i],imgs[i]));
        }
        List_Adapter adapter = new List_Adapter(this,arrayList);

        listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}