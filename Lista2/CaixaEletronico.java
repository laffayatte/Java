package Lista2;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota_cliente = scan.nextInt();
        scan.close();
        if (nota_cliente < 0 || nota_cliente % 2 != 0){
            System.out.println("Valor invalido");
        }else{
            int nota50 = nota_cliente/50;
            nota_cliente %= 50;
            int nota10 = nota_cliente/10;
            nota_cliente %= 10;
            int nota2 = nota_cliente/2;

            System.out.printf("%d notas de R$50, %d notas de R$10 e %d notas de R$2\n",nota50, nota10, nota2);
        }

    }
}
