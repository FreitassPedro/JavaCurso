package br.com.pedro.projetowebservicesspringjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pedro.projetowebservicesspringjpahibernate.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
