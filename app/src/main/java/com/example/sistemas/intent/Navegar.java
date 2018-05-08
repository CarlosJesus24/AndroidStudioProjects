package com.example.sistemas.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Navegar extends AppCompatActivity {

    private WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegar);

        wv1 = findViewById(R.id.wv);
        String URL = getIntent().getStringExtra("URL");
        wv1.getSettings().setJavaScriptEnabled(true);
        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl("http://"+ URL);
    }

    public void cerrar(View view) {
        finish();
    }
}