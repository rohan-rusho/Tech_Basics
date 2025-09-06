package com.ultrapro4.techbasics;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class WifiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi); // Make sure this matches your layout file name

        AppCompatButton btnShareWifi = findViewById(R.id.btnShareWifi);
        btnShareWifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String shareText =
                        "What is Wi‑Fi?\n\n" +
                                "Definition:\n" +
                                "Wi‑Fi is a wireless technology that allows devices to connect to the Internet and each other using radio waves, without needing cables.\n\n" +
                                "How Does It Work?\n" +
                                "A Wi‑Fi router sends out radio signals that nearby devices can detect and connect to. The router is usually connected to the Internet using a wired connection and shares that wirelessly.\n\n" +
                                "Key Uses:\n" +
                                "• Access the Internet on multiple devices\n" +
                                "• Share files and printers within a network\n" +
                                "• Stream videos and music\n" +
                                "• Play online games\n" +
                                "• Make voice and video calls\n" +
                                "• Work and study remotely\n\n" +
                                "Fun Facts:\n" +
                                "• Wi‑Fi was invented in 1997\n" +
                                "• The name 'Wi‑Fi' doesn't actually stand for anything!\n" +
                                "• Most modern devices come with Wi‑Fi built-in\n" +
                                "• Public Wi‑Fi is available in many airports, cafes, and libraries\n\n" +
                                "Wi‑Fi Safety Tips:\n" +
                                "• Use strong passwords for your Wi‑Fi network\n" +
                                "• Avoid public Wi‑Fi for sensitive transactions\n" +
                                "• Keep your device software updated\n" +
                                "• Forget networks you no longer use\n" +
                                "• Use VPN for extra privacy\n\n" +
                                "How Wi‑Fi Helps This App:\n" +
                                "A good Wi‑Fi connection lets this app download new content, update your progress, and keep you connected with others—quickly and without using mobile data.";

                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);
                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });
    }
}