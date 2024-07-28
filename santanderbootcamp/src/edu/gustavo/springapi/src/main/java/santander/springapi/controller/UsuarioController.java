package santander.springapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import santander.springapi.model.Usuario;
import santander.springapi.repository.UsuarioRepository;

@RestController
public class UsuarioController {
    @Autowired

    private UsuarioRepository repository;
    @GetMapping("/users")
    public List<Usuario> getUsers(){
        return repository.findAll();

    }
}
