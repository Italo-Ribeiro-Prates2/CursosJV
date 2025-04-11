package br.com.alura.screenmatch.principal;

import java.util.Scanner;


public class Principal {
private Scanner leitura = new Scanner(System.in);




    public void exibirMenu(){
        System.out.println("Digite uma série para busca");
        String nomeSerie = leitura.nextLine();
    }
}
