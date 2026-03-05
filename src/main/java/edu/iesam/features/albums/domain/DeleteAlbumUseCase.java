package edu.iesam.features.albums.domain;

public class DeleteAlbumUseCase {

    AlbumRepository albumRepository;

    public DeleteAlbumUseCase(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public void execute(String albumId) {
        albumRepository.deleteAlbum(albumId);
    }

}
