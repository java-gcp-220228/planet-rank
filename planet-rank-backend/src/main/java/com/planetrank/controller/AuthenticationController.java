package com.planetrank.controller;

import com.planetrank.main.Driver;
import com.planetrank.model.User;
import com.planetrank.service.JWTService;
import com.planetrank.service.UserService;
import io.javalin.Javalin;
import io.javalin.http.Handler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AuthenticationController implements Controller {

    private JWTService jwtService;
    private UserService userService;

    public static Logger log = LoggerFactory.getLogger(Driver.class);

    public AuthenticationController(JWTService jwtService, UserService userService) {
        this.jwtService = jwtService;
        this.userService = userService;
    }

    private final Handler login = ctx -> {
        User loginInfo = ctx.bodyAsClass(User.class);

        User user = userService.login(loginInfo.getUser(), loginInfo.getPass());

        log.info("\nLogin endpoint has been successfully invoked." +
                "\nPath: " + ctx.path() +
                "\nLogin DTO val -> USER : " + loginInfo.getUser() + " Pass : " + loginInfo.getPass() +
                "\nLogin user val : " + user +
                "\nIP Address : " + ctx.ip() +
                "\nUser Agent: " + ctx.userAgent() + "\n");

        String jwt = this.jwtService.createJWT(user);

        ctx.header("Access-Control-Expose-Headers", "*");
        ctx.header("Token", jwt);

        ctx.json(user);
    };

    @Override
    public void mapEndpoints(Javalin app) {
        app.post("/login", login);
    }
}
