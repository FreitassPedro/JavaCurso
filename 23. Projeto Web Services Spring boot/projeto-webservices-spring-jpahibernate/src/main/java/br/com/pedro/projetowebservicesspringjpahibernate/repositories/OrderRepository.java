package br.com.pedro.projetowebservicesspringjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pedro.projetowebservicesspringjpahibernate.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
