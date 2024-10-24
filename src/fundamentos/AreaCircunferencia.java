package fundamentos;

public class AreaCircunferencia {
    public static void main(String[] args) {
        double raio = 3.4;
        final double PI = 3.14159;
        double area;

        area = raio * raio * PI;
        System.out.println("A primeira area é: " + area);

        raio = 10;
        area = PI * raio * raio;

        System.out.println("área = " + area + "m2.");

    }
}
