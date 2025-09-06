package com.ultrapro4.techbasics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class AppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app); // Ensure your XML layout is named activity_app.xml

        AppCompatButton btnShareApp = findViewById(R.id.btnShareApp);
        btnShareApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String shareText =
                        "What is an App?\n\n" +
                                "Definition:\n" +
                                "An app (short for application) is a piece of software designed to perform specific tasks or solve particular problems. Apps run on phones, tablets, computers, and even smart TVs.\n\n" +
                                "How Does It Work?\n" +
                                "Apps are installed on your device and use its resources (like memory, storage, and Internet) to provide tools, entertainment, or information. Some apps work offline; others need an Internet connection.\n\n" +
                                "Key Uses:\n" +
                                "• Messaging (WhatsApp, Telegram)\n" +
                                "• Social media (Instagram, Facebook)\n" +
                                "• Browsing the web\n" +
                                "• Watching videos and listening to music\n" +
                                "• Playing games\n" +
                                "• Online shopping\n" +
                                "• Banking and payments\n" +
                                "• Studying and productivity\n\n" +
                                "Fun Facts:\n" +
                                "• The first mobile app stores launched in 2008\n" +
                                "• There are millions of apps on Google Play and App Store\n" +
                                "• Some apps are free, some paid, some have in-app purchases\n" +
                                "• The most-downloaded app ever is TikTok!\n\n" +
                                "App Safety Tips:\n" +
                                "• Only download apps from official stores\n" +
                                "• Check app permissions before installing\n" +
                                "• Keep apps updated for security\n" +
                                "• Uninstall apps you don’t use\n" +
                                "• Avoid sharing sensitive info in apps\n\n" +
                                "How Apps Help This App:\n" +
                                "This app helps you explore the world of technology by making learning fun and interactive, all from your phone or tablet!";

                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);
                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });
    }
}