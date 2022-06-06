package com.example.assignment5.repository;

import com.example.assignment5.model.Photo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PhotoRepository {

    public List<Photo> photoList = new ArrayList();

    public static Photo getPhoto(){

        Photo photo = new Photo(1,"ID1","abc","XYZ","1-1-22");
        return photo;

    }

    public Photo savePhoto(Photo photo){
        photo.setId(photoList.size()+1);
        photoList.add(photo);
        return photo;
    }

    public Photo getPhotoByID(long id){

        for(Photo photo: photoList){

            if(photo.getId() == id)
            {
                return photo;
            }
        }
        return null;
    }

    public Photo updatePhoto(long id, Photo photo){
        for(Photo a : photoList){

            if(a.getId() == id){
                a.setPhotoUrl(photo.getPhotoUrl());
                a.setCreatedBy(photo.getCreatedBy());
                a.setDateCreated(photo.getDateCreated());
                return a;
            }

        }
        return null;
    }


    public List<Photo> getAllPhotos() {
        return photoList;
    }

    public void deletePhoto(long photoID) {

    }
}
