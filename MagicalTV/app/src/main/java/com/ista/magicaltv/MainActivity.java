package com.ista.magicaltv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActivityOptions;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import java.util.ArrayList;

public class MainActivity extends FragmentActivity {
    public static int idImageResource;
    WebView2p id= new WebView2p();
    static String idimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onImageViewClick(View view) {
        // Obtiene el ID del ImageView al que se le dio clic
        idImageResource = view.getId();
        System.out.println(idimage);
        Intent login = new Intent(this, WebView2p.class);
        startActivity(login);
    }
}