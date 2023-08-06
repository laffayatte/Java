package Lista2;
import java.util.Scanner;

public class PorcentagemAcerto {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] respostas = lerVetor(scan);
        int[] gabarito = lerVetor(scan);        
        scan.close();
        double porcentagemAcerto = calcularPorcentagemAcerto(respostas, gabarito);

    }

    public static int[] lerVetor(Scanner scan) {
        String[] valores = scan.nextLine().split(" ");
        int[] vetor = new int[valores.length];

        for (int i = 0; i < valores.length; i++) {
            vetor[i] = Integer.parseInt(valores[i]);
        }

        return vetor;
    }

    public static double calcularPorcentagemAcerto(int[] respostas, int[] gabarito) {
        int totalQuestoes = respostas.length;
        int acertos = 0;

        for (int i = 0; i < totalQuestoes; i++) {
            if (respostas[i] == gabarito[i]) {
                acertos++;
            }
        }

        return (acertos * 100.0) / totalQuestoes;
    }
}
