package com.example.assignment4.service;

import com.example.assignment4.model.Album;
import com.example.assignment4.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService
{
    @Autowired
    private AlbumRepository albumRepository;
    public Album getAlbum()
    {
        return albumRepository.getAlbum();
    }

    public Album saveAlbum(Album album)
    {
        return albumRepository.saveAlbum(album);
    }

    public List<Album> getallAlbum() {
        return albumRepository.getallAlbum();
    }

    public Album getAlbumbyID(int albumID)
    {
        return albumRepository.getAlbumbyID(albumID);
    }

    public Album updatelbum(int albumID, Album album)
    {
        return albumRepository.updateAlbum(albumID, album);
    }

    public Album deleteAlbum(int albumID)
    {
        return albumRepository.deleteAlbum(albumID);
    }
}
