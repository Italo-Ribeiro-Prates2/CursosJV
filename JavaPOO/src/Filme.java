public class Filme {

        static String nome;
        int anoDeLancamento;
        boolean incluidoNoPlano;
        double avaliacoes;
        int totalDeAvaliacoes;
        int duracaoEmMinutos;


        void exibirFichaTecnica() {
                System.out.println("Nome do filme: " + nome);
                System.out.println("Ano de lançamento: " + anoDeLancamento);
        }
}

