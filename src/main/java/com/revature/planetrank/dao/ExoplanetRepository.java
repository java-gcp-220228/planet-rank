package com.revature.planetrank.dao;

import com.revature.planetrank.model.Exoplanet;
import com.revature.planetrank.model.ExoplanetComments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

import static org.hibernate.loader.Loader.SELECT;

// Should this be the exoplanet comment repository?
public interface ExoplanetRepository extends JpaRepository<Exoplanet, Integer> {

    public abstract List<Exoplanet> findAll();

    @Query("SELECT ec FROM ExoplanetComments ec JOIN ec.exoplanet e WHERE e.exoplanetId = ?1")
    public abstract List<ExoplanetComments> findByExoplanetID(int exoplanetId);

//    Get all comments for an exoplanet based on exo id (compiled)
//    @Query("SELECT comment from exoplanets e join exoplanet_comments ec ON e.exoplanet_id = ?1 AND ec.exoplanet_comment_id = ?1")
//    public abstract List<ExoplanetComments> findAllExoplanetCommentsByExoplanetId(int id);

}
