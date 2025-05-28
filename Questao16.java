package ListaVetores;
import java.util.Random;
import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int [] megaSena = new int[6];
        int [] usuario = new int[6];
        int numero;
        

        for (int i = 0; i < megaSena.length; i++) {
            megaSena[i] = random.nextInt(60) + 1;
        }

        for (int i = 0; i < usuario.length; i++) {
            while(true) {  
                System.out.print("Digite o " + (i+1)  + "° numero: ");
                numero = entrada.nextInt();
                
                // Verificar intervalo válido
                if (numero <= 0 || numero > 60) {
                    System.out.println("Valor inválido, digite um numero de 1 a 60.");
                    continue;
                }

                // Verificar se o numero já foi digitado
                boolean repetido = false;
                for (int j = 0; j < i; j++) {
                    if (usuario[j] == numero) {
                        repetido = true;
                        break;
                    }
                }

                if (repetido) {
                    System.out.println("Numero já digitado, escolha outro.");
                }
                else {
                    usuario[i] = numero;
                    break;
                }
            }
        }

        System.out.println("Numeros sorteados:");
        for (int num : megaSena) {
            System.out.print(num + " ");
        }

        System.out.println("\nNumeros digitados:");
        for (int num : usuario) {
            System.out.print(num + " ");
        }
        entrada.close();
    }
}    
