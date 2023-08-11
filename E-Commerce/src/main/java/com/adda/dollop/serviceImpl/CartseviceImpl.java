package com.adda.dollop.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adda.dollop.Bean.Cart;
import com.adda.dollop.Repo.CartRepo;
import com.adda.dollop.Service.CartService;
@Service
public class CartseviceImpl implements CartService{
@Autowired

private CartRepo cartrepo;
	@Override
	public Cart createCart(Cart cart) {
		// TODO Auto-generated method stub
		return this.cartrepo.save(cart);
	}

	@Override
	public Cart updateCart(Cart cart) {
		// TODO Auto-generated method stub
		return this.cartrepo.save(cart);
	}

	@Override
	public Boolean deleteCart(Integer id) {
		// TODO Auto-generated method stub
		 this.deleteCart(id);
		 return false;
	}

}
