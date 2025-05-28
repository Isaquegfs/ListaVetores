package ListaVetores;
import java.util.Random;
import java.util.Arrays;

public class Questao1 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int maior;
        int [] vetor = new int [15];
        // Cria uma lista com numeros aleatorios de 0 a 100
        for (int i = 0; i < 15; i++){
            vetor[i] = random.nextInt(101);
        }

        // Mostra o vetor gerado
        System.out.println("Vetor gerado: ");
        for (int i = 0; i < 15; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("");
        // Cria uma copia de vetor para comparação
        int [] copia = vetor.clone();

        // Organiza vetor
        Arrays.sort(vetor);

        // Compara o maior numero de vetor, com cada item de copia, para saber em qual posição ele se encontrava
        for (int i = 0; i < copia.length; i++) {
            if (vetor[14] == copia[i]) {
                maior = i;
                System.out.println("Maior número: " + vetor[14] + " encontrado na posição: " + maior + " do vetor original.");
                break;
            }
        } 
    }
}

