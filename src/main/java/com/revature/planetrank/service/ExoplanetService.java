package com.revature.planetrank.service;


import com.revature.planetrank.dao.ExoplanetRepository;
import com.revature.planetrank.model.Exoplanet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExoplanetService {

    @Autowired
    private ExoplanetRepository exoplanetRepo;

    public List<Exoplanet> getAllExoplanets(){

        List<Exoplanet> exoplanetList = exoplanetRepo.findAll();

        return exoplanetList;

    }
}
