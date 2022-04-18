package com.revature.planetrank.controller;

import com.revature.planetrank.model.ExoplanetLikes;
import com.revature.planetrank.service.ExoplanetLikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(originPatterns = "*", exposedHeaders = "*", allowedHeaders = "*")
public class ExoplanetLikeController {

    @Autowired
    private ExoplanetLikeService exoplanetLikeService;

    @PostMapping("/like")
    public ExoplanetLikes addlike(@RequestBody ExoplanetLikes like){
        return exoplanetLikeService.createLike(like);
    }


}
