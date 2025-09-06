package com.ultrapro4.techbasics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class QRActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr); // Make sure your XML matches this name

        AppCompatButton btnShareQR = findViewById(R.id.btnShareQR);
        btnShareQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String shareText =
                        "What is a QR Code?\n\n" +
                                "Definition:\n" +
                                "A QR code is a special kind of barcode shaped like a square. When you scan it with your phone, it can quickly link you to a website, show text, or share contact details.\n\n" +
                                "How Does It Work?\n" +
                                "Your phone's camera scans the pattern in the QR code. Special software reads the code and instantly opens the link or information stored inside.\n\n" +
                                "Key Uses:\n" +
                                "• Open websites quickly\n" +
                                "• Share Wi-Fi passwords\n" +
                                "• Pay bills or make payments\n" +
                                "• Download apps\n" +
                                "• View menus in restaurants\n" +
                                "• Add contacts or events\n" +
                                "• Authenticate logins\n\n" +
                                "Fun Facts:\n" +
                                "• 'QR' stands for Quick Response\n" +
                                "• Invented in Japan in 1994\n" +
                                "• Can store over 4,000 characters\n" +
                                "• Used worldwide for payments, tickets, and more\n\n" +
                                "QR Code Safety Tips:\n" +
                                "• Only scan QR codes from trusted places\n" +
                                "• Check the link before opening\n" +
                                "• Don't enter personal info if unsure\n" +
                                "• Be careful with codes in public places\n\n" +
                                "How QR Codes Help This App:\n" +
                                "This app uses QR codes to help you share links, access resources, and connect with others quickly and easily.";

                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);
                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });
    }
}