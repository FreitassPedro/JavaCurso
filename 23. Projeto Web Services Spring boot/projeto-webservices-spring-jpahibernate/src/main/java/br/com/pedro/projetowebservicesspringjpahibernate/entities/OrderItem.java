package br.com.pedro.projetowebservicesspringjpahibernate.entities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.pedro.projetowebservicesspringjpahibernate.entities.pk.OrderItemPK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private OrderItemPK idOrderItemPK = new OrderItemPK();

    private Integer quantity;
    private Double price;

    public OrderItem() {
    }

    public OrderItem(Order order, Product product, Integer quantity) {
        super();
        idOrderItemPK.setOrder(order);
        idOrderItemPK.setProduct(product);
        this.quantity = quantity;
        this.price = product.getPrice();
    }

    @JsonIgnore
    public Order getOrder() {
        return idOrderItemPK.getOrder();
    }

    public void setOrder(Order order) {
        idOrderItemPK.setOrder(order);
    }

    public Product getProduct() {
        return idOrderItemPK.getProduct();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSubtotal() {
        return price * quantity;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idOrderItemPK == null) ? 0 : idOrderItemPK.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OrderItem other = (OrderItem) obj;
        if (idOrderItemPK == null) {
            if (other.idOrderItemPK != null)
                return false;
        } else if (!idOrderItemPK.equals(other.idOrderItemPK))
            return false;
        return true;
    }
}
