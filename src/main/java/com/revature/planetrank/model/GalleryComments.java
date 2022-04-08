//package com.revature.planetrank.model;
//import lombok.*;
//
//import javax.persistence.*;
//import java.util.Objects;
//
//@Entity
//@Table(name = "gallery_comments")
//@NoArgsConstructor @Getter @Setter @ToString @AllArgsConstructor
//public class GalleryComments {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int galleryCommentId;
//
//    @Column
//    private String comment;
//
//    @Column
//    private User author;
//
//    @Column
//    private GalleryImage image;
//
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        GalleryComments that = (GalleryComments) o;
//        return galleryCommentId == that.galleryCommentId && Objects.equals(comment, that.comment) && Objects.equals(author, that.author) && Objects.equals(image, that.image);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(galleryCommentId, comment, author, image);
//    }
//}
//
