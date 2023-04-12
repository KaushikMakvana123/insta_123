package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CreditScoreApplicationActivity extends AppCompatActivity {

    AppCompatButton btnOnline,btnOffline,btnCalculator,btnBank,btnCredit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_score_application);
        initview();
    }

    private void initview() {
        btnOnline=findViewById(R.id.btnOnline);
        btnOffline=findViewById(R.id.btnOffline);
        btnCalculator=findViewById(R.id.btnCalculator);
        btnBank=findViewById(R.id.btnBank);
        btnCredit=findViewById(R.id.btnCredit);
        btnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CreditScoreApplicationActivity.this,CreditScoreApplicationActivity2.class);
                startActivity(i);
            }
        });

    }
}
