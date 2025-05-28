package ListaVetores;
import java.util.Random;

public class Questao6 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int [] vetorA = new int[5];
        int [] vetorB = new int[5];
        int [] vetorC = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(11);
            vetorB[i] = random.nextInt(11);
        }

        // Printar vetorA
        System.out.println("Vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        
        // Printar vetorB
        System.out.println("\nVetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        // Printar vetorC 
        System.out.println("\nVetor C: ");
        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] - vetorB[vetorB.length -1 -i]; 
            System.out.print(vetorC[i] + " ");
        }
    }
}
