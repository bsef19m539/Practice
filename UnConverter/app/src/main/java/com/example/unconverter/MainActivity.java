package com.example.unconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private TextView txt_view;
    private EditText edt_txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        txt_view=findViewById(R.id.textView);
        edt_txt=findViewById(R.id.editTextNumberDecimal);

//        btn.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View view)
//            {
//                Toast.makeText(MainActivity.this, "on click listener worked", Toast.LENGTH_SHORT).show();
//                String kg=edt_txt.getText().toString();
//                double pound=Double.parseDouble(kg)*2.205;
//                txt_view.setText("Weight in pounds is "+pound);
//            }
//        });

    }

    public void calculate(View view)
    {
        String kg=edt_txt.getText().toString();
        double pound=0.0;
        try {
            pound = Double.parseDouble(kg) * 2.205;
            txt_view.setText("Weight in pounds is "+pound);
        }
        catch(Exception ex)
        {
            txt_view.setText("exception occured "+ex.getMessage());
        }

    }

}