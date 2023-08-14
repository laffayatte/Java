import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] semana = new int[7];

        preencherVetor(scan, semana);

        int maior = encontrarMaiorValor(semana);
        int[] maioresIndices = encontrarMaioresIndices(semana, maior);
        imprimirMaioresDias(maioresIndices);

        scan.close();
    }

    public static void preencherVetor(Scanner scan, int[] semana) {
        int aux = scan.nextInt();
        while (aux != -1) {
            semana[0] += aux;
            for (int i = 1; i < 7; i++) {
                semana[i] += scan.nextInt();
            }
            aux = scan.nextInt();
        }
    }

    public static int encontrarMaiorValor(int[] semana) {
        int maior = semana[0];
        for (int i = 1; i < 7; i++) {
            if (semana[i] > maior) {
                maior = semana[i];
            }
        }
        return maior;
    }

    public static int[] encontrarMaioresIndices(int[] semana, int maior) {
        int contador = 0;
        for (int i = 0; i < 7; i++) {
            if (semana[i] == maior) {
                contador++;
            }
        }
        int[] maioresIndices = new int[contador];
        int index = 0;
        for (int i = 0; i < 7; i++) {
            if (semana[i] == maior) {
                maioresIndices[index] = i + 1;
                index++;
            }
        }
        return maioresIndices;
    }

    public static void imprimirMaioresDias(int[] maioresIndices) {
        for (int i = 0; i < maioresIndices.length; i++) {
            System.out.println(maioresIndices[i]);
        }
    }
}
