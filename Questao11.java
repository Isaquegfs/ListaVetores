package ListaVetores;
import java.util.Random;

public class Questao11 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int [] vetor = new int[15];
        int soma = 0;
        float media;
        boolean menor = false;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(51);
        }

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        media = soma / 15;
        System.out.println("Media: " + media);

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < media) {
                System.out.println("Item: " + vetor[i] + " na posição: " + i + " é menor que a media.");
                menor = true;
            }

        }
        
        if (menor == false) {
            System.out.println("Nenhum numero é menor que a media!");
        }
    }     
}
