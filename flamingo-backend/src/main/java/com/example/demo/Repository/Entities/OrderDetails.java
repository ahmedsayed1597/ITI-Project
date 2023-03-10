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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * OrderDetails generated by hbm2java
 */
@Entity
@Table(name="order_details"
    ,catalog="flamingoo"
)
public class OrderDetails  implements java.io.Serializable {


     private OrderDetailsId id;
     private User user;
     private Timestamp deleverDate;
     private Timestamp orderDate;
     private String status;
     private String paymentMethod;
     private String totalPrice;
     private Short numberOfItems;
     private Set<OrderProducts> orderProductses = new HashSet<OrderProducts>(0);

    public OrderDetails() {
    }

	
    public OrderDetails(OrderDetailsId id, User user, Timestamp deleverDate, Timestamp orderDate, String status) {
        this.id = id;
        this.user = user;
        this.deleverDate = deleverDate;
        this.orderDate = orderDate;
        this.status = status;
    }
    public OrderDetails(OrderDetailsId id, User user, Timestamp deleverDate, Timestamp orderDate, String status, String paymentMethod, String totalPrice, Short numberOfItems, Set<OrderProducts> orderProductses) {
       this.id = id;
       this.user = user;
       this.deleverDate = deleverDate;
       this.orderDate = orderDate;
       this.status = status;
       this.paymentMethod = paymentMethod;
       this.totalPrice = totalPrice;
       this.numberOfItems = numberOfItems;
       this.orderProductses = orderProductses;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="id", column=@Column(name="id", nullable=false) ), 
        @AttributeOverride(name="userId", column=@Column(name="user_id", nullable=false) ) } )
    public OrderDetailsId getId() {
        return this.id;
    }
    
    public void setId(OrderDetailsId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id", nullable=false, insertable=false, updatable=false)
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="delever_date", nullable=false, length=19)
    public Timestamp getDeleverDate() {
        return this.deleverDate;
    }
    
    public void setDeleverDate(Timestamp deleverDate) {
        this.deleverDate = deleverDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="order_date", nullable=false, length=19)
    public Timestamp getOrderDate() {
        return this.orderDate;
    }
    
    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    
    @Column(name="status", nullable=false, length=45)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    
    @Column(name="payment_method", length=45)
    public String getPaymentMethod() {
        return this.paymentMethod;
    }
    
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    
    @Column(name="total_price", length=45)
    public String getTotalPrice() {
        return this.totalPrice;
    }
    
    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    
    @Column(name="number_of_items")
    public Short getNumberOfItems() {
        return this.numberOfItems;
    }
    
    public void setNumberOfItems(Short numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="orderDetails")
    public Set<OrderProducts> getOrderProductses() {
        return this.orderProductses;
    }
    
    public void setOrderProductses(Set<OrderProducts> orderProductses) {
        this.orderProductses = orderProductses;
    }




}


