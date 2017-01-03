package com.usharama.yourfest.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.usharama.yourfest.R;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        WebView browser = (WebView) findViewById(R.id.webview);
        browser.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSfDUPhBWmHb2ojzvkoehMZgAcMWyvEO5AzXkufDEoQQJd7xwA/viewform");
        WebSettings webSettings = browser.getSettings();
        webSettings.setJavaScriptEnabled(true);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
