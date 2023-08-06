package Lista2;
import java.util.Scanner;

public class SomaColecao {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int valor = scan.nextInt();
        
        if (valor > 0){
            int soma = 0;
            while(valor != -1){
                soma += valor;
                valor = scan.nextInt();
            }
            System.out.println(soma);
        }
        scan.close();
    }   
}
