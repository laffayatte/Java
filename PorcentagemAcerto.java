import java.util.Scanner;

public class PorcentagemAcerto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int respostas[] = new int[100];
        int gabarito[] = new int[100];
        int indice1 = 0;
        int indice2 = 0;
        double acertos = 0;
        

        while (true) {
            int resposta = scan.nextInt();
            if (resposta == -1) {
                break;
            }
            respostas[indice1] = resposta;
            indice1++;
        }
        while (true) {
            int respostaCorreta = scan.nextInt();
            if (respostaCorreta == -1) {
                break;
            }
            gabarito[indice2] = respostaCorreta;
            indice2++;
        }

        for (int i = 0; i < indice1; i++) {
            if (respostas[i] == gabarito[i]) {
                acertos++;
            }
        }
        double total = indice1;
        double porcentagem = acertos/ total * 100;
        System.out.printf( "%.2f", porcentagem);

        scan.close();
    }
}
