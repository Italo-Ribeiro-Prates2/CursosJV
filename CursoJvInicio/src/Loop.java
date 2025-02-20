import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        Scanner leitura = new Scanner(System.in);
        
        
        /*for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme "); 
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }
         
        System.out.println("Media de avaliação " + mediaAvaliacao/3);*/

        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme "); 
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas ++;
            }

        }
        
        System.out.println("Media de avaliação " + mediaAvaliacao/3);

            
        } 
    }

