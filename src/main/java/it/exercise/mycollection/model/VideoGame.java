package it.exercise.mycollection.model;

import lombok.Getter;

public class VideoGame {

    @Getter
    private final String title, publisher, year;
    @Getter
    private final Platform platform;

    public VideoGame(String title, String publisher, String year, Platform platform) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year='" + year + '\'' +
                ", platform=" + platform +
                '}';
    }
}
