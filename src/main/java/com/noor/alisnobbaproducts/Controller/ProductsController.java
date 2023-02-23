package com.noor.alisnobbaproducts.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.noor.alisnobbaproducts.Model.Products;
import com.noor.alisnobbaproducts.Repository.IProductsRepository;

@RequestMapping("/products")
@CrossOrigin("*")
@RestController

public class ProductsController {

    @Autowired
    private IProductsRepository repo;

    @PostMapping("/add")
    public void AddProduct(@RequestBody Products p){
        repo.save(p);
    }

    @GetMapping("/all")
    public List<Products> AllProducts(){
        return repo.findAll( );
    }
    
}
