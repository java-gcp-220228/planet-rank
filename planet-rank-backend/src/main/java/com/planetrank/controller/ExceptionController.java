package com.planetrank.controller;

import com.planetrank.main.Driver;
import io.javalin.Javalin;
import io.javalin.http.ExceptionHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.security.auth.login.FailedLoginException;

public class ExceptionController implements Controller{

    public static Logger logger = LoggerFactory.getLogger(Driver.class);

    // create a handler for failed logins
    // has ctx and exception &&  output status code / json / logging
    private final ExceptionHandler<FailedLoginException> failedLogin = (exception, ctx) -> {

        logger.info("\nLogin endpoint has caught a Failed Login Exception." +
                "\nPath: " + ctx.path() +
                "\nBody : " + ctx.body() +
                "\nIP Address : " + ctx.ip() +
                "\nUser Agent: " + ctx.userAgent() + "\n");

        ctx.status(400);
        ctx.json(exception.getMessage());
    };

    @Override
    public void mapEndpoints(Javalin app) {
        app.exception(FailedLoginException.class, failedLogin);
    }
}
