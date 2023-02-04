package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.text.DecimalFormat;


public class AritmatikaKalkulator extends AppCompatActivity {

    EditText txtNumberOne;
    EditText txtNumberTwo;
    ImageButton imgPlus;
    ImageButton imgMinus;
    ImageButton imgTime;
    ImageButton imgDivided;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aritmatika_kalkulator);
        //
        txtNumberOne = findViewById(R.id.txtNumberOne);
        txtNumberTwo = findViewById(R.id.txtNumberTwo);
        imgPlus = findViewById(R.id.imgPlus);
        imgMinus = findViewById(R.id.imgMinus);
        imgTime = findViewById(R.id.imgTime);
        imgDivided = findViewById(R.id.imgDivided);

        imgPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(txtNumberOne.getText().toString()) || TextUtils.isEmpty(txtNumberTwo.getText().toString())){
                   Toast.makeText(getApplicationContext(),"Isi Angka", Toast.LENGTH_SHORT).show();
                }
                else {
                    int numb1 = Integer.valueOf(txtNumberOne.getText().toString());
                    int numb2 = Integer.valueOf(txtNumberTwo.getText().toString());

                    ShowToased(String.valueOf(numb1 + numb2));
                }
            }
        });

        imgMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(txtNumberOne.getText().toString()) || TextUtils.isEmpty(txtNumberTwo.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Isi Angka", Toast.LENGTH_SHORT).show();
                }
                else {
                    int numb1 = Integer.valueOf(txtNumberOne.getText().toString());
                    int numb2 = Integer.valueOf(txtNumberTwo.getText().toString());

                    ShowToased(String.valueOf(numb1 - numb2));
                }
            }
        });

        imgTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(txtNumberOne.getText().toString()) || TextUtils.isEmpty(txtNumberTwo.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Isi Angka", Toast.LENGTH_SHORT).show();
                }
                else {
                    int numb1 = Integer.valueOf(txtNumberOne.getText().toString());
                    int numb2 = Integer.valueOf(txtNumberTwo.getText().toString());

                    ShowToased(String.valueOf(numb1 * numb2));
                }
            }
        });

        imgDivided.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(txtNumberOne.getText().toString()) || TextUtils.isEmpty(txtNumberTwo.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Isi Angka", Toast.LENGTH_SHORT).show();
                }
                else{
                    double numb1 = Integer.valueOf(txtNumberOne.getText().toString());
                    double numb2 = Integer.valueOf(txtNumberTwo.getText().toString());

                    double hasil = numb1 / numb2;
                    Toast.makeText(getApplicationContext(), "Hasil : " + new DecimalFormat("##. ##").format(hasil), Toast.LENGTH_SHORT).show();
                }
                }
        });
    }

    private void ShowToased(String text) {
        Toast.makeText(AritmatikaKalkulator.this, text, Toast.LENGTH_SHORT).show();
    }
}