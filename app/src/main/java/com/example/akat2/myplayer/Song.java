package com.example.akat2.myplayer;

/**
 * Created by akat2 on 22-12-2017.
 */

public class Song {
    private long id;
    private String title;
    private String artist;
    private String path;

    public Song(long id, String title, String artist, String path) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}
