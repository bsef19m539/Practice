package com.example.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private EditText edt_txt;
    private TextView txt_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        edt_txt=findViewById(R.id.num);
        txt_view=findViewById(R.id.table);
    }

    public void displayTable(View view) {
        try {
            String s = edt_txt.getText().toString();

            int n = Integer.parseInt(s);
            String tbl="";
            for (int i = 1; i <= 10; i++) {

                tbl=tbl+n + " * " + i + " = " + n * i+"\n";

            }
            txt_view.setText(tbl);
        }
        catch(Exception ex)
        {
            txt_view.setText("exception occured "+ex.getMessage());
        }
    }

    }
