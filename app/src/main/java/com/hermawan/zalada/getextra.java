package com.hermawan.zalada;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class getextra extends AppCompatActivity {
    private TextView datausername;
    Button selanjutnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getextra);

        selanjutnya = (Button) findViewById(R.id.selanjutnya);
        selanjutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o = new Intent(view.getContext(), MainActivity.class);
                startActivity(o);
                finish();
            }
        });

        datausername = findViewById(R.id.datausername);
        datausername.setText(getIntent().getStringExtra("message"));
    }
}