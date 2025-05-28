package ListaVetores;
import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Questao10 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int [] vetor = new int[6];
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(101);
        }

        System.out.println("Vetor gerado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println(" ");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                pares.add(vetor[i]);
            }
            else {
                impares.add(vetor[i]);
            }
        }
        System.out.println("Numeros pares: " + pares);
        System.out.println("Quantidade de pares: " + pares.size());

        System.out.println("Numeros impares: " + impares);
        System.out.println("Quantiade de impares: " + impares.size());
    }    
}
