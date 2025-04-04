package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.FieldNamingPolicy;


import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.SQLOutput;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do filme: ");
        var busca = leitura.nextLine();

        var endereco = "http://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=5e7be3cc";
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(meuTituloOmdb);
            //try{
            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("titulo ja convertido: ");
            System.out.println(meuTitulo);

            FileWriter escrita = new FileWriter("filmes.json");
            escrita.write("Nome: " + meuTitulo.toString() + "\n");
            escrita.close();

        } catch (NumberFormatException e){
            System.out.println("Ocorreu um erro");
            System.out.println("Erro: " + e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println("Algum erro de argumento na busca, verifique o nome do filme");
        }catch (ErroDeConversaoDeAnoException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Fim da execução");



    }
}
