package ListaVetores;
import java.util.Random;
import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner entrada = new Scanner(System.in);
        
        int [] vetor = new int[10];
        int usuario;
        boolean encontrado = false;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(101);
        }

        System.out.print("Digite um valor entre 0 e 100: ");
        usuario = entrada.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (usuario == vetor[i]) {
                System.out.println("O numero digitado se encontra no vetor, na posição: " + i);
                encontrado = true;
            }
        }
        if (encontrado == false) {
            System.out.println("O numero digitado NÃO se encontra no vetor");
        }
    entrada.close();
    }    
}
