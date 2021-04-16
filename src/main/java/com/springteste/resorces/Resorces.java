package com.springteste.resorces;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springteste.servicos.Servicos;

@RestController
@RequestMapping("/test")
public class Resorces {

	@Autowired
	private Servicos servico; 
	
	@GetMapping("/{id}")
	public String teste(@PathVariable(required = false) String id) {
		return servico.hello(id);
	}
	
	
	
}
