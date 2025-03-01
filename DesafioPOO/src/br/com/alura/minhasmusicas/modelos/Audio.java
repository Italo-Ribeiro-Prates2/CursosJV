package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String Titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }



    public int getTotalCurtidas() {
        return totalCurtidas;
    }



    public int getClassificacao() {
        return classificacao;
    }

    public void reproduzir() {
        this.totalReproducoes++;
    }

    public void curtir() {
        this.totalCurtidas++;
    }


}
