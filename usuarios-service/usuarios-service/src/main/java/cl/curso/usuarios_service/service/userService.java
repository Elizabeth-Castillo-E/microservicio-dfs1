package cl.curso.usuarios_service.service;
import cl.curso.usuarios_service.model.userRole;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class userService {
    private final List<userRole> usersRoles = List.of(
            new userRole(1,
                    "Admin",
                    "Administrador del sistema"), 
                    new userRole(2,
                    "User",
                    "Usuario normal"),
            new userRole(3,
                    "Supervisor",
                    "Supervisor del sistema"),
            new userRole(4,
                    "SuperAdmin",
                    "Administrador con privilegios superiores"),
            new userRole(5,
                    "Moderator",
                    "Moderador del sistema")
    );



public List<userRole> getUsersRoles() {
        return usersRoles;
    }
}
