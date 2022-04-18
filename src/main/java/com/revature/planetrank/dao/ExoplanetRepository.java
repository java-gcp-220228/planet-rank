package com.revature.planetrank.dao;

import com.revature.planetrank.model.Exoplanet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExoplanetRepository extends JpaRepository<Exoplanet, Integer> {

    public abstract List<Exoplanet> findAll();



}
