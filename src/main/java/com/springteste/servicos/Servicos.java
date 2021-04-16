package com.springteste.servicos;

import org.springframework.stereotype.Service;

@Service
public class Servicos {
	
	public String hello(String s) {
		
		String hello = "Hello Word";
		
		if(s.equals("s")) {
			return hello;
		}
		
		return "Envie um s";
	}
	
}
