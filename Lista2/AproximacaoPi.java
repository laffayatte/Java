package Lista2;
import java.util.Scanner;

public class AproximacaoPi {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();           
        scan.close();
        double piPadrao = 3.000000;
        double valor1 = 2.0;
        double valor2 = 3.0;
        double valor3 = 4.0;
        double calculo_de_aproximacao = 3+(4.0/(valor1 * valor2 * valor3));
        
        if(n == 1){
            System.out.printf("%.6f\n", piPadrao);
        }else{
            System.out.printf("%.6f\n", piPadrao);
            for(int i = 0; i < n-1; i++){
                valor1 += 2.0;
                valor2 += 2.0;
                valor3 += 2.0;
                System.out.printf("%.6f\n",calculo_de_aproximacao);
            }
        }
    }
}





