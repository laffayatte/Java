import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valor = scan.nextDouble();
        if (valor >= 200){
            double desconto = valor*0.05f;
            double resultado = valor - desconto;
            System.out.printf("%.2f", resultado);
        }else{
            System.out.printf("%.2f", valor);
        }
        scan.close();
    }
}   
