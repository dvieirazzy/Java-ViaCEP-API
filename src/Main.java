
import java.io.IOException;
import java.util.Scanner;


import br.com.alura.cepsearcher.exceptions.InvalidCEP;
import br.com.alura.cepsearcher.models.Adress;
import br.com.alura.cepsearcher.models.CepQuery;
import br.com.alura.cepsearcher.models.JsonAdress;

public class Main {
	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Inform the CEP: ");
		var cep = scanner.nextLine();
		scanner.close();
		
		try {
			CepQuery cepQuery = new CepQuery();
			Adress adress = cepQuery.request(cep);
			System.out.println(adress);
			
			JsonAdress convert = new JsonAdress();
			convert.jsonAdress(adress);
			
		}catch(InvalidCEP e) {
			System.out.println(e.getMessage());
		}
	}
}
