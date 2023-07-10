package br.com.alura.cepsearcher.models;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonAdress {
	
	public void jsonAdress(Adress adress) throws IOException {
		Gson gson = new GsonBuilder()
				.setPrettyPrinting()
				.create();
		
		FileWriter writer = new FileWriter("cep.json");
		writer.write(gson.toJson(adress));
		writer.close();
	}
}
