package com.adda.dollop.Service;

import com.adda.dollop.Bean.Cart;

public interface CartService {

	public Cart createCart(Cart cart);
	public Cart updateCart(Cart cart);
	 public Boolean  deleteCart(Integer id);
}
