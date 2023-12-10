package com.ista.magicaltv;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;

import androidx.fragment.app.FragmentActivity;

public class MainActivity extends FragmentActivity {
    public static int idImageResource;
    WebView2p id= new WebView2p();
    static String idimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HorizontalScrollView horizontalScrollView = findViewById(R.id.SCROLL2);
        HorizontalScrollView horizontalScrollView1 = findViewById(R.id.scroll1);
        HorizontalScrollView horizontalScrollView2 = findViewById(R.id.scroll3);
        HorizontalScrollView horizontalScrollView3 = findViewById(R.id.scroll4);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView1.setHorizontalScrollBarEnabled(false);
        horizontalScrollView2.setHorizontalScrollBarEnabled(false);
        horizontalScrollView3.setHorizontalScrollBarEnabled(false);
    }


    public void onImageViewClick(View view) {
        // Obtiene el ID del ImageView al que se le dio clic
        idImageResource = view.getId();
        System.out.println(idimage);
        Intent login = new Intent(this, WebView2p.class);
        startActivity(login);
    }
}