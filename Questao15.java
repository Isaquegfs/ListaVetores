package ListaVetores;
import java.util.Random;

public class Questao15 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int [] vetor = new int[10];
        int [] vetorCopia = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(21) -10;
        }
        
        vetorCopia = vetor.clone();

        System.out.println("Vetor criado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\nVetor alterado:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                vetorCopia[i] = 0;
                
            }
        System.out.print(vetorCopia[i] + " ");
        }
    }    
}
