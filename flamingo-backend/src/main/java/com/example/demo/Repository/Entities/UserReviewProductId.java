package com.example.demo.Repository.Entities;
// Generated Mar 5, 2023, 5:09:22 PM by Hibernate Tools 6.2.0.CR1


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * UserReviewProductId generated by hbm2java
 */
@Embeddable
public class UserReviewProductId  implements java.io.Serializable {


     private int productId;
     private int userId;

    public UserReviewProductId() {
    }

    public UserReviewProductId(int productId, int userId) {
       this.productId = productId;
       this.userId = userId;
    }
   


    @Column(name="product_id", nullable=false)
    public int getProductId() {
        return this.productId;
    }
    
    public void setProductId(int productId) {
        this.productId = productId;
    }


    @Column(name="user_id", nullable=false)
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof UserReviewProductId) ) return false;
		 UserReviewProductId castOther = ( UserReviewProductId ) other; 
         
		 return (this.getProductId()==castOther.getProductId())
 && (this.getUserId()==castOther.getUserId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getProductId();
         result = 37 * result + this.getUserId();
         return result;
   }   


}


