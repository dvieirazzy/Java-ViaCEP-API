package br.com.alura.cepsearcher.models;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;


import br.com.alura.cepsearcher.exceptions.InvalidCEP;

public class CepQuery {
	
	public Adress request(String cep) throws IOException, InterruptedException {
		
		cep = cep.replaceAll("\\D", "");
		
		if (cep.length() == 8) {
			
			String adress = "https://viacep.com.br/ws/" + cep + "/json/";
			
			try {
				HttpClient client = HttpClient.newHttpClient();
				
				HttpRequest request = HttpRequest.newBuilder()
						.uri(URI.create(adress))
						.build();

				HttpResponse<String> response = client
				  	     .send(request, BodyHandlers.ofString());
				
				if (response.body().contains("\"erro\": true")){
					throw new InvalidCEP("\nERROR: Invalid CEP");
				}
				
				return new Gson().fromJson(response.body(), Adress.class);
			} catch(IllegalArgumentException e) {
				System.out.println("\nERROR: " + e.getMessage());
				return null;
			}
		}
		throw new InvalidCEP("\nERROR: Invalid CEP");
	}
}
