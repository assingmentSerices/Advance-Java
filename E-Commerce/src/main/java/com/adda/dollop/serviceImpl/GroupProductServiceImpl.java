package com.adda.dollop.serviceImpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adda.dollop.Bean.GroupProduct;

import com.adda.dollop.Repo.GroupProductRepo;
import com.adda.dollop.Service.GroupProductService;
@Service
public class GroupProductServiceImpl implements GroupProductService {

	@Autowired
	private GroupProductRepo groupproductrepo;
	
	
	@Override
	public GroupProduct createGroupProduct(GroupProduct groupproduct) {
		// TODO Auto-generated method stu
		return this.groupproductrepo.save(groupproduct);
	}


	@Override
	public boolean deleteGroupProduct(Integer id) {
		// TODO Auto-generated method stub
		this.groupproductrepo.deleteById(id);
		return false;
	}
	
	@Override
	public GroupProduct updateGroupProduct(GroupProduct groupproduct) {
		// TODO Auto-generated method stub
		return this.groupproductrepo.save(groupproduct);
	}
	

	

}
