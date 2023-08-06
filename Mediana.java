import java.util.Scanner;

public class Mediana {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double vetor1[] = new double[50];
        int indice = 0;
        while(true){
            double valor = scan.nextInt();
            if(valor == -1){
                break;
            }
            vetor1[indice] = valor;
            indice += 1;
        }
        if(indice%2==0){
            double valorFinal = (vetor1[(indice/2)]+vetor1[(indice/2)-1])/2;
            System.out.printf("%.1f",valorFinal);
        }else{
            double valorFinal = vetor1[(indice/2)];
            System.out.println(valorFinal);
        }

        scan.close();
    }   
}
