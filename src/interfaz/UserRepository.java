package interfaz;
import Modelos.Persona;
import java.util.List;

public interface UserRepository {
	//prototipos de metodos 
    List<Persona> getAllUsers(); // llama a todos los usuarios de la bdd
    
    Persona getUserById(int id); //llama solo a uno, por su id
    
    void addUser(Persona user); //añade usuarios a la bdd
    
    void updateUser(Persona user); //actualiza los usuarios de la bdd
    
    void deleteUser(int id); //eliminar usuarios de la bdd

}
