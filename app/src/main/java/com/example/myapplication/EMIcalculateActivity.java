package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EMIcalculateActivity extends AppCompatActivity {

    EditText EMIamount,EMIrate,EMItime;

    TextView textviewcalculate,textIinterest,Tamount,Resent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emicalculate);
        initview();

    }

    private void initview() {
        EMIamount=findViewById(R.id.EMIamount);
        EMIrate=findViewById(R.id.EMIrate);
        EMItime=findViewById(R.id.EMItime);
        textIinterest=findViewById(R.id.textIinterest);
        textviewcalculate=findViewById(R.id.textviewcalculate);
        Tamount=findViewById(R.id.Tamount);
        Resent=findViewById(R.id.Resent);

        textviewcalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Integer p=Integer.parseInt(EMIamount.getText().toString());
                Integer r=Integer.parseInt(EMIrate.getText().toString());
                Integer n=Integer.parseInt(EMItime.getText().toString());

                float Totalrate = Float.valueOf(((p*r)/100));

                String totalint = String.valueOf(Totalrate);
                textIinterest.setText(Float.toString(Float.parseFloat(totalint)));

                float total =p+Totalrate;
                String totalamt = String.valueOf(total);
                Tamount.setText(totalamt);



            }
        });
        Resent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EMIamount.setText(null);
                EMIrate.setText(null);
                EMItime.setText(null);
                textIinterest.setText(null);

                Tamount.setText(null);

            }
        });
    }
}

