package com.masterhr.user.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.masterhr.user.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users,Long>,JpaSpecificationExecutor<Users> {
	
	//@Query("select password from users where password=:password")	
	public List<Users> findByName(String name);

}
