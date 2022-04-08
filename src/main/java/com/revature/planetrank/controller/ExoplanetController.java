package com.revature.planetrank.controller;


import com.revature.planetrank.model.Exoplanet;
import com.revature.planetrank.service.ExoplanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
