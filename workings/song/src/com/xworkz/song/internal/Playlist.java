package com.xworkz.song.internal;

public class Playlist {
    public String playlistName;
    public Singer singer;
    public Song song;

    public Playlist(String playlistName, Singer singer, Song song) {
        this.playlistName = playlistName;
        this.singer = singer;
        this.song = song;
    }

    public void displaySongDetails() {
        System.out.println("Playlist Name: " + playlistName);

        System.out.println("Singer: " + singer.singerName + " (Genre: " + singer.genre + ")");

        System.out.println("Song Title: " + song.title);
        System.out.println("Duration: " + song.durationInSeconds + " seconds");
    }
}
