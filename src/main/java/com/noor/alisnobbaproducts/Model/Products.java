package com.noor.alisnobbaproducts.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name ="alisnobba-products")

public class Products {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;
    
    @Setter
    private String productName;
    
    @Setter
    @Column(columnDefinition = "text", nullable = false)
    private String shortDescription;
    
    @Setter
    @Column(columnDefinition = "text", nullable = false)
    private String longDescription;

    @Setter
    @Column(columnDefinition = "text", nullable = false)
    private String imageLink;

    @Setter
    private long price;

    public Products() {

    }

    public Products(String productName, String shortDescription, String longDescription, String imageLink, long price) 
    {
        this.productName = productName;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.imageLink = imageLink;
        this.price = price;
    }

  


}
