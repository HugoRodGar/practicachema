package edu.iesam.features.albums.domain;

import java.util.ArrayList;

public class GetAlbumUseCase {

    AlbumRepository albumRepository;

    public GetAlbumUseCase(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public ArrayList<Album> execute() {
        return albumRepository.getAlbums();
    }

}
