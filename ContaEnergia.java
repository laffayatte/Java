package Lista2;
import java.io.PrintStream;
import java.util.Scanner;

public class ContaEnergia {
    public static PrintStream valorApagar(int consumo, double modificador){
        double result = consumo*modificador;
        return System.out.printf("%.2f\n",result);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int consumo = scan.nextInt();

        String tipo = scan.next();
        scan.close();
        double error = -1.00;
        if (consumo > 0){
            switch(tipo){
                case "R":
                    if (consumo <= 500){
                        valorApagar(consumo, 0.40);
                        break;
                    }else{
                        valorApagar(consumo, 0.65);
                        break;
                    }
                case "I":
                    if (consumo <= 5000){
                        valorApagar(consumo, 0.55);
                        break;
                    }else{
                        valorApagar(consumo, 0.60);
                        break;
                    }
                case "C":
                    if (consumo <= 1000){
                        valorApagar(consumo, 0.55);
                        break;
                    }else{
                        valorApagar(consumo, 0.60);
                        break;
                    }
                default:
                    System.out.printf("%.2f",error);
            }
        }else{
            System.out.printf("%.2f",error);
        }
    }
}
