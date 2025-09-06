package com.ultrapro4.techbasics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class BluetoothActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth); // Use your actual layout filename

        AppCompatButton btnShareBluetooth = findViewById(R.id.btnShareBluetooth);
        btnShareBluetooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String shareText =
                        "What is Bluetooth?\n\n" +
                                "Definition:\n" +
                                "Bluetooth is a short‑range wireless technology that lets devices like phones, headphones, speakers, and computers connect and share data directly with each other—without cables or the Internet.\n\n" +
                                "How Does It Work?\n" +
                                "Bluetooth devices use radio waves to create a private, secure connection over short distances (usually up to 10 meters). Devices must be paired to connect, ensuring only trusted devices communicate.\n\n" +
                                "Key Uses:\n" +
                                "• Connect headphones, earbuds, and speakers\n" +
                                "• Send files between devices\n" +
                                "• Use wireless keyboards and mice\n" +
                                "• Pair fitness trackers and smartwatches\n" +
                                "• Share Internet via Bluetooth tethering\n" +
                                "• Control smart home devices\n\n" +
                                "Fun Facts:\n" +
                                "• The Bluetooth logo combines two Viking runes\n" +
                                "• Named after a 10th-century Danish king, Harald Bluetooth\n" +
                                "• Today's Bluetooth is much faster than the original version\n" +
                                "• Billions of devices use Bluetooth worldwide\n\n" +
                                "Bluetooth Safety Tips:\n" +
                                "• Only pair with trusted devices\n" +
                                "• Turn off Bluetooth when not in use\n" +
                                "• Use 'hidden' or 'not discoverable' mode\n" +
                                "• Update device software\n" +
                                "• Remove old connections you don’t use\n\n" +
                                "How Bluetooth Helps This App:\n" +
                                "Bluetooth allows this app to connect to nearby devices for file sharing, collaboration, and syncing data without an Internet connection.";

                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);
                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });
    }
}