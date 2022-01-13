package com.example.gof.behavioural.observer;

public class NewsChannel implements MyChannel {
    private String currentNews;
    @Override
    public void update(String news) {
        this.currentNews = news;
    }

    public String getCurrentNews() {
        return currentNews;
    }
}
