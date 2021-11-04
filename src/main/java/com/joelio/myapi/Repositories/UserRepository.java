package com.joelio.myapi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.joelio.myapi.Domain.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Integer> {
}
