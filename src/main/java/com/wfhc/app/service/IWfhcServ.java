package com.wfhc.app.service;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import com.wfhc.app.bean.Challenge;

@Component
public interface IWfhcServ {
	
//	void addUser(@Param("name") String name);
	
	void createChallenge(@Param("name") String name, @Param("challenge") String challenge, @Param("unique_code") String uniqueCode);
	
	Challenge getChallengeByUniqueCode(@Param("uniqueCode") String uniqueCode);

}
