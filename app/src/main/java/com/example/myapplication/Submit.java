package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Submit extends AppCompatActivity {

    EditText edtName;
    View btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
    }
    private void initview(){
        edtName=findViewById(R.id.edtName);
        btnSubmit=findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                String name;
                name=edtName.getText().toString();
                if(name.isEmpty())
                {
                    Toast.makeText(Submit.this, "please enter your name", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Submit.this,"your name is==>"+name,Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}