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
        }//androidtv
        //androidtv
        else if (MainActivity.idImageResource == R.id.ATV1){
            urlsVideo = video.getUrls().get(5);
        }else if (MainActivity.idImageResource == R.id.ATV2){
            urlsVideo = video.getUrls().get(6);
        }else if (MainActivity.idImageResource == R.id.ATV3){
            urlsVideo = video.getUrls().get(7);
        }else if (MainActivity.idImageResource == R.id.ATV4){
            urlsVideo = video.getUrls().get(8);
        }
        ///VIDEOS FILA 3
        else if (MainActivity.idImageResource == R.id.ATV5){
            urlsVideo = video.getUrls().get(9);
        }else if (MainActivity.idImageResource == R.id.ATV6){
            urlsVideo = video.getUrls().get(10);
        }else if (MainActivity.idImageResource == R.id.ATV7){
            urlsVideo = video.getUrls().get(11);
        }else if (MainActivity.idImageResource == R.id.ATV8){
            urlsVideo = video.getUrls().get(12);
        }else if (MainActivity.idImageResource == R.id.ATV9){
            urlsVideo = video.getUrls().get(13);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view2p);
        WebView webView = findViewById(R.id.videosWeb);
        webView.loadData(urlsVideo, "text/html", "utf-8");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());
    }
}