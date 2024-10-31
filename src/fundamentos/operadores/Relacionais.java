package fundamentos.operadores;

public class Relacionais {

    public static void main(String[] args) {
        int a = 97;
        int b = 'a';

        System.out.println(a == b);
        System.out.println(3 > 5);
        System.out.println(3 < 5);
        System.out.println(3 != 5);
        System.out.println(3 <= 5);
        System.out.println(3 >= 5);

        double nota = 7.3;
        boolean passouPorNota = nota >= 7;
        boolean bomComportamento = true;
        boolean temBolsa = bomComportamento && passouPorNota;
        System.out.println("Tem desconto? " + temBolsa);

    }
}
