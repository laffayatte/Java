import java.util.Scanner;

public class AproximacaoPi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        calcularAproximacao(N);
        scan.close();
    }

    private static void calcularAproximacao(int N) {
        double aproximacao = 3;
        double a = 2;
        double b = 3;
        double c = 4;

        for (int i = 0; i < N; i++) {
            if(i%2 == 0 && i != 0){
                aproximacao = aproximacao - (4.0/(a*b*c));
                a+=2; b+=2; c+=2;
            }else if(i % 2 == 1){
                aproximacao = aproximacao + (4.0/(a*b*c));
                a+=2; b+=2; c+=2;
            }
            System.out.printf("%.6f", aproximacao);
            System.out.println();
        }
    }
}
