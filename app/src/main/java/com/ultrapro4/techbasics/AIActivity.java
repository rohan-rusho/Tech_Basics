package com.ultrapro4.techbasics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class AIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai); // Make sure your XML layout matches this name

        AppCompatButton btnShareAI = findViewById(R.id.btnShareAI);
        btnShareAI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String shareText =
                        "What is AI (Artificial Intelligence)?\n\n" +
                                "Definition:\n" +
                                "Artificial Intelligence (AI) is technology that enables machines to mimic human intelligence—learning from data, making decisions, solving problems, and even understanding language.\n\n" +
                                "How Does It Work?\n" +
                                "AI uses large amounts of data, mathematical models, and powerful computers to spot patterns, learn tasks, and make predictions. Some AI is programmed with rules, while more advanced AI learns from experience (machine learning).\n\n" +
                                "Key Uses:\n" +
                                "• Voice assistants (Siri, Google Assistant)\n" +
                                "• Language translation\n" +
                                "• Self-driving cars\n" +
                                "• Recommending movies and music\n" +
                                "• Medical diagnosis\n" +
                                "• Customer support chatbots\n" +
                                "• Image and speech recognition\n" +
                                "• Gaming and robotics\n\n" +
                                "Fun Facts:\n" +
                                "• The term 'AI' was first used in 1956\n" +
                                "• AI can beat humans at chess and Go\n" +
                                "• AI writes stories, makes art, and creates music\n" +
                                "• Some AI models use more data than all the books in a big library!\n\n" +
                                "AI Safety Tips:\n" +
                                "• Don't trust everything AI says—double check important facts\n" +
                                "• Be mindful of sharing private info with AI\n" +
                                "• Use AI tools from trusted sources\n" +
                                "• Remember: AI doesn't have feelings or opinions\n\n" +
                                "How AI Helps This App:\n" +
                                "This app can use AI to personalize your learning, answer your questions, give smart suggestions, and improve your overall experience!";

                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareText);
                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }
        });
    }
}