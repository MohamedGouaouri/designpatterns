package com.example.gof.behavioural.observer;


import java.util.ArrayList;
import java.util.List;


public class NewsAgency {
    // State
    private String news;

    // List of subscribers
    private List<MyChannel> channels = new ArrayList<>();

    public void subscribe(MyChannel channel){
        channels.add(channel);
    }
    public void unsubscribe(MyChannel channel){
        channels.remove(channel);
    }

    public void setNews(String news){
        this.news = news;
        for (MyChannel channel:channels
             ) {
            _notify(channel);
        }
    }

    // notify subscribers for state change
    public void _notify(MyChannel channel){
        channel.update(this.news);
    }
}
