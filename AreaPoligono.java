import java.util.Scanner;

public class AreaPoligono {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pega as coordenadas do polígono
        System.out.println("Digite as coordenadas do polígono, separadas por espaço: ");
        double[] x = new double[100];
        double[] y = new double[100];
        for (int i = 0; i < x.length; i++) {
            x[i] = scanner.nextDouble();
            y[i] = scanner.nextDouble();
        }

        // Calcula a área do polígono
        double area = 0.0;
        for (int i = 0; i < x.length; i++) {
            if (i > 0) {
                area += (x[i] - x[i - 1]) * (y[i] + y[i - 1]);
            }
        }
        area /= 2.0;

        // Exibe a área do polígono
        System.out.printf("A área do polígono é %.4f\n", area);
        scanner.close();
    }
}

