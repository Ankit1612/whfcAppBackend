package com.wfhc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wfhc.app.bean.Challenge;
import com.wfhc.app.dao.IWfhcDB;

@Service
public class WfhcServ implements IWfhcServ{

	@Autowired
	IWfhcDB wfhcDB;

//	@Override
//	public void addUser(String name) {
//		// TODO Auto-generated method stub
//		wfhcDB.addUser(name);
//	}

	@Override
	public void createChallenge(String name, String challenge, String uniqueCode) {
		// TODO Auto-generated method stub
		wfhcDB.createChallenge(name, challenge, uniqueCode);
	}

	@Override
	public Challenge getChallengeByUniqueCode(String uniqueCode) {
		// TODO Auto-generated method stub
		Challenge challenge = wfhcDB.getChallengeByUniqueCode(uniqueCode);
		return challenge;
	}
	
	
}