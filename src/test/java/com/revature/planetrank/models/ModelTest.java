package com.revature.planetrank.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//@SpringBootTest
public class ModelTest {

    @Test
    public void exoplanetModelTest_positive() {
        ExoplanetComments comment = new ExoplanetComments("comment", null, null);
        ExoplanetLikes likes = new ExoplanetLikes();
        Exoplanet exo = new Exoplanet("JaysPlanet", "AnkurSun", 2, 1, 2022, 100192293, 13124123, comment, likes);
        Assertions.assertEquals(exo.getPlanetName(), "JaysPlanet");
        Assertions.assertEquals(exo, new Exoplanet("JaysPlanet", "AnkurSun", 2, 1, 2022, 100192293, 13124123, comment, likes));
    }

    @Test
    public void exoplanetModelTest_negative() {
        ExoplanetComments comment = new ExoplanetComments("comment", null, null);
        ExoplanetLikes likes = new ExoplanetLikes();
        Exoplanet actual_exo = new Exoplanet("JacksPlanet", "AnkurSun", 2, 1, 2022, 100192293, 13124123, comment, likes);
        Exoplanet expected_exo = new Exoplanet("JaysPlanet", "AnkurSun", 2, 1, 2022, 100192293, 13124123, comment, likes);
        // I think this tests an error?
        Assertions.assertNotEquals(expected_exo, actual_exo);
    }

    @Test
    public void exoplanetCommentModelTest_positive() {
        Exoplanet exo = new Exoplanet("JaysPlanet", "AnkurSun", 2, 1, 2022, 100192293, 13124123, null, null);
        UserModel author = new UserModel("name", "lastname");
        ExoplanetComments comment = new ExoplanetComments("comment", author, exo);
        Assertions.assertEquals(comment.getComment(), "comment"); // I feel like this is what a positive test is
        Assertions.assertEquals(comment, new ExoplanetComments("comment", author, exo)); // not this
    }

    @Test
    public void exoplanetCommentModelTest_negative() {
        Exoplanet exo = new Exoplanet("JaysPlanet", "AnkurSun", 2, 1, 2022, 100192293, 13124123, null, null);
        UserModel author = new UserModel("name", "lastname");
        ExoplanetComments comment = new ExoplanetComments("comment", author, exo);
        ExoplanetComments comments = new ExoplanetComments("comments", author, exo);
        Assertions.assertNotEquals(comment, comments);
    }

    @Test
    public void exoplanetLikesModel_positive() {
        ExoplanetLikes likes = new ExoplanetLikes(1, 500);
        Assertions.assertEquals(likes.getExoplanetLikeCount(), 500);
    }

    @Test public void exoplanetLikesModel_negative() {
        ExoplanetLikes likes = new ExoplanetLikes(1, 500);
        ExoplanetLikes duplicate = new ExoplanetLikes(2, 5200);
        Assertions.assertNotEquals(likes, duplicate);
    }

    @Test
    public void userModelTest_positive() {
        UserModel user = new UserModel("name", "name");
        Assertions.assertEquals(user.getUsername(), "name");
    }

    @Test
    public void userModelTest_negative() {
        UserModel user = new UserModel("name", "name");
        Assertions.assertNotEquals(user, new UserModel("namee", "e"));
    }

    @Test
    public void galleryImageModelTest_positive() {
        GalleryImage gi = new GalleryImage(1, null, "image");
        Assertions.assertEquals(gi.getAlt(), "image");
    }

    @Test
    public void galleryImageModelTest_negative() {
        GalleryImage gi = new GalleryImage(1, null, "image");
        GalleryImage gi2 = new GalleryImage(12, null, "images");
        Assertions.assertNotEquals(gi, gi2);
    }

    @Test
    public void galleryCommentsModelTest_positive() {
        GalleryComments gc = new GalleryComments(1, null, null, null);
        Assertions.assertEquals(gc.getGalleryCommentId(), 1);
    }

    @Test
    public void galleryCommentsModelTest_negative() {
        GalleryComments gc = new GalleryComments(1, null, null, null);
        GalleryComments gc2 = new GalleryComments(2, null, null, null);
        Assertions.assertNotEquals(gc, gc2);
    }
}
