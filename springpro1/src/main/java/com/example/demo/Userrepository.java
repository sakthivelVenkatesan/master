package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Userrepository extends  JpaRepository<Userdetails, Integer>
{

	@Query("from Userdetails where uname=?1 pass=?2")
	public List<Userdetails> checkuser(String uname,String pass);
	
	@Query("from Userdetails orderby uid asc ")
	public List<Userdetails> checkid(Userdetails user);
	
}
