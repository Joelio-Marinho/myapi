package com.joelio.myapi.Controllers;

import com.joelio.myapi.Domain.User;
import com.joelio.myapi.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/Users")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping(value = "/{id}")
    public ResponseEntity<User> userFindById(@PathVariable Integer id){
        User obj = userService.UserFindById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> list= userService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<User> update(@PathVariable Integer id, @RequestBody User obj ){
        User newObj = userService.update(id,obj);
        return ResponseEntity.ok().body(newObj);

    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User obj){
        User userTemp = userService.create(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(userTemp.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
}
