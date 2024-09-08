import java.util.Scanner;

public class AlunoPrincipal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno al = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        al.nome = sc.nextLine();

        al.nota1 = lerNota(sc, "Digite a nota do 1º semestre (0 a 30): ", 30);
        al.nota2 = lerNota(sc, "Digite a nota do 2º semestre (0 a 35): ", 35);
        al.nota3 = lerNota(sc, "Digite a nota do 3º semestre (0 a 35): ", 35);

        double notaFinal = al.calcularNota();
        System.out.println("Nota final: " + notaFinal);
        System.out.println(al.verificarAprovacao());

        sc.close();
    }

    public static double lerNota(Scanner sc, String mensagem, int max) {
        double nota;
        do {
            System.out.print(mensagem);
            nota = sc.nextDouble();
            if (nota < 0 || nota > max) {
                System.out.println("Nota inválida! Insira uma nota entre 0 e " + max);
            }
        } while (nota < 0 || nota > max);
        return nota;
    }
}

