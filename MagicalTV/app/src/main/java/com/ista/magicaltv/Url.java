package com.ista.magicaltv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class Url extends FragmentActivity {

    private ArrayList<String> urls= new ArrayList<String>();

    public void añadirVideos(){
        //Videos de la fila 5
        urls.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ZtfrwRb7-LY\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>");
        urls.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/V2KCAfHjySQ?si=WfDmT6m2weM5UpQ5\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>");
        urls.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/zSsRXMlTA2A?si=1KgmeH4vRVN9rq81\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>");
        urls.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/XmMSM7--P2A?si=EhCrGPNd37z5PSkv\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>");
        urls.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/yBe5kU9ZG9k?si=8KOrEYI3a000dLZH\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>");
        urls.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Cd8F-d2f654?si=HPwo4mmlg8Tr3h19\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>");
    }

    public ArrayList<String> getUrls() {
        return urls;
    }

    public void setUrls(ArrayList<String> urls) {
        this.urls = urls;
    }
}