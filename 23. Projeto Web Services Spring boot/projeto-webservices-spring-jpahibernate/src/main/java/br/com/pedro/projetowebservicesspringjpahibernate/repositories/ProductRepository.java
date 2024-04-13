package br.com.pedro.projetowebservicesspringjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pedro.projetowebservicesspringjpahibernate.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
