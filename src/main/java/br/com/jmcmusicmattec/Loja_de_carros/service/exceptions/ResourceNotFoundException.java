package br.com.jmcmusicmattec.Loja_de_carros.service.exceptions;

public class ResourceNotFoundException  extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Requerimento não encotrado. Id "+ id);
	}
	
}
