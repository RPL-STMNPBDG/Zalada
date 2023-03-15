package com.hermawan.zalada;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class tampilhalaman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilhalaman);

        TextView getdata10 = findViewById(R.id.muncul1);
        getdata10.setText(getIntent().getStringExtra("Data1"));

        // Batas

        TextView getdata9 = findViewById(R.id.muncul1);
        getdata9.setText(getIntent().getStringExtra("Data1"));

        // Batas

        TextView getdata8 = findViewById(R.id.muncul1);
        getdata8.setText(getIntent().getStringExtra("Data1"));

        // Batas

        TextView getdata7 = findViewById(R.id.muncul1);
        getdata7.setText(getIntent().getStringExtra("Data1"));

        // Batas

        TextView getdata6 = findViewById(R.id.muncul1);
        getdata6.setText(getIntent().getStringExtra("Data1"));

        // Batas

        TextView getdata5 = findViewById(R.id.muncul1);
        getdata5.setText(getIntent().getStringExtra("Data1"));

        // Batas

        TextView getdata4 = findViewById(R.id.muncul1);
        getdata4.setText(getIntent().getStringExtra("Data1"));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
        finish();
    }
}