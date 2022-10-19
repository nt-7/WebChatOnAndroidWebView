package com.example.webchatonandroidwebview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWebView: WebView = findViewById(R.id.webview1)

        // Should rewrite to your Web Chat client URL
        // ref) https://github.com/microsoft/BotFramework-WebChat/tree/master/samples
        myWebView.loadUrl("https://microsoft.github.io/BotFramework-WebChat/01.getting-started/a.full-bundle/");

        myWebView.getSettings().setJavaScriptEnabled(true);

    }
}