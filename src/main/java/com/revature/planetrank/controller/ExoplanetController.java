package com.revature.planetrank.controller;


import com.revature.planetrank.model.Exoplanet;
import com.revature.planetrank.model.ExoplanetComments;
import com.revature.planetrank.service.ExoplanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExoplanetController {


    @Autowired
    private ExoplanetService exoplanetService;

    @GetMapping("/exoplanets")
    public List<Exoplanet> getExoplanets(){

        List<Exoplanet> exoplanetList = exoplanetService.getAllExoplanets();

        return exoplanetList;
    }

    @GetMapping("/comments")
    @ResponseBody
    public List<ExoplanetComments> getCommentsByExoplantId(@RequestParam String exoplanetId){
        List<ExoplanetComments> commentList = exoplanetService.getCommentsByExoplanetId(exoplanetId);

        return commentList;
    }

    @PostMapping("/comments")
    @ResponseBody
    public ExoplanetComments postExoplanetComment() {


        return null;
    }
}
