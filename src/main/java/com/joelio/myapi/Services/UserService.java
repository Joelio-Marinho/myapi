package com.joelio.myapi.Services;

import com.joelio.myapi.Domain.User;
import com.joelio.myapi.Repositories.UserRepository;
import com.joelio.myapi.Services.Exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User UserFindById(Integer id){
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto nao encontrado id:" +id+", tipo:"+ User.class.getName()));
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User update(Integer id, User obj) {
        User  userTemp = UserFindById(id);
        userTemp.setNome(obj.getNome());
        userTemp.setLogin(obj.getLogin());
        userTemp.setSenha(obj.getSenha());

        return userRepository.save(userTemp);
    }

    public User create(User obj) {
        obj.setId(null);
        return userRepository.save(obj);
    }

    public void delite(Integer id) {
        UserFindById(id);
        userRepository.deleteById(id);
    }
}
