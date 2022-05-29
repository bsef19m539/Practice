package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity4 extends AppCompatActivity {

    ListView lv;
    String[] alphabets={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    // String[] imgs={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    int[] imgs={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l,R.drawable.m,R.drawable.n,R.drawable.o,R.drawable.p,R.drawable.q,R.drawable.r,R.drawable.s, R.drawable.t,R.drawable.u,R.drawable.v,R.drawable.w,R.drawable.x,R.drawable.y,R.drawable.z };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        lv=findViewById(R.id.list);
        ArrayAdapter<String> arrayadapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,alphabets);
        lv.setAdapter(arrayadapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent intent=new Intent(MainActivity4.this, MainActivity5.class);
            intent.putExtra("name",alphabets[position]);
           intent.putExtra("image",imgs[position]);
           startActivity(intent);

            }
        });


    }
}