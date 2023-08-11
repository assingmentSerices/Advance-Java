package com.adda.dollop.Repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.adda.dollop.Bean.CartItem;

public interface CartItemRepo  extends JpaRepository<CartItem, Integer>{



}
