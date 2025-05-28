package ListaVetores;
import java.util.Random;

public class Questao12 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int [] alunos = new int [10];
        int soma = 0;
        float media;

        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = random.nextInt(11);
        }

        // Somar notas da turma
        for (int i = 0; i < alunos.length; i++) {
            soma += alunos[i];
        }

        // Calcular media da turma
        media = soma / 10;
        System.out.println("Media da turma: " + media);

        // Alunos abaixo da media
        System.out.println("Alunos abaixo da media: ");
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] < media) {
                System.out.println("Aluno " + i + " Nota: " + alunos[i]);
            }
        }
        
        // Alunos na media
        System.out.println("");
        System.out.println("Alunos na media ou acima: ");
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] >= media) {
                System.out.println("Aluno " + i + " Nota: " + alunos[i]);
            }
        }
    }
}
