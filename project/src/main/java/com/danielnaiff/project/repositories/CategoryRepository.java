package com.danielnaiff.project.repositories;

import com.danielnaiff.project.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
//classe que salva os dados
}
