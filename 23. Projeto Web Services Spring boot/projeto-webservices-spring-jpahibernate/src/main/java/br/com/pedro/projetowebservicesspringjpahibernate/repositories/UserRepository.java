package br.com.pedro.projetowebservicesspringjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pedro.projetowebservicesspringjpahibernate.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
