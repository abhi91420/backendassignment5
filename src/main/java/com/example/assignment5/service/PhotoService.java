package com.example.assignment5.service;

import com.example.assignment5.model.Photo;
import com.example.assignment5.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoService {

    @Autowired
    private PhotoRepository photoRepository;

    public Photo getByID(long photoID) {
       return photoRepository.getPhotoByID(photoID);
    }

    public Photo savePhoto(Photo photo) {
        return photoRepository.savePhoto(photo);
    }

    public List<Photo> getPhotos() {
        return photoRepository.getAllPhotos();
    }

    public Photo updatePhoto(long id,Photo photo) {
        return photoRepository.updatePhoto(id,photo);
    }

    public void deletePhoto(long photoID) {
        photoRepository.deletePhoto(photoID);
    }
}
