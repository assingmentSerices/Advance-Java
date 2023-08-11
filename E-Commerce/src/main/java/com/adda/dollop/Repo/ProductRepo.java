package com.adda.dollop.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.dollop.Bean.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
