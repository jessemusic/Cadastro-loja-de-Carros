package br.com.jmcmusicmattec.Loja_de_carros.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jmcmusicmattec.Loja_de_carros.entities.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
