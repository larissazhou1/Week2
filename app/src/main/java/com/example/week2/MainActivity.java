package com.example.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static String TAG = "MainActivity";
    public static String EXTRA_MESSAGE_KEY_1 = "This is my message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button launchButton = findViewById(R.id.launch_detail_button);
        launchButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);

                startActivity(intent);
            }
        });
    }

}