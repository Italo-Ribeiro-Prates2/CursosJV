package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + "Adicionado a lista de preferidas: " );
    }else {
            System.out.println("A música " + audio.getTitulo() + " não é uma das preferidas");
        }
}
}