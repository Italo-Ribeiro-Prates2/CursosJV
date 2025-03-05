package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musicas;
import br.com.alura.minhasmusicas.modelos.podcast;

public class Main {
    public static void main(String[] args) {
        Musicas minhaMusicas = new Musicas();
        minhaMusicas.setTitulo("Aerials");
        minhaMusicas.setAlbum("Toxicity");
        minhaMusicas.setCantor("System of a Down");

        for (int i = 0; i < 1000; i++) {
            minhaMusicas.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusicas.curtir();
        }

        podcast meuPodcast = new podcast();
        meuPodcast.setTitulo("Flow Podcast");
        meuPodcast.setApresentador("Igor3k");

        for (int i = 0; i < 1000; i++) {
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 5000; i++) {
            meuPodcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(minhaMusicas);
        preferidas.inclui(meuPodcast);
        

    }
}