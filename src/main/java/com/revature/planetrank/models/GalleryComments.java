package com.revature.planetrank.models;
import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "gallery_comments")
public class GalleryComments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int galleryCommentId;

    @Column
    private String comment;

    @Column
    @JoinColumn(name="userId")
    private UserModel author;

    @Column
    @JoinColumn()
    private GalleryImage image;


    public GalleryComments() {
    }

    public GalleryComments(int galleryCommentId, String comment, UserModel author, GalleryImage image) {
        this.galleryCommentId = galleryCommentId;
        this.comment = comment;
        this.author = author;
        this.image = image;
    }

    public GalleryComments(String comment, UserModel author, GalleryImage image) {
        this.comment = comment;
        this.author = author;
        this.image = image;
    }

    public int getGalleryCommentId() {
        return galleryCommentId;
    }

    public void setGalleryCommentId(int galleryCommentId) {
        this.galleryCommentId = galleryCommentId;
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

    public GalleryImage getImage() {
        return image;
    }

    public void setImage(GalleryImage image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "GalleryComments{" +
                "galleryCommentId=" + galleryCommentId +
                ", comment='" + comment + '\'' +
                ", author=" + author +
                ", image=" + image +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GalleryComments that = (GalleryComments) o;
        return galleryCommentId == that.galleryCommentId && Objects.equals(comment, that.comment) && Objects.equals(author, that.author) && Objects.equals(image, that.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(galleryCommentId, comment, author, image);
    }
}

