package fundamentos;

public class DesafioLogicos {

    public static void main(String[] args) {

        //Se trabalhar terça e quinta, recebendo, você e sua
        // familia vão comprar uma tv 55".
        //Se trabalhar só um dos dias, comprará uma tv de 32 e
        // tomara um sorvete;

        boolean trabalhoTerca = true;
        boolean trabalhoQuinta = false;

        boolean comprouTv55 = trabalhoTerca && trabalhoQuinta;
        boolean comprouTv32 = trabalhoTerca ^ trabalhoQuinta;
        boolean comprouSorvete = trabalhoTerca || trabalhoQuinta;

        System.out.println("Comprou Tv 55\"? " + comprouTv55);
        System.out.println("Comprou Tv 32\"? " + comprouTv32);
        System.out.println("Tomou sorvete? " + comprouSorvete);

    }
}
