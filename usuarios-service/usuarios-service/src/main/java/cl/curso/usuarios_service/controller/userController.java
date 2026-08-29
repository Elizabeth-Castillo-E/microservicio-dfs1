package cl.curso.usuarios_service.controller;
import cl.curso.usuarios_service.model.User;
import cl.curso.usuarios_service.model.UserAddress;
import cl.curso.usuarios_service.model.UserRole;
import cl.curso.usuarios_service.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/microservice/usuarios")

public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.findAllUsers();
    }

    @GetMapping("/userRoles")
    public List<UserRole> getRoles() {
        return userService.findAllRoles();
    }

    @GetMapping("/userAddresses")
    public List<UserAddress> getAddresses() {
        return userService.findAllAddresses();
    }
}   