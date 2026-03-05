package edu.iesam.features.albums.domain;

public class GetAlbumUseCase {

    AlbumRepository albumRepository;

    public GetAlbumUseCase(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public void Execute(Album album) {
        this.albumRepository =  albumRepository;
    }

    public ArrayList<Album> execute

}
