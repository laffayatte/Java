package Lista2;
import java.util.Scanner;

public class PontoReta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Double x = scan.nextDouble();
        Double y = scan.nextDouble();
        Double result = 2*x+y;
        if (result == 3){
            System.out.printf("Ponto (%.1f, %.1f) pertence a reta 2x + y = 3.", x, y);
        }else{
            System.out.printf("Ponto (%.1f, %.1f) nao pertence a reta 2x + y = 3.", x, y);
        }

        scan.close();
    }
}


