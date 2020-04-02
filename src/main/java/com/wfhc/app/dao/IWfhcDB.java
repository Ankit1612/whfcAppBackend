package com.wfhc.app.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wfhc.app.bean.Challenge;

@Repository
public interface IWfhcDB extends CrudRepository<Challenge, Integer>{ 

//	@Modifying
//	@Query(value = "insert into wfhc_table(u_name) VALUES(:name)", nativeQuery = true)
//	@Transactional
//	void addUser(@Param("name") String name);
	
	@Modifying
//	@Query(value = "update wfhc_table w set w.challenge = :challenge, w.unique_code = :unique_code where w.u_name = :u_name", nativeQuery = true)
	@Query(value = "insert into wfhc_table(u_name, challenge, unique_code) VALUES(:name, :challenge, :unique_code)", nativeQuery = true)
	@Transactional
	void createChallenge(@Param("name") String name, @Param("challenge") String challenge, @Param("unique_code") String uniqueCode);
	
	@Query(value = "select * from wfhc_table where unique_code = :uniqueCode", nativeQuery = true)
	Challenge getChallengeByUniqueCode(@Param("uniqueCode") String uniqueCode);
}