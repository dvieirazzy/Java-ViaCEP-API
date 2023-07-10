package br.com.alura.cepsearcher.exceptions;

public class InvalidCEP extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private String errorMessage;

	public InvalidCEP(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	@Override
	public String getMessage() {
		return this.errorMessage;
	}
}
