package com.adda.dollop.Service;

import com.adda.dollop.Bean.CartItem;

public interface CartItemService {
	public CartItem createCartItem(CartItem carditem );
	public CartItem updateCartItem(CartItem carditem);
	public Boolean deleteCartItem(Integer id);

}
