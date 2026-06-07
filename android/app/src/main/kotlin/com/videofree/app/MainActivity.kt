package com.videofree.app

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : Activity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val webView = WebView(this).apply {
            settings.apply {
                javaScriptEnabled = true
                domStorageEnabled = true
                allowFileAccess = true
                allowContentAccess = true
                setSupportZoom(false)
                builtInZoomControls = false
                mediaPlaybackRequiresUserGesture = false
            }
            webViewClient = object : WebViewClient() {}
        }
        setContentView(webView)
        webView.loadUrl("file:///android_asset/home.html")
    }

    override fun onBackPressed() {
        try {
            val wv = (window.decorView.findViewById(android.R.id.content) as? WebView)
                ?: (findViewById<WebView?>(android.R.id.content))
            if (wv?.canGoBack() == true) wv.goBack() else super.onBackPressed()
        } catch (_: Exception) {
            super.onBackPressed()
        }
    }
}

