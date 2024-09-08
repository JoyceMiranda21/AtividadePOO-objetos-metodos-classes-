public class Aluno {
    String nome;
    double nota1;
    double nota2;
    double nota3;

    public double calcularNota() {
        return nota1 + nota2 + nota3;
    }

    public String verificarAprovacao() {
        double notaFinal = calcularNota();
        if (notaFinal >= 70) {
            return "Aprovado";
        } else {
            double pontosFaltando = 70 - notaFinal;
            return "Reprovado. Pontos faltando: " + pontosFaltando;
        }
    }
}

