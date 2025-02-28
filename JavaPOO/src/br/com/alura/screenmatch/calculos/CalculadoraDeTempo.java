package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

   /* public void inclui(Filme F) {
        this.tempoTotal += F.getDuracaoEmMinutos();

    }
    public void inclui(Serie S) {
        this.tempoTotal += F.getDuracaoEmMinutos();
    }*/

    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
