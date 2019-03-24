package com.jac.baduncontrol

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.tencent.smtt.sdk.WebView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var webView: WebView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.webview)

        val settings = webview.settings
        settings.javaScriptEnabled = true
        settings.javaScriptCanOpenWindowsAutomatically = true
        settings.domStorageEnabled = true
        settings.allowFileAccess = true
        settings.loadsImagesAutomatically = true
        settings.useWideViewPort = true
        settings.setAppCacheEnabled(true)


        val url = "http://222.189.238.246:8800"
        webView?.loadUrl(url)

    }

    override fun onBackPressed() {
        if (webview?.canGoBack()!!) {
            webView?.goBack()
            return
        }

        super.onBackPressed()
    }


}
