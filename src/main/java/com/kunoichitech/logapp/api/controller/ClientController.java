package com.kunoichitech.logapp.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kunoichitech.logapp.domain.model.Client;

@RestController
public class ClientController {

	@GetMapping ("/clients")
	public List<Client> list() {
		Client client1 = new Client();
		client1.setId(1L);
		client1.setNome("Andresa");
		client1.setEmail("andresa@kunoichitech.com");
		client1.setTelefone("(11) 11111-1111");
		
		Client client2 = new Client();
		client2.setId(2L);
		client2.setNome("Alessandro");
		client2.setEmail("alessandro@kunoichitech.com");
		client2.setTelefone("(11) 22222-2222");
		
		return null;	
	}
}

