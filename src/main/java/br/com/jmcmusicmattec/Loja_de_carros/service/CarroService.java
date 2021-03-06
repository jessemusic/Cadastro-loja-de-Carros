package br.com.jmcmusicmattec.Loja_de_carros.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jmcmusicmattec.Loja_de_carros.entities.Carro;
import br.com.jmcmusicmattec.Loja_de_carros.repositories.CarroRepository;

@Service
public class CarroService {
	
	@Autowired
	private CarroRepository repository;
	
	public List<Carro> findAll(){
		return repository.findAll();
	}
	
	public Carro findById(Long id) {
		Optional<Carro> obj = repository.findById(id);
		return obj.get();
	}
	
	public Carro insert(Carro obj) {
		return repository.save(obj);
	}
	

	public void delete(Long id) {
		repository.deleteById(id);
	}

}
