package com.example.fa12ex2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.TextView;
import android.os.Bundle;

public class MusicNews extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_detail);

        Intent intent = getIntent();
        String newsTitle = intent.getStringExtra("newsTitle");
        String newsDetail = intent.getStringExtra("newsDetail");

        // Set the title on the action bar
        getSupportActionBar().setTitle(newsTitle);

        // Display news details
        TextView detailTextView = findViewById(R.id.newsDetailTextView);
        detailTextView.setText(newsDetail);
    }
}