package com.adda.dollop.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adda.dollop.Bean.Cart;
import com.adda.dollop.Bean.CartItem;
import com.adda.dollop.Repo.CartItemRepo;
import com.adda.dollop.Service.CartItemService;
@Service
public class CartItemServiceItemImpl implements CartItemService {
@Autowired
	private CartItemRepo cartitemrepo;

@Override
public CartItem createCartItem(CartItem carditem) {
	// TODO Auto-generated method stub
	return this.cartitemrepo.save(carditem);
}

@Override
public CartItem updateCartItem(CartItem carditem) {
	// TODO Auto-generated method stub
	return this.cartitemrepo.save(carditem);
}

@Override
public Boolean deleteCartItem(Integer id) {
	// TODO Auto-generated method stub
	
			this.cartitemrepo.deleteById(id);
			return true;
	
}

}
