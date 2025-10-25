package com.xworkz.song.internal;

public class Album {
    public String albumTitle;
    public String artistName;
    public Song featuredTrack;

    public Album(String albumTitle, String artistName, Song featuredTrack) {
        this.albumTitle = albumTitle;
        this.artistName = artistName;
        this.featuredTrack = featuredTrack;
    }

    public void displayAlbumDetails() {
        System.out.println("Album Title: " + albumTitle);
        System.out.println("Artist Name: " + artistName);

        System.out.println("Featured Track: " + featuredTrack.songTitle);
        System.out.println("Track Duration: " + featuredTrack.durationSeconds + " seconds");
    }
}
