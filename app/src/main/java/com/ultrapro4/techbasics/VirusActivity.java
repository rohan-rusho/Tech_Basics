package com.ultrapro4.techbasics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class VirusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virus); // XML file should match this name

        AppCompatButton btnShareVirus = findViewById(R.id.btnShareVirus);
        btnShareVirus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String shareText =
                        "What is a Computer Virus?\n\n" +
                                "Definition:\n" +
                                "A computer virus is a harmful program that can copy itself and spread to other computers. It can damage files, steal information, or slow down your device.\n\n" +
                                "How Does It Work?\n" +
                                "Viruses often hide in email attachments, downloads, or fake links. Once opened, they can spread, damage your data, or let hackers control your device.\n\n" +
                                "Key Effects:\n" +
                                "• Slows down your device\n" +
                                "• Deletes or corrupts files\n" +
                                "• Steals passwords or data\n" +
                                "• Shows unwanted ads\n" +
                                "• Crashes apps or the system\n" +
                                "• Spreads to other computers\n\n" +
                                "Fun Facts:\n" +
                                "• The first computer virus was created in 1971\n" +
                                "• Some viruses are just pranks, but many cause real harm\n" +
                                "• Antivirus software helps protect your device\n" +
                                "• Viruses can infect computers, phones, and tablets\n\n" +
                                "How to Stay Safe:\n" +
                                "• Don’t open suspicious emails or links\n" +
                                "• Download apps only from trusted stores\n" +
                                "• Keep your device updated\n" +
                                "• Use antivirus software\n" +
                                "• Back up important files\n\n" +
                                "How This App Helps:\n" +
                                "Learn how to spot, avoid, and protect yourself from computer viruses with simple tips and clear explanations.";

                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);
                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });
    }
}