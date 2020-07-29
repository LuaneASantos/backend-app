package com.app.controller;

import java.net.URI;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.app.dtos.ClientDto;
import com.app.entities.Client;
import com.app.responses.Response;
import com.app.services.ClientServices;


@RestController
@RequestMapping("/api/client")
public class ClientController {

	@Autowired
	private ClientServices clientServices;

	@PostMapping(path = "/new")
	public ResponseEntity<Response<Client>> cadastrar(@Valid @RequestBody ClientDto clientDto, BindingResult result) {
		Response<Client> response = new Response<Client>();

		if (result.hasErrors()) {
			result.getAllErrors().forEach(error -> response.getErrors().add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(response);
		}

		Client clientSalva = this.clientServices.salvar(clientDto);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/").buildAndExpand()
				.toUri();
		response.setData(clientSalva);
		return ResponseEntity.created(location).body(response);
	}


}