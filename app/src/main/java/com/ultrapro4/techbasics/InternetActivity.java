package com.ultrapro4.techbasics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class InternetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internet); // Change to your actual layout file name

        AppCompatButton btnShare = findViewById(R.id.btnShareInternet);
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The content you wish to share
                String shareText =
                        "What is the Internet?\n\n" +
                                "Definition:\n" +
                                "The Internet is a global system of interconnected computer networks allowing billions of devices to communicate, share information, and access resources. It is the backbone of modern communication, work, education, and entertainment.\n\n" +
                                "How Does It Work?\n" +
                                "The Internet connects devices via wires, wireless signals, and satellites. Data travels rapidly using standard rules called protocols (like TCP/IP).\n\n" +
                                "Key Components:\n" +
                                "• Devices (computers, phones, TVs)\n" +
                                "• Routers & switches\n" +
                                "• Servers\n" +
                                "• Cables (fiber, copper, undersea)\n" +
                                "• Wireless (Wi-Fi, mobile)\n" +
                                "• Protocols (TCP/IP)\n\n" +
                                "What Can You Do?\n" +
                                "• Search for information\n" +
                                "• Email and chat\n" +
                                "• Watch videos and listen to music\n" +
                                "• Social media\n" +
                                "• Shop, bank, and pay bills\n" +
                                "• Online games\n" +
                                "• Work and learn remotely\n" +
                                "• Store, share, and backup files\n\n" +
                                "Fun Facts:\n" +
                                "• The first website appeared in 1991\n" +
                                "• Over half the world's population uses the Internet\n" +
                                "• Every minute, 500+ hours of video are uploaded to YouTube\n" +
                                "• Even astronauts use the Internet!\n\n" +
                                "How the Internet Helps This App:\n" +
                                "Our app uses the Internet to fetch new learning content, sync your progress, connect you with other learners, and deliver notifications.";

                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);

                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });
    }
}