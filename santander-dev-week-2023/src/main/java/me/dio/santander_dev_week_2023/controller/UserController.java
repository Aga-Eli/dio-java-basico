package me.dio.santander_dev_week_2023.controller;

import me.dio.santander_dev_week_2023.domain.model.User;
import me.dio.santander_dev_week_2023.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService; // Como só tem uma implementação, o Spring vai injetar UserServiceImpl sem q seja necessário mostrar nosso código

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{Id}")
    public ResponseEntity<User> findById(@PathVariable Long Id){
        var user = userService.findById(Id);
        return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User userToCreate){
        var userCreated = userService.create(userToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{Id}")
                .buildAndExpand(userCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(userCreated);
    }
}
