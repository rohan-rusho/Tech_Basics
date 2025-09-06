package com.ultrapro4.techbasics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class CloudStorageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cloud_storage); // Make sure your XML layout matches this name

        AppCompatButton btnShareCloud = findViewById(R.id.btnShareCloud);
        btnShareCloud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String shareText =
                        "What is Cloud Storage?\n\n" +
                                "Definition:\n" +
                                "Cloud storage lets you save files and data on the Internet instead of your device. You can access your files anytime, anywhere, from any connected device.\n\n" +
                                "How Does It Work?\n" +
                                "Your files are uploaded to secure servers on the Internet, managed by companies like Google, Apple, or Microsoft. You can upload, download, or share files as long as you have an Internet connection.\n\n" +
                                "Key Uses:\n" +
                                "• Backup important files\n" +
                                "• Access photos, videos, and documents on any device\n" +
                                "• Share files with others easily\n" +
                                "• Collaborate on documents in real-time\n" +
                                "• Free up space on your device\n\n" +
                                "Fun Facts:\n" +
                                "• The first cloud storage service was launched in 2006\n" +
                                "• 'Cloud' means the files are stored on remote servers, not in the sky!\n" +
                                "• Cloud storage can keep your files safe even if you lose your device\n\n" +
                                "Cloud Storage Safety Tips:\n" +
                                "• Use strong, unique passwords\n" +
                                "• Turn on two-factor authentication\n" +
                                "• Don’t share sensitive info on public links\n" +
                                "• Log out on shared devices\n" +
                                "• Regularly review what’s stored in the cloud\n\n" +
                                "How Cloud Storage Helps This App:\n" +
                                "This app uses cloud storage to save your progress, share files, and let you access your data from any device—anytime, anywhere!";

                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);
                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });
    }
}