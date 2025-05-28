package ListaVetores;
import java.util.Arrays;
import java.util.Random;

public class Questao8 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int [] vetor = new int[15];
        float [] vetorCopia = new float[15];
        float divisao;
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(101);
        }
    
        // Copiar e converter para float
        for (int i = 0; i < vetor.length; i++) {
            vetorCopia[i] = (float) vetor[i];
        }
    
        Arrays.sort(vetorCopia); 
    
        for (int i = 0; i < vetor.length; i++) {
            divisao = vetor[i] / vetorCopia[14];
            System.out.println(vetor[i] + " / " + vetorCopia[14] + " = " + divisao);
        }
    }    
}
