package com.adda.dollop.Service;

import com.adda.dollop.Bean.Product;


public interface ProductService {
	public Product createEmployee(Product user);
	public Product updateEmployee(Product user);
	public boolean deleteEmployee (Integer id);
	 public Product findAll();


}
