package com.revature.planetrank.service;


import com.revature.planetrank.dao.ExoplanetRepository;
import com.revature.planetrank.model.Exoplanet;
import com.revature.planetrank.model.ExoplanetComments;
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

    public List<ExoplanetComments> getCommentsByExoplanetId(String exoplanetId){
        try {
            int exoplanet_id = Integer.parseInt((exoplanetId));
            List<ExoplanetComments> commentsList = exoplanetRepo.findByExoplanetID(exoplanet_id);
            return commentsList;
        }
        catch (NumberFormatException n){
            throw new IllegalArgumentException("You must enter a valid int for the exoplanet ID");
        }




    }
}
