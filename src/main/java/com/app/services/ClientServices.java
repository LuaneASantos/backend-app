package com.app.services;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Service;
import com.app.dtos.ClientDto;
import com.app.entities.Client;

@Service
public class ClientServices {


	public Client salvar(ClientDto clientDto) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("app");
        EntityManager em = emf.createEntityManager();

		Client client = new Client();

		client.setNome(clientDto.getNome());
		client.setSexo(clientDto.getSexo());
		client.setEmail(clientDto.getEmail());
		client.setDataNascimento(clientDto.getDataNascimento());
		client.setNaturalidade(clientDto.getNaturalidade());
		client.setNacionalidade(clientDto.getNacionalidade());
		client.setCPF(clientDto.getCPF());
		client.setDataInclusao(new Date());
		
		em.getTransaction().begin();
		em.persist(client);
		em.getTransaction().commit();
		return client;
	}

	

}