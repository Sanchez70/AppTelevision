package com.ista.magicaltv;

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
        if ((MainActivity.idImageResource == R.id.imageView16)) {
            urlsVideo = video.getUrls().get(0);
        } else if (MainActivity.idImageResource == R.id.imageView17) {
            urlsVideo = video.getUrls().get(1);
        } else if (MainActivity.idImageResource == R.id.imageView18){
            urlsVideo = video.getUrls().get(2);
        } else if (MainActivity.idImageResource == R.id.imageView19){
            urlsVideo = video.getUrls().get(3);
        } else if (MainActivity.idImageResource == R.id.imageView20){
            urlsVideo = video.getUrls().get(4);
        }//androidtv
        else if (MainActivity.idImageResource == R.id.ATV1){
            urlsVideo = video.getUrls().get(5);
        }else if (MainActivity.idImageResource == R.id.ATV2){
            urlsVideo = video.getUrls().get(6);
        }else if (MainActivity.idImageResource == R.id.ATV3){
            urlsVideo = video.getUrls().get(7);
        }else if (MainActivity.idImageResource == R.id.ATV4){
            urlsVideo = video.getUrls().get(8);
        }else if (MainActivity.idImageResource == R.id.ATV5){
            urlsVideo = video.getUrls().get(9);
        }
        ///VIDEOS FILA 3
        else if (MainActivity.idImageResource == R.id.img6){
            urlsVideo = video.getUrls().get(10);
        }else if (MainActivity.idImageResource == R.id.img7){
            urlsVideo = video.getUrls().get(11);
        }else if (MainActivity.idImageResource == R.id.img8){
            urlsVideo = video.getUrls().get(12);
        }else if (MainActivity.idImageResource == R.id.img9){
            urlsVideo = video.getUrls().get(13);
        }else if (MainActivity.idImageResource == R.id.img10){
            urlsVideo = video.getUrls().get(14);
        }
        //fila 1
        else if (MainActivity.idImageResource == R.id.imageView11){
            urlsVideo = video.getUrls().get(15);
        }else if (MainActivity.idImageResource == R.id.imageView12){
            urlsVideo = video.getUrls().get(16);
        }else if (MainActivity.idImageResource == R.id.imageView13){
            urlsVideo = video.getUrls().get(17);
        }else if (MainActivity.idImageResource == R.id.imageView14){
            urlsVideo = video.getUrls().get(18);
        }else if (MainActivity.idImageResource == R.id.imageView15){
            urlsVideo = video.getUrls().get(19);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view2p);
        WebView webView = findViewById(R.id.videosWeb);
        webView.loadData(urlsVideo, "text/html", "utf-8");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());
    }
}