package Lista2;
import java.util.ArrayList;
import java.util.Scanner;

public class MediaColecao {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Integer> lista = new ArrayList<>();

        int valor;
        double soma = 0;
        double media = 0;

        while(true){
            valor = scan.nextInt();
            if (valor == -1){
                break;
            }
            lista.add(valor);
            soma += valor;
        }
        int tamanho = lista.size();
        media = soma/tamanho;
        System.out.printf("%.2f",media);

        scan.close();
    }
}
