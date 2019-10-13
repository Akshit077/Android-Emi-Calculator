package com.example.emicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        /*Intent i=getIntent();
        String emi=i.getStringExtra("emi");*/
        final Double emi=getIntent().getExtras().getDouble("emi");
            final TextView E= findViewById(R.id.ac2);
        E.setText(String.valueOf(emi));
        Double P=getIntent().getExtras().getDouble("P");
        TextView S=findViewById(R.id.pqr);
        S.setText(String.valueOf(P));
        final Button bt1=findViewById(R.id.B11);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newIntent=new Intent(Intent.ACTION_SEND);
                newIntent.setType("text/Plain");
                newIntent.putExtra(Intent.EXTRA_TEXT,"This is emi");
                newIntent .putExtra(Intent.EXTRA_TEXT,emi);
                startActivity(Intent.createChooser(newIntent,"Share using"));
            }
        });
    }
}
