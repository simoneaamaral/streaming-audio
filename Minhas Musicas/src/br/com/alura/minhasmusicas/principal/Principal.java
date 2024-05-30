package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Supera");
        minhaMusica.setCantor("Marília Mendonça");

        for (int i = 0; i < 1000; i++){
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 50; i++){
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Podpeople");
        meuPodcast.setApresentador("Dra. Ana Beatriz");

        for (int i = 0; i < 5000; i++){
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 1000; i++){
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(minhaMusica);
        preferidas.inclui(meuPodcast);

    }

}
