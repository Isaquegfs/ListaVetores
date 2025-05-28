package ListaVetores;
import java.util.Random;

public class Questao14 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int [] vetorA = new int[10];
        int [] vetorB = new int[10];
        int [] vetorMulti = new int[10];
        int [] vetorDivis = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(101);
            vetorB[i] = random.nextInt(101);
        }

        for (int i = 0; i < vetorA.length; i++) {
            vetorMulti[i] = vetorA[i] * vetorB[i];
            vetorDivis[i] = vetorA[i] / vetorB[i];
        }

        System.out.println("VetorA:");
        for (int i = 0; i < vetorA.length; i++) {
            System.err.print(vetorA[i] + " ");
        }

        System.out.println("\nVetorB:");
        for (int i = 0; i < vetorB.length; i++) {
            System.err.print(vetorB[i] + " ");
        }

        System.out.println("\nVetor Multiplicação:");
        for (int i = 0; i < vetorMulti.length; i++) {
            System.err.print(vetorMulti[i] + " ");
        }

        System.out.println("\nVetor Divisão:");
        for (int i = 0; i < vetorDivis.length; i++) {
            System.err.print(vetorDivis[i] + " ");
        }
    }    
}
