/*
import java.util.ArrayList;
import java.util.Scanner;

public class OperacoesInteiros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
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
*/
import java.util.ArrayList;
import java.util.Scanner;

public class OperacoesInteiros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            ArrayList<Integer> vetor = lerVetor(scan);
            
            if (vetor.isEmpty()) {
                break;
            }
            
            int par = contarPares(vetor);
            int impar = contarImpares(vetor);
            int somaTotal = calcularSoma(vetor);
            double media = calcularMedia(vetor);
            int menor = encontrarMenor(vetor);
            int maior = encontrarMaior(vetor);

            imprimirResultados(vetor.size(), par, impar, somaTotal, media, menor, maior);
        }

        scan.close();
    }
    
    public static ArrayList<Integer> lerVetor(Scanner scan) {
        ArrayList<Integer> vetor = new ArrayList<>();
        
        while (true) {
            int num = scan.nextInt();
            if (num == -1) {
                break;
            }
            vetor.add(num);
        }
        
        return vetor;
    }
    
    public static int contarPares(ArrayList<Integer> vetor) {
        int count = 0;
        for (int num : vetor) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    
    public static int contarImpares(ArrayList<Integer> vetor) {
        return vetor.size() - contarPares(vetor);
    }
    
    public static int calcularSoma(ArrayList<Integer> vetor) {
        int somaTotal = 0;
        for (int num : vetor) {
            somaTotal += num;
        }
        return somaTotal;
    }
    
    public static double calcularMedia(ArrayList<Integer> vetor) {
        return (double) calcularSoma(vetor) / vetor.size();
    }
    
    public static int encontrarMenor(ArrayList<Integer> vetor) {
        int menor = Integer.MAX_VALUE;
        for (int num : vetor) {
            if (num < menor) {
                menor = num;
            }
        }
        return menor;
    }
    
    public static int encontrarMaior(ArrayList<Integer> vetor) {
        int maior = Integer.MIN_VALUE;
        for (int num : vetor) {
            if (num > maior) {
                maior = num;
            }
        }
        return maior;
    }
    
    public static void imprimirResultados(int quant, int par, int impar, int somaTotal, double media, int menor, int maior) {
        System.out.println(quant);
        System.out.println(par);
        System.out.println(impar);
        System.out.println(somaTotal);
        System.out.printf("%.2f\n", media);
        System.out.println(maior);
        System.out.println(menor);
    }
}
