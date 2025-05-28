package ListaVetores;
import java.util.Random;

public class Questao5 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int B = 0;
        int [] vetor = new int[10];

        // Gerar vetor aleatorio de -10 a 10
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(21) -10;
        }
        
        System.out.println("Vetor criado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        // Somar valores positivos
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 0) {
                B = B + vetor[i];
            }
        }

        System.out.println("\nSoma dos vetores positivos: ");
        System.out.print(B);
    } 
}
