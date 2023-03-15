package com.hermawan.zalada;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class tampilproduk extends AppCompatActivity {
    Button hitung;
    TextView total;
    double Angka1, Angka2;
    EditText jumlahbeli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilproduk);

        TextView getdata32 = findViewById(R.id.muncul1);
        TextView getdata33 = findViewById(R.id.muncul2);
        total = (TextView) findViewById(R.id.total);
        jumlahbeli = (EditText) findViewById(R.id.jumlahbeli);

        getdata32.setText(getIntent().getStringExtra("Data1"));
        getdata33.setText(getIntent().getStringExtra("Data2"));

        hitung = (Button) findViewById(R.id.hitung);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Angka1 = Double.parseDouble(getdata33.getText().toString());
                Angka2 = Double.parseDouble(jumlahbeli.getText().toString());
                total.setText(Double.toString(Angka1 * Angka2));
            }
        });

        // Batas

        TextView getdata29 = findViewById(R.id.muncul1);
        TextView getdata30 = findViewById(R.id.muncul2);
        total = (TextView) findViewById(R.id.total);
        jumlahbeli = (EditText) findViewById(R.id.jumlahbeli);

        getdata29.setText(getIntent().getStringExtra("Data1"));
        getdata30.setText(getIntent().getStringExtra("Data2"));

        hitung = (Button) findViewById(R.id.hitung);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Angka1 = Double.parseDouble(getdata30.getText().toString());
                Angka2 = Double.parseDouble(jumlahbeli.getText().toString());
                total.setText(Double.toString(Angka1 * Angka2));
            }
        });

        // Batas

        TextView getdata26 = findViewById(R.id.muncul1);
        TextView getdata27 = findViewById(R.id.muncul2);
        total = (TextView) findViewById(R.id.total);
        jumlahbeli = (EditText) findViewById(R.id.jumlahbeli);

        getdata26.setText(getIntent().getStringExtra("Data1"));
        getdata27.setText(getIntent().getStringExtra("Data2"));

        hitung = (Button) findViewById(R.id.hitung);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Angka1 = Double.parseDouble(getdata27.getText().toString());
                Angka2 = Double.parseDouble(jumlahbeli.getText().toString());
                total.setText(Double.toString(Angka1 * Angka2));
            }
        });

        // Batas

        TextView getdata23 = findViewById(R.id.muncul1);
        TextView getdata24 = findViewById(R.id.muncul2);
        total = (TextView) findViewById(R.id.total);
        jumlahbeli = (EditText) findViewById(R.id.jumlahbeli);

        getdata23.setText(getIntent().getStringExtra("Data1"));
        getdata24.setText(getIntent().getStringExtra("Data2"));

        hitung = (Button) findViewById(R.id.hitung);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Angka1 = Double.parseDouble(getdata24.getText().toString());
                Angka2 = Double.parseDouble(jumlahbeli.getText().toString());
                total.setText(Double.toString(Angka1 * Angka2));
            }
        });

        // Batas

        TextView getdata20 = findViewById(R.id.muncul1);
        TextView getdata21 = findViewById(R.id.muncul2);
        total = (TextView) findViewById(R.id.total);
        jumlahbeli = (EditText) findViewById(R.id.jumlahbeli);

        getdata20.setText(getIntent().getStringExtra("Data1"));
        getdata21.setText(getIntent().getStringExtra("Data2"));

        hitung = (Button) findViewById(R.id.hitung);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Angka1 = Double.parseDouble(getdata21.getText().toString());
                Angka2 = Double.parseDouble(jumlahbeli.getText().toString());
                total.setText(Double.toString(Angka1 * Angka2));
            }
        });

        // Batas

        TextView getdata17 = findViewById(R.id.muncul1);
        TextView getdata18 = findViewById(R.id.muncul2);
        total = (TextView) findViewById(R.id.total);
        jumlahbeli = (EditText) findViewById(R.id.jumlahbeli);

        getdata17.setText(getIntent().getStringExtra("Data1"));
        getdata18.setText(getIntent().getStringExtra("Data2"));

        hitung = (Button) findViewById(R.id.hitung);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Angka1 = Double.parseDouble(getdata18.getText().toString());
                Angka2 = Double.parseDouble(jumlahbeli.getText().toString());
                total.setText(Double.toString(Angka1 * Angka2));
            }
        });

        // Batas

        TextView getdata14 = findViewById(R.id.muncul1);
        TextView getdata15 = findViewById(R.id.muncul2);
        total = (TextView) findViewById(R.id.total);
        jumlahbeli = (EditText) findViewById(R.id.jumlahbeli);

        getdata14.setText(getIntent().getStringExtra("Data1"));
        getdata15.setText(getIntent().getStringExtra("Data2"));

        hitung = (Button) findViewById(R.id.hitung);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Angka1 = Double.parseDouble(getdata15.getText().toString());
                Angka2 = Double.parseDouble(jumlahbeli.getText().toString());
                total.setText(Double.toString(Angka1 * Angka2));
            }
        });

        // Batas

        TextView getdata11 = findViewById(R.id.muncul1);
        TextView getdata12 = findViewById(R.id.muncul2);
        total = (TextView) findViewById(R.id.total);
        jumlahbeli = (EditText) findViewById(R.id.jumlahbeli);

        getdata11.setText(getIntent().getStringExtra("Data1"));
        getdata12.setText(getIntent().getStringExtra("Data2"));

        hitung = (Button) findViewById(R.id.hitung);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Angka1 = Double.parseDouble(getdata12.getText().toString());
                Angka2 = Double.parseDouble(jumlahbeli.getText().toString());
                total.setText(Double.toString(Angka1 * Angka2));
            }
        });

        // Batas

        TextView getdata1 = findViewById(R.id.muncul1);
        TextView getdata2 = findViewById(R.id.muncul2);
        total = (TextView) findViewById(R.id.total);
        jumlahbeli = (EditText) findViewById(R.id.jumlahbeli);


        getdata1.setText(getIntent().getStringExtra("Data1"));
        getdata2.setText(getIntent().getStringExtra("Data2"));

        hitung = (Button) findViewById(R.id.hitung);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Angka1 = Double.parseDouble(getdata2.getText().toString());
                Angka2 = Double.parseDouble(jumlahbeli.getText().toString());
                total.setText(Double.toString(Angka1 * Angka2));
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
        finish();
    }

}