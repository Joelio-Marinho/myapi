package com.joelio.myapi.Controllers;

import com.joelio.myapi.Domain.User;
import com.joelio.myapi.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
