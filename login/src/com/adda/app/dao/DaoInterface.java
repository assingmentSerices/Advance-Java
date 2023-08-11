package com.adda.app.dao;

import com.add.user;

public interface DaoInterface {
	public Boolean login(String email, String password);
	public Boolean Singup(user user1);
	public Boolean Update(int id,String mail);
	public Boolean Soft(int id,String mail);

}
