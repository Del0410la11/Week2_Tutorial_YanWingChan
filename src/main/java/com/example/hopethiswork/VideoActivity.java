package com.example.hopethiswork;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class VideoActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState2) {
        super.onCreate(savedInstanceState2);
        setContentView(R.layout.activity_video);

        WebView webView = (WebView)
                findViewById(R.id.webview);
        webView.loadUrl("https://www.youtube.com/watch?v=rA8MUR4pqNE");
    }
}
