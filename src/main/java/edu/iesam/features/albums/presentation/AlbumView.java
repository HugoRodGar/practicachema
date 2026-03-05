package edu.iesam.features.albums.presentation;

import edu.iesam.features.albums.data.AlbumDataRepository;
import edu.iesam.features.albums.data.AlbumMemLocalDataSource;
import edu.iesam.features.albums.domain.Album;
import edu.iesam.features.albums.domain.DeleteAlbumUseCase;
import edu.iesam.features.albums.domain.GetAlbumUseCase;
import edu.iesam.features.albums.domain.SaveAlbumUseCase;

import java.util.ArrayList;

public class AlbumView {

    public static void printAlbums() {

        GetAlbumUseCase getAlbumUseCase = new GetAlbumUseCase(
                new AlbumDataRepository(
                        AlbumMemLocalDataSource.newInstance()));

        ArrayList<Album> albums = getAlbumUseCase.execute();
        System.out.println(albums);

    }

    public static void saveAlbums(Album album) {

        SaveAlbumUseCase saveAlbumUseCase = new SaveAlbumUseCase(
                new AlbumDataRepository(
                        AlbumMemLocalDataSource.newInstance()));

        saveAlbumUseCase.execute(album);

    }

    public static void deleteAlbums(String albumId) {

        DeleteAlbumUseCase deleteAlbumUseCase = new DeleteAlbumUseCase(
                new AlbumDataRepository(
                        AlbumMemLocalDataSource.newInstance()));

        deleteAlbumUseCase.execute(albumId);

    }



}
