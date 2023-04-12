package com.example.myapplication;

import static com.example.myapplication.R.id.btnDisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SimpleRadiobutton extends AppCompatActivity
{
     RadioGroup radiogroup;
     RadioButton radioSinging,radioDancing,radioReading,radioGaming,radioOther;
     Button btnDisplay;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_radiobutton);
        initview();
    }

    private void initview() {
        {
            radioSinging = findViewById(R.id.radioSinging);
            radioDancing = findViewById(R.id.radioDancing);
            radioReading = findViewById(R.id.radioReading);
            radioGaming = findViewById(R.id.radioGaming);
            radioOther = findViewById(R.id.radioOther);
            radiogroup = findViewById(R.id.radiogroup);
            btnDisplay=findViewById(R.id.btnDisplay);

            radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int id) {
                    RadioButton radioButton = radioGroup.findViewById(id);
                    if(radioButton.getText().toString().equals("Singing"))
                    {
                        Toast.makeText(SimpleRadiobutton.this, "Singing", Toast.LENGTH_SHORT).show();
                    }
                    else if(radioButton.getText().toString().equals("Dancing"))
                    {
                        Toast.makeText(SimpleRadiobutton.this, "Dancing", Toast.LENGTH_SHORT).show();
                    }
                     else if(radioButton.getText().toString().equals("Reading"))
                    {
                        Toast.makeText(SimpleRadiobutton.this, "Reading", Toast.LENGTH_SHORT).show();
                    }
                     else if(radioButton.getText().toString().equals("Gaming"))
                    {
                        Toast.makeText(SimpleRadiobutton.this, "Gaming", Toast.LENGTH_SHORT).show();
                    }
                     else
                    {
                        Toast.makeText(SimpleRadiobutton.this, "Other", Toast.LENGTH_SHORT).show();
                    }


                }
            });

            btnDisplay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent i= new Intent(SimpleRadiobutton.this, InstragramApplication.class);
                    startActivity(i);
                }
            });

            }
        }
    }

