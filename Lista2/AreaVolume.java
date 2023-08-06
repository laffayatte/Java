package Lista2;
import java.util.Scanner;

public class AreaVolume {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double raio = scan.nextDouble();
        scan.close();
        double pi = Math.PI;
        

        double area_circulo = pi*(Math.pow(raio, 2));
        double volume_esfera = (4.0/3.0)*pi*(Math.pow(raio, 3));
    
        System.out.printf("Um circulo com raio de %.2f centimetros tem uma area de %.2f centimetros quadrados.\n",raio, area_circulo);
        System.out.printf("Uma esfera com raio de %.2f centimetros tem um volume de %.2f centimetros cubicos.", raio, volume_esfera);
    
    }
}
