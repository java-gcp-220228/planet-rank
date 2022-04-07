package com.revature.planetrank.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "exoplanets")
public class Exoplanets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int exoplanetId;

    @Column
    private String planetName;

    @Column
    private String hostName;

    @Column
    private int numberOfPlanets;

    @Column
    private int numberOfStars;

    @Column
    private int discoverYear;

    @Column
    private long planetMass;

    @Column
    private long distanceFromEarth;

    @Column
    @OneToMany
    private ExoplanetComments comment;

    @Column
    @OneToMany
    private ExoplanetLikes likes;

    public Exoplanets() {
    }

    public Exoplanets(String planetName, String hostName, int numberOfPlanets, int numberOfStars, int discoverYear, long planetMass, long distanceFromEarth, ExoplanetComments comment, ExoplanetLikes likes) {
        this.planetName = planetName;
        this.hostName = hostName;
        this.numberOfPlanets = numberOfPlanets;
        this.numberOfStars = numberOfStars;
        this.discoverYear = discoverYear;
        this.planetMass = planetMass;
        this.distanceFromEarth = distanceFromEarth;
        this.comment = comment;
        this.likes = likes;
    }

    public Exoplanets(int exoplanetId, String planetName, String hostName, int numberOfPlanets, int numberOfStars, int discoverYear, long planetMass, long distanceFromEarth, ExoplanetComments comment, ExoplanetLikes likes) {
        this.exoplanetId = exoplanetId;
        this.planetName = planetName;
        this.hostName = hostName;
        this.numberOfPlanets = numberOfPlanets;
        this.numberOfStars = numberOfStars;
        this.discoverYear = discoverYear;
        this.planetMass = planetMass;
        this.distanceFromEarth = distanceFromEarth;
        this.comment = comment;
        this.likes = likes;
    }

    public int getExoplanetId() {
        return exoplanetId;
    }

    public void setExoplanetId(int exoplanetId) {
        this.exoplanetId = exoplanetId;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public int getNumberOfPlanets() {
        return numberOfPlanets;
    }

    public void setNumberOfPlanets(int numberOfPlanets) {
        this.numberOfPlanets = numberOfPlanets;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public int getDiscoverYear() {
        return discoverYear;
    }

    public void setDiscoverYear(int discoverYear) {
        this.discoverYear = discoverYear;
    }

    public long getPlanetMass() {
        return planetMass;
    }

    public void setPlanetMass(long planetMass) {
        this.planetMass = planetMass;
    }

    public long getDistanceFromEarth() {
        return distanceFromEarth;
    }

    public void setDistanceFromEarth(long distanceFromEarth) {
        this.distanceFromEarth = distanceFromEarth;
    }

    public ExoplanetComments getComment() {
        return comment;
    }

    public void setComment(ExoplanetComments comment) {
        this.comment = comment;
    }

    public ExoplanetLikes getLikes() {
        return likes;
    }

    public void setLikes(ExoplanetLikes likes) {
        this.likes = likes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exoplanets that = (Exoplanets) o;
        return exoplanetId == that.exoplanetId && numberOfPlanets == that.numberOfPlanets && numberOfStars == that.numberOfStars && discoverYear == that.discoverYear && planetMass == that.planetMass && distanceFromEarth == that.distanceFromEarth && Objects.equals(planetName, that.planetName) && Objects.equals(hostName, that.hostName) && Objects.equals(comment, that.comment) && Objects.equals(likes, that.likes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exoplanetId, planetName, hostName, numberOfPlanets, numberOfStars, discoverYear, planetMass, distanceFromEarth, comment, likes);
    }

    @Override
    public String toString() {
        return "Exoplanets{" +
                "exoplanetId=" + exoplanetId +
                ", planetName='" + planetName + '\'' +
                ", hostName='" + hostName + '\'' +
                ", numberOfPlanets=" + numberOfPlanets +
                ", numberOfStars=" + numberOfStars +
                ", discoverYear=" + discoverYear +
                ", planetMass=" + planetMass +
                ", distanceFromEarth=" + distanceFromEarth +
                ", comment=" + comment +
                ", likes=" + likes +
                '}';
    }
}

