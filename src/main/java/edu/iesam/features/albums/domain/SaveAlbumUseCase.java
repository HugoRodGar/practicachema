package edu.iesam.features.albums.domain;

public class SaveAlbumUseCase {

    AlbumRepository albumRepository;

    public SaveAlbumUseCase(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public execute(Album album) {
        this.albumRepository = saveRepository;
    }

}
