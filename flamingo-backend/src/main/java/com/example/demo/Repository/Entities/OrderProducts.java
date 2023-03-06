package com.example.demo.Repository.Entities;
// Generated Mar 5, 2023, 5:09:22 PM by Hibernate Tools 6.2.0.CR1


import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * OrderProducts generated by hbm2java
 */
@Entity
@Table(name="order_products"
    ,catalog="flamingoo"
)
public class OrderProducts  implements java.io.Serializable {


     private OrderProductsId id;
     private OrderDetails orderDetails;
     private Product product;
     private String quantityOrdered;

    public OrderProducts() {
    }

	
    public OrderProducts(OrderProductsId id, OrderDetails orderDetails, Product product) {
        this.id = id;
        this.orderDetails = orderDetails;
        this.product = product;
    }
    public OrderProducts(OrderProductsId id, OrderDetails orderDetails, Product product, String quantityOrdered) {
       this.id = id;
       this.orderDetails = orderDetails;
       this.product = product;
       this.quantityOrdered = quantityOrdered;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="orderDetailsId", column=@Column(name="order_details_id", nullable=false) ), 
        @AttributeOverride(name="productId", column=@Column(name="product_id", nullable=false) ) } )
    public OrderProductsId getId() {
        return this.id;
    }
    
    public void setId(OrderProductsId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="order_details_id", nullable=false, insertable=false, updatable=false)
    @JoinColumn(name="product_id", nullable=false, insertable=false, updatable=false)
    public OrderDetails getOrderDetails() {
        return this.orderDetails;
    }
    
    public void setOrderDetails(OrderDetails orderDetails) {
        this.orderDetails = orderDetails;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="product_id", nullable=false, insertable=false, updatable=false)
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }

    
    @Column(name="quantity_ordered", length=45)
    public String getQuantityOrdered() {
        return this.quantityOrdered;
    }
    
    public void setQuantityOrdered(String quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }




}

