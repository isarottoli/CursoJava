package fundamentos;

public class DesafiosAritmeticos {
    public static void main(String[] args) {
        double supA = 6 * (3 + 2);
        double supA2 = Math.pow(supA, 2);
        double denA = 3 * 2;

        double primeira = supA2 / denA;

        double supB = (1 - 5) * (2 - 7);
        double denB = supB / 2;
        double supB2 = Math.pow(denB, 2);


        double totalCima = primeira - supB2;
        double totalCima3 = Math.pow(totalCima, 3);

        double baixo = Math.pow(10, 3);

        double totalGeral = totalCima3 / baixo;

        System.out.printf("%.2f / %.2f\n", totalCima3, baixo);

        System.out.println(totalGeral);
    }
}
