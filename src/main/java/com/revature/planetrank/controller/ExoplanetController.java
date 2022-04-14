package com.revature.planetrank.controller;


import com.revature.planetrank.model.Exoplanet;
import com.revature.planetrank.model.ExoplanetComments;
import com.revature.planetrank.service.ExoplanetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Driver;
import java.util.List;

@RestController
@CrossOrigin(originPatterns = "*", exposedHeaders = "*", allowedHeaders = "*")
public class ExoplanetController {

    public static Logger log = LoggerFactory.getLogger(Driver.class);

    @Autowired
    private ExoplanetService exoplanetService;

    @GetMapping("/exoplanets")
    public List<Exoplanet> getExoplanets(){

        List<Exoplanet> exoplanetList = exoplanetService.getAllExoplanets();

        log.info("All Exoplanets have been returned [Controller Layer]");
        return exoplanetList;
    }

    @GetMapping("/comments/{exoplanetId}")
    @ResponseBody
    public List<ExoplanetComments> getCommentsByExoplantId(@PathVariable String exoplanetId){
        List<ExoplanetComments> commentList = exoplanetService.getCommentsByExoplanetId(exoplanetId);

        log.info("Exoplanet Comments have been returned [Controller Layer]");
        return commentList;
    }

    @PostMapping("/comments")
    @ResponseBody
    public ExoplanetComments postExoplanetComment() {


        return null;
    }
}
