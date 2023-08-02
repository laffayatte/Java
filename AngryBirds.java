import java.util.Scanner;

public class AngryBirds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // pegando os valores
        int speed = scan.nextInt();
        int angle = scan.nextInt();
        double distance = scan.nextDouble();

        //formatando os valores
        int modSpeed = Math.abs(speed);
        double angleRadians = Math.toRadians(angle);
        int modSpeedx2 = modSpeed * modSpeed;

        //valores dados
        double gravity = 9.8;
        double tolerance = 0.1;

        double result = (modSpeedx2 * Math.sin(2*angleRadians))/gravity;
        if (Math.abs(result - distance) < tolerance ){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

        scan.close();
    }
}
