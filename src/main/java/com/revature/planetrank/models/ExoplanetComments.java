package com.revature.planetrank.models;
import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "exoplanet_comments")
public class ExoplanetComments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int exoplanetCommentId;

    @Column
    private String comment;

    @Column
    @JoinColumn(name="userId")
    private UserModel author;

    @Column
    @JoinColumn()
    private Exoplanets exoplanet;


    public ExoplanetComments() {
    }

    public ExoplanetComments(String comment, UserModel author, Exoplanets exoplanet) {
        this.comment = comment;
        this.author = author;
        this.exoplanet = exoplanet;
    }

    public ExoplanetComments(int exoplanetCommentId, String comment, UserModel author, Exoplanets exoplanet) {
        this.exoplanetCommentId = exoplanetCommentId;
        this.comment = comment;
        this.author = author;
        this.exoplanet = exoplanet;
    }

    public int getExoplanetCommentId() {
        return exoplanetCommentId;
    }

    public void setExoplanetCommentId(int exoplanetCommentId) {
        this.exoplanetCommentId = exoplanetCommentId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public UserModel getAuthor() {
        return author;
    }

    public void setAuthor(UserModel author) {
        this.author = author;
    }

    public Exoplanets getExoplanet() {
        return exoplanet;
    }

    public void setExoplanet(Exoplanets exoplanet) {
        this.exoplanet = exoplanet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExoplanetComments that = (ExoplanetComments) o;
        return exoplanetCommentId == that.exoplanetCommentId && Objects.equals(comment, that.comment) && Objects.equals(author, that.author) && Objects.equals(exoplanet, that.exoplanet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exoplanetCommentId, comment, author, exoplanet);
    }

    @Override
    public String toString() {
        return "ExoplanetComments{" +
                "exoplanetCommentId=" + exoplanetCommentId +
                ", comment='" + comment + '\'' +
                ", author=" + author +
                ", exoplanet=" + exoplanet +
                '}';
    }
}
