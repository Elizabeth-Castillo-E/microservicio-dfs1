package cl.curso.usuarios_service.controller;
import cl.curso.usuarios_service.model.userRole;
import cl.curso.usuarios_service.service.userService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("usersRoles")

public class userController {
    private final userService userService;

    public userController(userService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<userRole> getUsersRoles() {
        return userService.getUsersRoles();
    }
    
}
