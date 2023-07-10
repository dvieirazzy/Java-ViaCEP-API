package br.com.alura.cepsearcher.models;

public record Adress(String cep, String logradouro, String bairro,
		String localidade, String uf) {
	
	@Override
	public String toString() {
		return """
				
				CEP:            %s
				Street:         %s
				Neighborhood:   %s
				City:           %s
				State:          %s
				""".formatted(cep, logradouro, bairro, localidade, uf);
	}
}
