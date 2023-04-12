package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CreditScoreApplicationActivity2 extends AppCompatActivity {
    CardView cdCompound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_score_application2);

        initview();
    }

    private void initview() {
        cdCompound = findViewById(R.id.cdCompound);
        cdCompound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CreditScoreApplicationActivity2.this,CreditScoreApplicationActivity3.class);
                startActivity(i);
            }
        });




    }
}