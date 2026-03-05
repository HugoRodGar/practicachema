package edu.iesam.features.albums.presentation;

import edu.iesam.features.albums.data.AlbumDataRepository;
import edu.iesam.features.albums.data.AlbumMemLocalDataSource;
import edu.iesam.features.albums.domain.Album;
import edu.iesam.features.albums.domain.GetAlbumUseCase;

import java.util.ArrayList;

public class AlbumView {

    public void printAlbums() {

        GetAlbumUseCase getAlbumUseCase = new GetAlbumUseCase(new GetAlbumUseCase(
                new AlbumDataRepository(
                        AlbumMemLocalDataSource.newInstance()));


        ArrayList<Album> albums = getAlbumUseCase.execute();
        System.out.println(albums);

    }



}
