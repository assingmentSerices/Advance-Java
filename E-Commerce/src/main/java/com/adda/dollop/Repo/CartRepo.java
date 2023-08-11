package com.adda.dollop.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.dollop.Bean.Cart;

public interface CartRepo extends JpaRepository<Cart, Integer> {

}
