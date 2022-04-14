package com.revature.planetrank.service;

import com.revature.planetrank.dao.ExoplanetCommentRepository;
import com.revature.planetrank.dao.ExoplanetRepository;
import com.revature.planetrank.model.ExoplanetComments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class ExoplanetCommentService {

    @Autowired
    private ExoplanetCommentRepository exoplanetCommentRepository;

    public ExoplanetComments createComment(ExoplanetComments comment){

        return exoplanetCommentRepository.save(comment);
    }
}
