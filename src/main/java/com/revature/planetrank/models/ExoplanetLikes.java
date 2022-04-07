package com.revature.planetrank.models;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "exoplanet_likes")
public class ExoplanetLikes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int exoplanetLikeId;

    @Column
    private int exoplanetLikeCount;

    public ExoplanetLikes() {
    }

    public ExoplanetLikes(int exoplanetLikeId, int exoplanetLikeCount) {
        this.exoplanetLikeId = exoplanetLikeId;
        this.exoplanetLikeCount = exoplanetLikeCount;
    }

    public int getExoplanetLikeId() {
        return exoplanetLikeId;
    }

    public void setExoplanetLikeId(int exoplanetLikeId) {
        this.exoplanetLikeId = exoplanetLikeId;
    }

    public int getExoplanetLikeCount() {
        return exoplanetLikeCount;
    }

    public void setExoplanetLikeCount(int exoplanetLikeCount) {
        this.exoplanetLikeCount = exoplanetLikeCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExoplanetLikes that = (ExoplanetLikes) o;
        return exoplanetLikeId == that.exoplanetLikeId && exoplanetLikeCount == that.exoplanetLikeCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(exoplanetLikeId, exoplanetLikeCount);
    }

    @Override
    public String toString() {
        return "ExoplanetLikes{" +
                "exoplanetLikeId=" + exoplanetLikeId +
                ", exoplanetLikeCount=" + exoplanetLikeCount +
                '}';
    }
}
