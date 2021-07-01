package br.com.jmcmusicmattec.Loja_de_carros.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.jmcmusicmattec.Loja_de_carros.entities.Carro;
import br.com.jmcmusicmattec.Loja_de_carros.entities.Cliente;
import br.com.jmcmusicmattec.Loja_de_carros.entities.Endereco;
import br.com.jmcmusicmattec.Loja_de_carros.repositories.CarroRepository;
import br.com.jmcmusicmattec.Loja_de_carros.repositories.ClienteRepository;
import br.com.jmcmusicmattec.Loja_de_carros.repositories.EnderecoRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;

	@Autowired
	private CarroRepository carroRepository;
	@Override
	public void run(String... args) throws Exception {
		
		Cliente cl1 = new Cliente(null, "Alfredo", "111.222.333-44", Instant.parse("2001-06-20T19:13:03Z")); 
		Cliente cl2 = new Cliente(null, "Francisco", "333.444.555-66",Instant.parse("2010-03-10T09:33:07Z"));
		Cliente cl3 = new Cliente(null, "Mariana", "222.333.444.55", Instant.parse("2003-10-02T05:55:05Z"));
		
		clienteRepository.saveAll(Arrays.asList(cl1,cl2,cl3));
		
		Endereco end1 = new Endereco(null, "Jacinto pereira, 407", "São Tomé", "Marciana", "MA", "03595-321",cl1);
		Endereco end2 = new Endereco(null, "Rua das Cravisna,20", "São Vicente", "Guarujá", "SP", "02340-123",cl2);
		Endereco end3 = new Endereco(null, "Avenida Paulo Almeida, 13", "Otiguara", "Santo André", "SP", "02222-321",cl3);
		
		enderecoRepository.saveAll(Arrays.asList(end1,end2,end3));
		
		Carro car1 = new Carro(null, "Fiat", 2010, "Saveiro", "ZBA2346",cl1);
		Carro car2 = new Carro(null, "Chevrolet", 1009, "Corsa", "ABC1010",cl1);
		Carro car3 = new Carro(null, "Volkswagen", 1994, "Fusca", "AAA2345",cl2);
		Carro car4 = new Carro(null, "Honda", 2022, "EThosEletric", "ZABE0001",cl3);
		
		carroRepository.saveAll(Arrays.asList(car1,car2,car3,car4));
		
		
		
		
	}
	
}
