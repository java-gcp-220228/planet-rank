//package com.revature.planetrank.model;
//
//import lombok.*;
//import org.hibernate.engine.jdbc.BinaryStream;
//
//import javax.persistence.*;
//import java.util.Objects;
//
//@Entity
//@Table(name = "gallery_image")
//@NoArgsConstructor @Getter @Setter @ToString @AllArgsConstructor
//public class GalleryImage {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int generatedImageId;
//
//    @Column
//    private BinaryStream image;
//
//    @Column
//    private String alt;
//
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        GalleryImage that = (GalleryImage) o;
//        return generatedImageId == that.generatedImageId && Objects.equals(image, that.image) && Objects.equals(alt, that.alt);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(generatedImageId, image, alt);
//    }
//}
