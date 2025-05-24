package com.example.aula.repository;

import com.example.aula.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Spring Data JPA já fornece métodos básicos como save(), findAll(), findById(), etc.
}