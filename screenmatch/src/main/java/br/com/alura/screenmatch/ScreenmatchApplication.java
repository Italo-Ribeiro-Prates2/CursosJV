package br.com.alura.screenmatch;

import br.com.alura.screenmatch.model.dadosSerie;
import br.com.alura.screenmatch.service.ConsumoAPI;
import br.com.alura.screenmatch.service.converterDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoAPI = new ConsumoAPI();
		var json = consumoAPI.obterDados("https://www.omdbapi.com/?t=the+flash&apikey=5e7be3cc");
		System.out.println(json);
		converterDados conversor= new converterDados();
		var dados = conversor.obterDados(json, dadosSerie.class);
		System.out.println(dados);
	}
}
