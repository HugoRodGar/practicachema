package edu.iesam;

import edu.iesam.features.albums.domain.Album;
import edu.iesam.features.albums.presentation.AlbumView;

public class Main {
    public static void main(String[] args) {

        // SongView.printSongs();
        // AuthorView.printAlbums();

        AlbumView.printAlbums();
        AlbumView.saveAlbums(new Album("1","Si","2000"));
        AlbumView.printAlbums();
    }
}
