package com.revature.planetrank.service;


import com.revature.planetrank.dao.ExoplanetRepository;
import com.revature.planetrank.model.Exoplanet;
import com.revature.planetrank.model.ExoplanetComments;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Driver;
import java.util.List;

@Service
public class ExoplanetService {

    public static Logger log = LoggerFactory.getLogger(Driver.class);

    @Autowired
    private ExoplanetRepository exoplanetRepo;

    public List<Exoplanet> getAllExoplanets(){

        List<Exoplanet> exoplanetList = exoplanetRepo.findAll();

        log.info("Returned all exoplanets");
        return exoplanetList;

    }

//    public List<ExoplanetComments> getCommentsByExoplanetId(String exoplanetId){
//        try {
//            int exoplanet_id = Integer.parseInt((exoplanetId));
//            List<ExoplanetComments> commentsList = exoplanetRepo.findByExoplanetID(exoplanet_id);
//            log.info("Returned commentsList for exoplanet: " + exoplanetId);
//            return commentsList;
//        }
//        catch (NumberFormatException n){
//            log.info("IllegalArgument Exception has been thrown");
//            throw new IllegalArgumentException("You must enter a valid int for the exoplanet ID");
//        }
//
//    }

    public Exoplanet getExoplanetById(int id){
        return exoplanetRepo.getById(id);
    }
}
