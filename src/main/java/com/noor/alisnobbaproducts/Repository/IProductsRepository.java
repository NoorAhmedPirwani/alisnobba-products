package com.noor.alisnobbaproducts.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.noor.alisnobbaproducts.Model.Products;

public interface IProductsRepository extends JpaRepository<Products,Long> {

    
}
