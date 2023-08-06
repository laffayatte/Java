import java.util.Scanner;

public class TanqueCombustivel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double raio = scan.nextDouble();
        double altura = scan.nextDouble();
        int opcao = scan.nextInt();
        double volume_calota = (Math.PI/3)*Math.pow(altura,2)*(3*raio - altura);
        double volume_esfera = (4.0/3.0)*Math.PI*Math.pow(raio, 3);

        switch(opcao){
            case 1:
                System.out.printf("%.4f", volume_calota);
                break;
            case 2:
                System.out.printf("%.4f", volume_esfera-volume_calota);
                break;
        }

        scan.close();
    }
}
