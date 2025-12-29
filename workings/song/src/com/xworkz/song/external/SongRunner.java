package com.xworkz.song.external;

import com.xworkz.song.internal.Playlist;
import com.xworkz.song.internal.Singer;
import com.xworkz.song.internal.Song;

class SongRunner {
    public static void main(String[] args) {
        Singer singer1 = new Singer("Adele", "Pop/Soul");

        Song song1 = new Song("Rolling in the Deep", 228); // 3:48 is 228 seconds

        Playlist topHits = new Playlist("Today's Top Hits", singer1, song1);


        topHits.displaySongDetails();
    }
}
