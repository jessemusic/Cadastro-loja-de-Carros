package br.com.jmcmusicmattec.Loja_de_carros.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jmcmusicmattec.Loja_de_carros.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
