package com.revature.planetrank.unit.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.security.auth.login.FailedLoginException;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AuthenticationServiceTest {

    @Mock
    private UserRepository userRepo;

    // inject any object labeled with @mock into this object
    @InjectMocks
    private AuthenticationService authService;

    /*
     login method
     2 inputs
     positive correct input and it is a user
     negative test case --> invalid credentials
     server timeout
     incorrect data types (int)
     blank fields

     Arrange
     Act
     Assert

     */

    @Test
    public void test_login_positive_validUserAndPass() throws FailedLoginException {

        User expected = new User();
        expected.setUserId(1);
        expected.setUsername("test");
        expected.setPassword("test");

        when(userRepo.findByUsernameAndPassword(eq("test"), eq("test"))).thenReturn(expected);
        User actual = authService.login("test", "test");

        Assertions.assertEquals(expected, actual);

    }

//    @Test
//    public void test_negative_validUserAndPass() throws FailedLoginException {
//
//        User expected = new User();
//        expected.setUserId(1);
//        expected.setUsername("test");
//        expected.setPassword("test");
//
//        when(userRepo.findByUsernameAndPassword(eq("test"), eq("test"))).thenReturn(expected);
//        User actual = authService.login("username", "password");
//
//        Assertions.assertNotEquals(expected, actual);
//
//    }
}
