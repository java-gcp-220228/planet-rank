package com.revature.planetrank.models;

import org.hibernate.engine.jdbc.BinaryStream;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "gallery_image")
public class GalleryImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int generatedImageId;

    @Column
    private BinaryStream image;

    @Column
    private String alt;

    public GalleryImage() {
    }

    public GalleryImage(int generatedImageId, BinaryStream image, String alt) {
        this.generatedImageId = generatedImageId;
        this.image = image;
        this.alt = alt;
    }

    public GalleryImage(BinaryStream image, String alt) {
        this.image = image;
        this.alt = alt;
    }

    public int getGeneratedImageId() {
        return generatedImageId;
    }

    public void setGeneratedImageId(int generatedImageId) {
        this.generatedImageId = generatedImageId;
    }

    public BinaryStream getImage() {
        return image;
    }

    public void setImage(BinaryStream image) {
        this.image = image;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    @Override
    public String toString() {
        return "GalleryImage{" +
                "generatedImageId=" + generatedImageId +
                ", image=" + image +
                ", alt='" + alt + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GalleryImage that = (GalleryImage) o;
        return generatedImageId == that.generatedImageId && Objects.equals(image, that.image) && Objects.equals(alt, that.alt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(generatedImageId, image, alt);
    }
}
