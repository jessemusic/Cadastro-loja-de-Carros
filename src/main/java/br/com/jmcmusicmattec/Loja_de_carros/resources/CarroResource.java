package br.com.jmcmusicmattec.Loja_de_carros.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.jmcmusicmattec.Loja_de_carros.entities.Carro;
import br.com.jmcmusicmattec.Loja_de_carros.service.CarroService;

@RestController
@RequestMapping(value = "/carros")
public class CarroResource {
	
	@Autowired
	private CarroService service;
	
	@GetMapping
	public ResponseEntity<List<Carro>> findAll(){
		
		List<Carro> list = service.findAll();
		
		return ResponseEntity.ok().body(list);

	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Carro> findById(@PathVariable Long id){
		Carro obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<Carro> insert(@RequestBody Carro obj){
		obj= service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		
		return ResponseEntity.created(uri).body(obj);
	}
	

}
