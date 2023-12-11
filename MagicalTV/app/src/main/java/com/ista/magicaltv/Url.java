package com.ista.magicaltv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class Url extends FragmentActivity {

    private ArrayList<String> urls= new ArrayList<String>();

    public void añadirVideos(){
        //Videos de la fila 5
        urls.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/7bhIQK26Brw?si=bj_O1hXEhLXfLhX6\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>");
        urls.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/jd7x7KmzGwA?si=kvaxOJdwyHZeQHjU\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>");
        urls.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/XmMSM7--P2A?si=EhCrGPNd37z5PSkv\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>");
        urls.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/yBe5kU9ZG9k?si=8KOrEYI3a000dLZH\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>");
        urls.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Cd8F-d2f654?si=HPwo4mmlg8Tr3h19\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>");
        urls.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ZtfrwRb7-LY\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>");
        urls.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Wl7X8wlrfBs\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>");
        urls.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/xHi2sCzt1mA\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>");
        urls.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/24ZIFuHg4f0\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>");
        urls.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/r6HUt9UEohU\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>");
        urls.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/H8tykt3pKTU?si=KqLsquxWJUt2GGxc\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>");
        urls.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/tmZIzqvet9U?si=sXp2_p86_6Ccc019\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>");
        urls.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ykgYAaxL2dA?si=2zBpIJr88t3e6opx\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>");
        urls.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/kAaJpo2VZec?si=YMrnS536vawohrbZ\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>");
        urls.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/-pWSQYpkkjk?si=H0XL6e-4XlukaHDf\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>");
        urls.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/BQaxPwZWboA?si=8cx-3Hd8aMQMdt4b\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>");
        urls.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/A9nPKp9vtuo?si=ZUGdfJ17gqFCEonM\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>");
        urls.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/-xRWR_TVa28?si=h2cPhfFtnBA946b2\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>");
        urls.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Uw9dW5F4z88?si=OM3Gxc2qw0-U08xh\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>");
        urls.add("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/sAso4dcXE8g?si=Qao1ieHxydKQG0A8\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>");
    }

    public ArrayList<String> getUrls() {
        return urls;
    }

    public void setUrls(ArrayList<String> urls) {
        this.urls = urls;
    }
}