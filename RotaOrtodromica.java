import java.util.Scanner;

public class RotaOrtodromica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double lat1 = scan.nextDouble();
        double long1 = scan.nextDouble();
        double lat2 = scan.nextDouble();
        double long2 = scan.nextDouble();
        scan.close();

        double lat1inRad = Math.toRadians(lat1);
        double long1inRad = Math.toRadians(long1);
        double lat2inRad = Math.toRadians(lat2);
        double long2inRad = Math.toRadians(long2);

        double distancia_pontos = 6371 * Math.acos(Math.sin(lat1inRad)*Math.sin(lat2inRad) + Math.cos(lat1inRad)*Math.cos(lat2inRad)*Math.cos(long1inRad - long2inRad));
        System.out.printf("A distancia entre os pontos (%.6f, %.6f) e (%.6f, %.6f) e de %.2f km", lat1, long1, lat2, long2, distancia_pontos);
    }
}
