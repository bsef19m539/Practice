package com.example.learningapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class List_Adapter extends ArrayAdapter<Alphabet> {


    public List_Adapter(@NonNull Context context, ArrayList<Alphabet> arrayList) {
        super(context,0, arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Alphabet abc=getItem(position);
        convertView= LayoutInflater.from(getContext()).inflate(R.layout.activity_list__adapter,parent,false);

        TextView txt= convertView.findViewById(R.id.textView5);

        ImageView img = convertView.findViewById(R.id.imageView3);

        txt.setText(abc.alpha);

        img.setImageResource(abc.imgid);


        return convertView;


    }
}