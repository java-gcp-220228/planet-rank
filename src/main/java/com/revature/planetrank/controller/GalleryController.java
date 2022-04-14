package com.revature.planetrank.controller;


import com.revature.planetrank.dao.ImageRepository;
import com.revature.planetrank.model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/nasa_images")
public class GalleryController {

    @Autowired
    private ImageRepository imageRepository;

    @GetMapping("/images")
    public ResponseEntity<List<Image>> getAllImages() {
        try {
            List<Image> images = new ArrayList<Image>();


            images.addAll(imageRepository.findAll());

            if (images.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(images, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
