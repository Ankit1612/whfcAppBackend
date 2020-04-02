package com.wfhc.app.controller;

import java.util.Map;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wfhc.app.bean.Challenge;
import com.wfhc.app.service.IWfhcServ;

@CrossOrigin( origins = "*")
@RestController
public class WfhcController {

	@Autowired
	IWfhcServ wfhcServ;
	
//	@PostMapping(path="/addUser", produces="application/json")
//	public String createUser(@RequestBody Map<String, String> nameMap) {	
//		wfhcServ.addUser(nameMap.get("name"));
//		return nameMap.get("name");
//	}
	
	@PostMapping(path="/createChallenge", produces="application/json")
	public String createChallenge(@RequestBody Map<String, String> challengeMap) {
		String randomString = String.valueOf(challengeMap.get("challenge"))+String.valueOf(generateRandom());
		System.out.println("challenge: "+ challengeMap.get("challenge"));
		System.out.println("name: "+ challengeMap.get("name"));
		String uniqueCode = String.valueOf(Math.abs(randomString.hashCode()));
		wfhcServ.createChallenge(challengeMap.get("name"), challengeMap.get("challenge"), uniqueCode);
		return uniqueCode;
	}
	
	@GetMapping(path = "/{uniqueCode}", produces = "application/json")
	public Challenge getChallenge(@PathVariable("uniqueCode") String uniqueCode) {
		Challenge challenge = wfhcServ.getChallengeByUniqueCode(uniqueCode);
		return challenge;
	}
	
	public int generateRandom() {
		Random r = new Random(System.currentTimeMillis());
		return Math.abs(((1+r.nextInt(2)) * 10000 + r.nextInt(10000)));
	}
	
}
