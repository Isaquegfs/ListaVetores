package ListaVetores;
import java.util.Random;


public class Questao4 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int [] vetor1 = new int[30];
        int [] vetor2 = new int[30];
        
        // Gerar vetor aleatório
        for (int i = 0; i < vetor1.length; i++ ) {
            vetor1[i] = random.nextInt(10); 
        }
        
        // Clonar vetor1
        vetor2 = vetor1.clone();
        
        // Printar vetor1
        System.out.println("Primeiro vetor: ");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(vetor1[i] + " ");
        }

        // Alterar 0 por 1 no vetor2
        for (int i = 0; i < vetor2.length; i++) {
            if (vetor2[i] == 0) {
                vetor2[i] = 1;
            }
        }
        
        // Printar vetor2
        System.out.println("\nSegundo vetor: ");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print(vetor2[i] + " ");
        }
    }
}
