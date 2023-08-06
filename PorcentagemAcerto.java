import java.util.Scanner;

public class PorcentagemAcerto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int respostas[] = new int[100];
        int gabarito[] = new int[100];
        int indice = 0;
        int acertos = 0;

        while (true) {
            int resposta = scan.nextInt();
            if (resposta == -1) {
                break;
            }
            respostas[indice] = resposta;
            indice++;
        }
        indice = 0;
        while (true) {
            int respostaCorreta = scan.nextInt();
            if (respostaCorreta == -1) {
                break;
            }
            gabarito[indice] = respostaCorreta;
            indice++;
        }

        for (int i = 0; i < indice; i++) {
            if (respostas[i] == gabarito[i]) {
                acertos++;
            }
        }
        double porcentagem = acertos / respostas.length * 100;
        System.out.printf( "%.2f", porcentagem);

        scan.close();
    }
}
