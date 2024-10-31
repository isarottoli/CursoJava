package fundamentos;

public class TipoString {

    public static void main(String[] args) {
        System.out.println("Ola pessoal".charAt(5));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");

        System.out.println(s.startsWith("boa"));
        System.out.println(s.endsWith("tarde!"));

        System.out.println(s.length());

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;

        System.out.printf("Nome: %s %s Idade: %d", nome, sobrenome, idade);

        String frase = String.format("\nNome: %s %s Idade: %d", nome, sobrenome, idade);
        System.out.println(frase);
    }

}
