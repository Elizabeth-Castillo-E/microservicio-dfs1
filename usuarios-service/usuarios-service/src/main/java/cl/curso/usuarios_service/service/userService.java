package cl.curso.usuarios_service.service;
import cl.curso.usuarios_service.model.userRole;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class userService {
    private final List<userRole> usersRoles = List.of(
            new userRole(1,
                 "Juan", 
                 "Perez",
                 "1234", 
                 "+569-94567890",
                 "Calle Falsa 123", 
                 "juan.perez@email.com"),
            new userRole(2,
                 "Maria",
                 "Gomez",
                 "5678",
                 "+569-94567891",
                 "Avenida Siempre Viva 456",
                 "maria.gomez@email.com"),
            new userRole(3,
                 "Pedro",
                 "Lopez",
                 "91011",
                 "+569-94567892",
                 "Calle Real 789",
                 "pedro.lopez@email.com"),
            new userRole(4,
                 "Ana",
                 "Martinez",
                 "1213",
                 "+569-94567893",
                 "Avenida Central 101",
                 "ana.martinez@email.com"),
            new userRole(5,
                 "Luis",
                "Rodriguez",
                "1415",
                "+569-94567894",
                "Calle Secundaria 202",
                "luis.rodriguez@email.com")
    );



public List<userRole> getUsersRoles() {
        return usersRoles;
    }
}
