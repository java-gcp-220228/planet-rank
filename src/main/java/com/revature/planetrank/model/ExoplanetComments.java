package com.revature.planetrank.model;
import lombok.*;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "exoplanet_comments")
@NoArgsConstructor @Getter @Setter @ToString @AllArgsConstructor
public class ExoplanetComments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int exoplanetCommentId;

    @Column
    private String comment;


    @ManyToOne
    private User author;

    @ManyToOne
    private Exoplanet exoplanet;




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExoplanetComments that = (ExoplanetComments) o;
        return exoplanetCommentId == that.exoplanetCommentId && Objects.equals(comment, that.comment) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(exoplanetCommentId, comment);
    }

}
