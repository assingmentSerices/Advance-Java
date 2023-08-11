package com.adda.dollop.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adda.dollop.Bean.Product;
import com.adda.dollop.Repo.ProductRepo;
import com.adda.dollop.Service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {
@Autowired
	private ProductRepo productrepo;
	@Override
	public Product createEmployee(Product product) {
		// TODO Auto-generated method stub
		return this.productrepo.save(product);
	}

	@Override
	public Product updateEmployee(Product product) {
		// TODO Auto-generated method stub
		return this.productrepo.save(product);
	}

	@Override
	public boolean deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		 this.productrepo.deleteById(id);
		 return true;
	}

	@Override
	public Product findAll() {
		// TODO Auto-generated method stub
		return (Product) this.productrepo.findAll();
				
	}

	
}
