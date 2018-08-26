package com.example.siddharthdixit.speakify;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button sTTButton;
    public Button ttSButton;
    public Button tButton;

    protected void init()
    {
        sTTButton = findViewById(R.id.speechToTextButton);
        sTTButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent speech = new Intent(MainActivity.this,SpeechToText.class);
                startActivity(speech);
            }
        });

        ttSButton = findViewById(R.id.textToSpeechButton);
        ttSButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent text = new Intent(MainActivity.this,TexttoSpeech.class);
                startActivity(text);
            }
        });

        tButton = findViewById(R.id.translateButton);
        tButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent translation = new Intent(MainActivity.this,Translate.class);
                startActivity(translation);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


    }

}
