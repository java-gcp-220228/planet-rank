//package com.revature.planetrank.model;
//
//
//import lombok.*;
//
//import javax.persistence.*;
//import java.util.Objects;
//
//// Likes should be made an attribute of messages
//// Ankur is right, too many models
//@Entity
//@Table(name = "exoplanet_likes")
//@NoArgsConstructor @Getter @Setter @ToString @AllArgsConstructor
//public class ExoplanetLikes {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int exoplanetLikeId;
//
//    // you can have many likes per planet, no? maybe many to 1
//    @Column
//    private int exoplanetLikeCount;
//
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        ExoplanetLikes that = (ExoplanetLikes) o;
//        return exoplanetLikeId == that.exoplanetLikeId && exoplanetLikeCount == that.exoplanetLikeCount;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(exoplanetLikeId, exoplanetLikeCount);
//    }
//
//
//}
