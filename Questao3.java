package ListaVetores;
import java.util.Random;
//import java.util.Arrays;


public class Questao3 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int [] lista  = new int [50];

        for (int i = 0; i < lista.length; i++){
            lista[i] = random.nextInt(201) -100;
        }

        System.out.println("Numeros positivos: ");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > 0){
                System.out.print(lista[i] + " ");
            }
        }
        System.out.println("");
        System.out.println("Numeros negativos: ");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] < 0){
                System.out.print(lista[i] + " ");
            }
        }
    }
}
