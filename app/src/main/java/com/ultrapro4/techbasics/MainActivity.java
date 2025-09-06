package com.ultrapro4.techbasics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Internet
        CardView cardInternet = findViewById(R.id.cardInternet);
        cardInternet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, InternetActivity.class));
            }
        });

        // Wi-Fi
        CardView cardWifi = findViewById(R.id.cardWifi);
        cardWifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, WifiActivity.class));
            }
        });

        // Bluetooth
        CardView cardBluetooth = findViewById(R.id.cardBluetooth);
        cardBluetooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BluetoothActivity.class));
            }
        });

        // Cloud Storage
        CardView cardCloud = findViewById(R.id.cardCloud);
        cardCloud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CloudStorageActivity.class));
            }
        });

        // AI
        CardView cardAI = findViewById(R.id.cardAI);
        cardAI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AIActivity.class));
            }
        });

        // QR Code
        CardView cardQR = findViewById(R.id.cardQR);
        cardQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, QRActivity.class));
            }
        });

        // App
        CardView cardApp = findViewById(R.id.cardApp);
        cardApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AppActivity.class));
            }
        });

        // Computer Virus
        CardView cardVirus = findViewById(R.id.cardVirus);
        cardVirus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, VirusActivity.class));
            }
        });
    }
}