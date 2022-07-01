package com.cg.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.main.model.AppUser;

@Repository
public interface UserRepository extends JpaRepository<AppUser,String>
{

	AppUser findByUserNameAndPassword(String u, String p);
	

}
