package br.com.jmcmusicmattec.Loja_de_carros.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_carro")
public class Carro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String modelo;
	private Integer ano;
	private String marca;
	private String placa;

	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente clienteMotorista;
	
	public Carro() {
	}
	

	public Carro(Long id, String modelo, Integer ano, String marca, String placa, Cliente clienteMotorista) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.ano = ano;
		this.marca = marca;
		this.placa = placa;
		this.clienteMotorista = clienteMotorista;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public Cliente getClienteMotorista() {
		return clienteMotorista;
	}


	public void setClienteMotorista(Cliente clienteMotorista) {
		this.clienteMotorista = clienteMotorista;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
