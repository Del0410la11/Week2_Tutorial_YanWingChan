package com.example.hopethiswork;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState2) {
        super.onCreate(savedInstanceState2);
        setContentView(R.layout.activity_detail);

        View a = findViewById(R.id.button2);
        a.setOnClickListener((View.OnClickListener) this);
    }

    public void onClick(View arg0) {
        if (arg0.getId() == R.id.button2) {

            Intent intent2 = new Intent(this, VideoActivity.class);
            this.startActivity(intent2);
        }
    }

}