import java.util.Random;
import java.util.Scanner;

public class DesafioAdivinhação {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerogerado = new Random().nextInt(100);
        int tentativas = 0;
        int chute = 0;

        while (tentativas < 5) {
            System.out.println("Tente adivinha o numero de 0 a 100");
            chute = scanner.nextInt();
            tentativas++;
            
            if (chute == numerogerado) {
                System.out.println("Parabéns você acertou!");
                break;
            } else if (chute < numerogerado) {
                System.out.println("Você errou! Seu chute foi menor que o número gerado.");
            } else if (chute > numerogerado) {
                System.out.println("Seu chute é maior que o Numero gerado.");
        }
                
        if (tentativas == 5 && chute !=numerogerado) {
            System.out.println("Você não acertou o número de tentativas permitidas, o numero de 0 a 100 era o numero: " +numerogerado);
            break;
        }
    }
    
}
}