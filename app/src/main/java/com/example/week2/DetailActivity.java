package com.example.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.net.URI;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String message1 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_KEY_1);

        TextView myDetailText = findViewById(R.id.intent_text_in_detail);
        myDetailText.setText(message1);

        Button videoButton = findViewById(R.id.play_video_button);
        videoButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent implicitIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=PjrAwC4TIPA&ab_channel=BLACKPINK"));

                startActivity(implicitIntent);
            }
        });
    }
}