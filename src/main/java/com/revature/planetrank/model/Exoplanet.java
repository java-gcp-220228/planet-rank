//package com.revature.planetrank.model;
//
//import lombok.*;
//import javax.persistence.*;
//import java.util.Objects;
//
//@Entity
//@Table(name = "exoplanets")
//@NoArgsConstructor @Getter @Setter @ToString @AllArgsConstructor
//public class Exoplanet {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int exoplanetId;
//
//    @Column
//    private String planetName;
//
//    @Column
//    private String hostName;
//
//    @Column
//    private int numberOfPlanets;
//
//    @Column
//    private int numberOfStars;
//
//    @Column
//    private int discoverYear;
//
//    @Column
//    private long planetMass;
//
//    @Column
//    private long distanceFromEarth;
//
//    @ManyToOne
//    private ExoplanetComments comment;
//
////    @ManyToOne
////    private ExoplanetLikes likes;
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Exoplanet that = (Exoplanet) o;
//        return exoplanetId == that.exoplanetId && numberOfPlanets == that.numberOfPlanets && numberOfStars == that.numberOfStars && discoverYear == that.discoverYear && planetMass == that.planetMass && distanceFromEarth == that.distanceFromEarth && Objects.equals(planetName, that.planetName) && Objects.equals(hostName, that.hostName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(exoplanetId, planetName, hostName, numberOfPlanets, numberOfStars, discoverYear, planetMass, distanceFromEarth);
//    }
//
//
//}
//
