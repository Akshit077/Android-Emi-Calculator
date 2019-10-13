package com.example.emicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText t1=findViewById(R.id.Et1);
        final EditText t2=findViewById(R.id.Et2);
        final EditText t3=findViewById(R.id.Et3);
        final EditText t4=findViewById(R.id.Et4);
        Button a1=findViewById(R.id.b1);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double P=Integer.parseInt(t2.getText().toString());
                double T=Integer.parseInt(t3.getText().toString());
                double R=Integer.parseInt(t4.getText().toString());
                double r = R/(R*100);
                double x = Math.pow(1+r,T);
                final double emi=P*r*(x/(x-1));
                Intent in=new Intent(MainActivity.this,activity2.class);
                in.putExtra("emi",emi);
                in.putExtra("P",P);
                startActivity(in);
            }
        });
    }
}
