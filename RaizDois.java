import java.util.Scanner;

public class RaizDois {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double N = scan.nextDouble();
        scan.close();

        calcularRaizQuadrada(N);
    }

    private static void calcularRaizQuadrada(double N) {
        double denom = 1;
        for (int i = 0; i < N; i++) {
            denom = 2 + (1 / denom);
            double resultado = 1 + (1/denom);
            System.out.printf("%.14f", resultado);
            System.out.println();
        }
    }
}