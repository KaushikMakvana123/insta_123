package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MyApplication extends AppCompatActivity {
    Button btnSubmit;
    EditText edtName, edtLastName,edtphoneNo,edtAddress,edtEmail,edtBusiness,edtLng,edtRefrence,edtEducation,edtSkill;
    TextView result;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_application);
        initview();

    }

    private void initview() {

        edtName=findViewById(R.id.edtName);
        edtLastName = findViewById(R.id.edtLastName);
        edtphoneNo = (EditText) findViewById(R.id.edtphoneNo);
        edtAddress = (EditText) findViewById(R.id.edtAddress);
        edtEmail = (EditText)findViewById(R.id.edtEmail);
        edtBusiness = (EditText) findViewById(R.id.edtBusiness);
        edtLng = (EditText) findViewById(R.id.edtLng);
        edtRefrence = (EditText) findViewById(R.id.edtRefrence);
        edtEducation = (EditText) findViewById(R.id.edtEducation);
        edtSkill = (EditText) findViewById(R.id.edtSkill);
        btnSubmit = (Button)findViewById(R.id.btnSubmit);
        result = (TextView)findViewById(R.id.resultView);
        btnSubmit.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (edtName.getText().toString().isEmpty() && edtLastName.getText().toString().isEmpty() && edtphoneNo.getText().toString().isEmpty() && edtAddress.getText().toString().isEmpty()
                        && edtEmail.getText().toString().isEmpty() && edtBusiness.getText().toString().isEmpty() && edtLng.getText().toString().isEmpty() && edtRefrence.getText().toString().isEmpty() || edtEducation.getText().toString().isEmpty() || edtSkill.getText().toString().isEmpty() || btnSubmit.getText().toString().isEmpty() ) {
                    result.setText("Please Fill All the Details");
                } else {
                    result.setText("Name -  " + edtName.getText().toString() + " \n" + "Last Name -  " +edtLastName .getText().toString()
                            + " \n" + "Phone Number-  " + edtphoneNo.getText().toString() + " \n" + "Address -  " + edtAddress.getText().toString()
                            + " \n" + "Email -  " + edtEmail.getText().toString() + "\n"+"Business - "+edtBusiness.getText().toString() +"\n"+"Language - "+ edtLng.getText().toString()+"\n"+"Refrence - "+ edtRefrence.getText().toString()+"\n"+"Education - "+ edtEducation.getText().toString()+"\n"+"Skills - "+ edtSkill.getText().toString());
                }
            }
        });
    }
}
