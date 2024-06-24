package dio.web.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.web.api.UsuarioRepository;
import dio.web.api.model.Usuario;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping()
    public List<Usuario>getUsuarios(){
        return repository.listAll();
    }

    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable ("username") String username){
        return repository.finByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.remove(id);
    }

    @PostMapping()
    public void postUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }

}
