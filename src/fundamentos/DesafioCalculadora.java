package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double numero1, numero2, result;

        System.out.print("Digite o primeiro numero: ");
        numero1 = entrada.nextDouble();

        System.out.print("Digite o segundo numero: ");
        numero2 = entrada.nextDouble();

        System.out.print("Informe a operação (+, -, /, *): ");
        String operacao = entrada.next();

        //Usando comparação de strings e operadores ternários para realizar a operação

        result = "+".equals(operacao) ? numero1 + numero2 :
         "-".equals(operacao) ? numero1 - numero2 :
         "/".equals(operacao) ? numero1 / numero2 :
         "*".equals(operacao) ? numero1 * numero2 : 0;

        System.out.printf("A resposta da operação %.2f %s %.2f é %.2f ", numero1, operacao, numero2, result);


    }
}
