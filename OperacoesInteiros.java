import java.util.ArrayList;
import java.util.Scanner;

public class OperacoesInteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            ArrayList<Integer> vetor = new ArrayList<>();
            while (true) {
                int n = scanner.nextInt();
                if (n == -1) {
                    break;
                }
                vetor.add(n);
            }
            if (vetor.size() == 0) {
                break;
            }

            int even = 0;
            int odd = 0;
            int sum = 0;
            double avg = 0.0;
            int min = Integer.MIN_VALUE;
            int max = Integer.MAX_VALUE;

            for (int n : vetor) {
                if (n % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
                sum += n;
                avg += n;
                if (n > min) {
                    min = n;
                }
                if (n < max) {
                    max = n;
                }
            }
            avg /= vetor.size();
            System.out.println(vetor.size());
            System.out.println(even);
            System.out.println(odd);
            System.out.println(sum);
            System.out.printf("%.2f\n", avg);
            System.out.println(min);
            System.out.println(max);
        }
        scanner.close();
    }
}
