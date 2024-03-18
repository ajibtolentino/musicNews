package com.example.fa12ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button for the first music news
        Button news1Button = findViewById(R.id.news1Button);
        news1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MusicNews.class);
                intent.putExtra("newsTitle", "Music News 1");
                intent.putExtra("newsDetail", "Details about Music News 1...");
                startActivity(intent);
            }
        });

        // Button for the second music news
        Button news2Button = findViewById(R.id.news2Button);
        news2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MusicNews.class);
                intent.putExtra("newsTitle", "Music News 2");
                intent.putExtra("newsDetail", "Details about Music News 2...");
                startActivity(intent);
            }
        });
    }
}