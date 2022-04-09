package com.revature.planetrank.unit.service;
import com.revature.planetrank.dao.ExoplanetRepository;
import com.revature.planetrank.dao.UserRepository;
import com.revature.planetrank.model.User;
import com.revature.planetrank.service.AuthenticationService;
import com.revature.planetrank.service.ExoplanetService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import javax.security.auth.login.FailedLoginException;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ExoplanetServiceTest {

    @Test
    public void testGetCommentsByExoplanetId(){
        Assertions.assertEquals(1,1);
    }
}
