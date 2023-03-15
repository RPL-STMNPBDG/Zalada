package com.hermawan.zalada;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String namaproduk, hargaproduk, isi, oto, data, priya, wanieta, puta, ba;
    String namaproduk2, hargaproduk2;
    String namaproduk3, hargaproduk3;
    String namaproduk4, hargaproduk4;
    String namaproduk5, hargaproduk5;
    String namaproduk6, hargaproduk6;
    String name, price;
    String name2, price2;
    String name3, price3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView juba = (TextView) findViewById(R.id.baju);

        juba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ba = "Ini halaman baju";
                Intent sendData = new Intent(MainActivity.this, tampilhalaman.class);
                sendData.putExtra("Data1", ba);
                startActivity(sendData);
                finish();
            }
        });

        // Batas

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView kom = (TextView) findViewById(R.id.komputer);

        kom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                puta = "Ini halaman komputer";
                Intent sendData = new Intent(MainActivity.this, tampilhalaman.class);
                sendData.putExtra("Data1", puta);
                startActivity(sendData);
                finish();
            }
        });

        // Batas

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView fawa = (TextView) findViewById(R.id.wanita);

        fawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wanieta = "Ini halaman fashion wanita";
                Intent sendData = new Intent(MainActivity.this, tampilhalaman.class);
                sendData.putExtra("Data1", wanieta);
                startActivity(sendData);
                finish();
            }
        });

        // Batas

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView fapa = (TextView) findViewById(R.id.pria);

        fapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                priya = "Ini halaman fashion pria";
                Intent sendData = new Intent(MainActivity.this, tampilhalaman.class);
                sendData.putExtra("Data1", priya);
                startActivity(sendData);
                finish();
            }
        });

        // Batas

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView nyimpan = (TextView) findViewById(R.id.simpandata);

        nyimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = "Ini halaman penyimpanan data";
                Intent sendData = new Intent(MainActivity.this, tampilhalaman.class);
                sendData.putExtra("Data1", data);
                startActivity(sendData);
                finish();
            }
        });

        // Batas

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView otoma = (TextView) findViewById(R.id.otomasi);

        otoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oto = "Ini halaman otomotif";
                Intent sendData = new Intent(MainActivity.this, tampilhalaman.class);
                sendData.putExtra("Data1", oto);
                startActivity(sendData);
                finish();
            }
        });

        // Batas

        TextView all = (TextView) findViewById(R.id.semua);

        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isi = "Ini halaman all";
                Intent sendData = new Intent(MainActivity.this, tampilhalaman.class);
                sendData.putExtra("Data1", isi);
                startActivity(sendData);
                finish();
            }
        });

        // Batas

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView bebelac3 = (ImageView) findViewById(R.id.bebelac3);

        bebelac3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name3 = "Bebelac";
                price3 = "5000";

                Intent sendData = new Intent(MainActivity.this, tampilproduk.class);
                sendData.putExtra("Data1", name3);
                sendData.putExtra("Data2", price3);
                startActivity(sendData);
                finish();
            }
        });

        // Batas

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView bebelac2 = (ImageView) findViewById(R.id.bebelac2);

        bebelac2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name2 = "Bebelac";
                price2 = "25000";

                Intent sendData = new Intent(MainActivity.this, tampilproduk.class);
                sendData.putExtra("Data1", name2);
                sendData.putExtra("Data2", price2);
                startActivity(sendData);
                finish();
            }
        });

        // Batas

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView bebelac1 = (ImageView) findViewById(R.id.bebelac1);

        bebelac1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = "Bebelac";
                price = "50000";

                Intent sendData = new Intent(MainActivity.this, tampilproduk.class);
                sendData.putExtra("Data1", name);
                sendData.putExtra("Data2", price);
                startActivity(sendData);
                finish();
            }
        });

        // Batas

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView produkflash6 = (ImageView) findViewById(R.id.lazflash6);

        produkflash6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                namaproduk6 = "NIVEA Body Serum";
                hargaproduk6 = "30900";

                Intent sendData = new Intent(MainActivity.this, tampilproduk.class);
                sendData.putExtra("Data1", namaproduk6);
                sendData.putExtra("Data2", hargaproduk6);
                startActivity(sendData);
                finish();
            }
        });

        // Batas

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView produkflash5 = (ImageView) findViewById(R.id.lazflash5);

        produkflash5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                namaproduk5 = "Vivo Y20";
                hargaproduk5 = "1169901";

                Intent sendData = new Intent(MainActivity.this, tampilproduk.class);
                sendData.putExtra("Data1", namaproduk5);
                sendData.putExtra("Data2", hargaproduk5);
                startActivity(sendData);
                finish();
            }
        });

        // Batas

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView produkflash4 = (ImageView) findViewById(R.id.lazflash4);

        produkflash4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                namaproduk4 = "Techno POVA 3";
                hargaproduk4 = "1799000";

                Intent sendData = new Intent(MainActivity.this, tampilproduk.class);
                sendData.putExtra("Data1", namaproduk4);
                sendData.putExtra("Data2", hargaproduk4);
                startActivity(sendData);
                finish();
            }
        });

        // Batas

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView produkflash3 = (ImageView) findViewById(R.id.lazflash3);

        produkflash3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                namaproduk3 = "NIVEA Body Serum";
                hargaproduk3 = "30900";

                Intent sendData = new Intent(MainActivity.this, tampilproduk.class);
                sendData.putExtra("Data1", namaproduk3);
                sendData.putExtra("Data2", hargaproduk3);
                startActivity(sendData);
                finish();
            }
        });

        // Batas

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView produkflash2 = (ImageView) findViewById(R.id.lazflash2);

        produkflash2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                namaproduk2 = "Vivo Y20";
                hargaproduk2 = "1169901";

                Intent sendData = new Intent(MainActivity.this, tampilproduk.class);
                sendData.putExtra("Data1", namaproduk2);
                sendData.putExtra("Data2", hargaproduk2);
                startActivity(sendData);
                finish();
            }
        });

        // Batas

        ImageView produkflash1 = (ImageView) findViewById(R.id.lazflash1);

        produkflash1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                namaproduk = "Techno POVA 3";
                hargaproduk = "1799000";

                Intent sendData = new Intent(MainActivity.this, tampilproduk.class);
                sendData.putExtra("Data1", namaproduk);
                sendData.putExtra("Data2", hargaproduk);
                startActivity(sendData);
                finish();
            }
        });
    }
}