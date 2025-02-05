package santander.springapi.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import santander.springapi.model.Usuario;

@RestController
public class UsuarioRepository {
    public void save(Usuario usuario){
        if(usuario.getId()==null)
          System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
         System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        
        System.out.println(usuario);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os usários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("gustavo","password"));
        usuarios.add(new Usuario("frank","masterpass"));
        return usuarios;
    }
    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("gustavo","password");
    }
     public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o usernamae: %s para localizar um usuário", username));
        return new Usuario("gustavo","password");
    }
}
