package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int EpisodiosPorTemporada;
    private int minutosPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return EpisodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.EpisodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * EpisodiosPorTemporada * minutosPorEpisodio;
    }
}
