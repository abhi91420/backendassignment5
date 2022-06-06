package com.example.assignment5.resource;
import com.example.assignment5.model.Photo;
import com.example.assignment5.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/photos")
public class PhotoResource {
    @Autowired
    private PhotoService photoService;
    @PostMapping
    public Photo savePhoto(@Valid @RequestBody Photo photo)
    {
        return photoService.savePhoto(photo);
    }
    @GetMapping
    public List<Photo> getPhotos()
    {
        return photoService.getPhotos();
    }
    @GetMapping("/photoID")
    public Photo getById(@RequestParam(name = "photoID") long photoID )
    {
        return photoService.getByID(photoID);
    }
    @PutMapping
    public Photo updatePhoto(@RequestBody long id, Photo photo)
    {
        return photoService.updatePhoto(id,photo);
    }
    @DeleteMapping
    public void deletePhoto(@RequestParam(name = "photoID") long photoID)
    {
        photoService.deletePhoto(photoID);
    }
}