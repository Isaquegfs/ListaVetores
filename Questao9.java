package ListaVetores;
import java.util.Random;

public class Questao9 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int [] vetorA = new int[10];
        int primo, validador = 1, contador = 0;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = random.nextInt(101);
        }

        // Printa o vetor aleatório criado
        System.out.println("Vetor criado: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        // Criar um vetor somente com a quantidade de numeros primos encontrados
        for (int i = 0; i < vetorA.length; i++) {
            validador = 1;
            for (int n = 2; n < vetorA[i]; n++){
                primo = vetorA[i] % n;
                if (primo == 0){
                    validador = 0;
                    break;
                }   
            }
            if (validador == 1) {
                contador += 1;
            }   
        }
        int [] vetorPrimos = new int[contador];
        
        // Contador para percorrer o vetorPrimos
        int j = 0;

        // Adicionar numeros primos ao vetorPrimos
        for (int i = 0; i < vetorA.length; i++) {
            validador = 1;
            for (int n = 2; n < vetorA[i]; n++){
                primo = vetorA[i] % n;
                if (primo == 0){
                    validador = 0;
                    break;
                }   
            }
            if (validador == 1) {
                vetorPrimos[j] = vetorA[i];
                j++;
            }   
        }

        for (int i = 0; i < vetorPrimos.length; i++) {
            for (int n = 0; n < vetorA.length; n++) {
                if (vetorPrimos[i] == vetorA[n]) {
                    System.out.print("\nNumero primo na posição: " + n);
                }
            }
        }
    }    
}
