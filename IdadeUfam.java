package Lista2;
import java.util.Scanner;

public class IdadeUfam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int data = scan.nextInt();
        int result = Math.abs(1909 - data);
        System.out.printf("A UFAM tem %d anos de fundacao", result);
        scan.close();
    }
}
