package com.example.fa12ex2;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MusicDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_news);

        Intent intent = getIntent();
        String newsTitle = intent.getStringExtra("newsTitle");

        // Set the title on the action bar
        getSupportActionBar().setTitle(newsTitle);

        // Display image (you need to replace R.drawable.news1 with your actual image resource)
        ImageView newsImageView = findViewById(R.id.newsImageView);
        newsImageView.setImageResource(R.drawable.news1);

        // Display news title
        TextView titleTextView = findViewById(R.id.newsTitleTextView);
        titleTextView.setText(newsTitle);
    }
}