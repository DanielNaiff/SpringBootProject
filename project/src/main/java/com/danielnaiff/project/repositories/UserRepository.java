package com.danielnaiff.project.repositories;

import com.danielnaiff.project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
//classe que salva os dados
}
