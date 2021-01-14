package br.com.algaworks.api.controller;

import br.com.algaworks.domain.model.Cliente;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@PersistenceContext
	private EntityManager manager;
	
	@GetMapping
	public List<Cliente> listar() {

		return manager.createQuery("from Cliente", Cliente.class).getResultList();
	}

}
