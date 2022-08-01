package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Userservice 
{
	@Autowired
	private Userrepository ur;

	public Userrepository getUr() 
	{
		return ur;
	}

	public void setUr(Userrepository ur) 
	{
		this.ur = ur;
	}
	
	public void saveuser(Userdetails user)
	{
		getUr().save(user);
	}
	
	public List<Userdetails> checkuser(String uname,String pass)
	{
		return getUr().checkuser(uname, pass);
	}
	
	public List<Userdetails> checkid(Userdetails users)
	{
		return getUr().checkid(users);
	}
	
}
