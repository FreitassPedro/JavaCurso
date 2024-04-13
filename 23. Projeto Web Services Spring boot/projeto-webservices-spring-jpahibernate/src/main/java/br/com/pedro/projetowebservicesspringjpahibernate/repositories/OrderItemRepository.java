package br.com.pedro.projetowebservicesspringjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pedro.projetowebservicesspringjpahibernate.entities.OrderItem;
import br.com.pedro.projetowebservicesspringjpahibernate.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
    
}
