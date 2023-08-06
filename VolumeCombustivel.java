import java.util.Scanner;

public class VolumeCombustivel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double altura, nivel, raio;
        double error = -1.000;

        altura = scan.nextDouble();
        nivel = scan.nextDouble();
        raio = scan.nextDouble();
        scan.close();

        double volume_calota = (Math.PI / 3.0) * Math.pow(nivel, 2) * (3.0 * raio - nivel); 
        double volume_esfera = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        double volume_cilindro = Math.PI * Math.pow(raio, 2) * (nivel - raio);

        double volume_total = 0.0;
        if (nivel > altura || altura < 0 || nivel < 0 || raio < 0) {
            volume_total = error;
        } else if (nivel <= raio) {
            volume_total = volume_calota;
        } else if (nivel <= (altura - raio)) {
            volume_total = (volume_esfera / 2.0) + volume_cilindro;
        } else if (nivel <= altura) {
            volume_total = ((volume_esfera + volume_cilindro) - volume_calota / 2.0);
        } else {
            volume_total = error;
        }

        System.out.printf("%.3f", volume_total);
    }
}

