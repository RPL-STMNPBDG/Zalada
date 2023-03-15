package com.hermawan.zalada;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class putextra extends AppCompatActivity {
    private Button lanjut;
    private EditText usernameku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_putextra);

        lanjut = findViewById(R.id.lanjut);
        usernameku = findViewById(R.id.usernameku);

        lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = usernameku.getText().toString();

                Intent i = new Intent(putextra.this, getextra.class);
                i.putExtra("message", msg);
                startActivity(i);
            }
        });

}}