package fundamentos.operadores;

public class Ternario {

    public static void main(String[] args) {

        double media = 4;
        String resultado = media >= 7.0 ? "aprovado" : "em recuperação";

        //? - confere se a condição é verdadeira
        //: - Se não

        System.out.println("O aluno está " + resultado);
    }
}
