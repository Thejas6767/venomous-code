package com.xworkz.song.external;

import com.xworkz.song.internal.Album;
import com.xworkz.song.internal.Song;

public class MusicPlayer {
    public static void main(String[] args) {

        Song hitSingle = new Song("Starlight Symphony", 245.5);


        Album debutAlbum = new Album("Cosmic Echoes", "The Star Travelers", hitSingle);


        debutAlbum.displayAlbumDetails();
    }
}
