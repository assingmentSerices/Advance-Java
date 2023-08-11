package com.adda.dollop.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.dollop.Bean.GroupProduct;
import com.adda.dollop.Bean.Product;

public interface GroupProductRepo  extends JpaRepository<GroupProduct, Integer>{

	

}
