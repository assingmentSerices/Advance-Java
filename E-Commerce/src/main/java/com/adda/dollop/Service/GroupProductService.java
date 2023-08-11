package com.adda.dollop.Service;

import com.adda.dollop.Bean.GroupProduct;



public interface GroupProductService {

	public GroupProduct createGroupProduct(GroupProduct user);
	public GroupProduct updateGroupProduct(GroupProduct groupproduct);
	public boolean deleteGroupProduct (Integer id);


}
