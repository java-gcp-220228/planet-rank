package com.revature.planetrank.unit;


import com.revature.planetrank.dao.ExoplanetCommentRepository;
import com.revature.planetrank.dao.GalleryCommentRepository;
import com.revature.planetrank.dao.UserRepository;
import com.revature.planetrank.model.ExoplanetComments;
import com.revature.planetrank.model.GalleryComments;
import com.revature.planetrank.model.User;
import com.revature.planetrank.model.UserRole;
import com.revature.planetrank.service.ExoplanetCommentService;
import com.revature.planetrank.service.GalleryCommentService;
import com.revature.planetrank.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.stubbing.Answer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class GalleryCommentServiceTest {

    private GalleryCommentService galleryCommentService;
    private GalleryCommentRepository galleryCommentRepository;

    private static GalleryComments savedComment;

    @BeforeEach
    void setup() {
        galleryCommentRepository = createMockRepo();
        galleryCommentService = new GalleryCommentService(galleryCommentRepository);
    }



    @Test
    void testSaveComment(){
        GalleryComments comment = new GalleryComments();
        comment.setComment("test");
        comment.setGalleryCommentId(1);

        galleryCommentService.createComment(comment);

        assertEquals(savedComment.getComment(), "test");
        assertEquals(savedComment.getGalleryCommentId(), 1);
    }



    public GalleryCommentRepository createMockRepo() {
        GalleryCommentRepository mockRepo = mock(GalleryCommentRepository.class);
        try {
            doAnswer(
                    (Answer<Void>) invocation -> {
                        savedComment = (GalleryComments) invocation.getArguments()[0];
                        return null;
                    })
                    .when(mockRepo)
                    .save(any(GalleryComments.class));
        } catch (Exception e) {
        }
        return mockRepo;
    }
}