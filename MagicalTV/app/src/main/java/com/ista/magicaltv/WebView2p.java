package com.ista.magicaltv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class WebView2p extends FragmentActivity {
    Url video=new Url();
    String urlsVideo="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        video.añadirVideos();
        if ((MainActivity.idImageResource == R.id.imageView11)) {
            urlsVideo = video.getUrls().get(0);
        } else if (MainActivity.idImageResource == R.id.imageView12) {
            urlsVideo = video.getUrls().get(1);
        } else if (MainActivity.idImageResource == R.id.imageView18){
            urlsVideo = video.getUrls().get(2);

        } else if (MainActivity.idImageResource == R.id.imageView19){
            urlsVideo = video.getUrls().get(3);

        } else if (MainActivity.idImageResource == R.id.imageView20){
            urlsVideo = video.getUrls().get(4);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view2p);
        WebView webView = findViewById(R.id.videosWeb);
        webView.loadData(urlsVideo, "text/html", "utf-8");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());
    }
}