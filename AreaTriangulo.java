import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int s = (a+b+c)/2;
        if(a+b > c){
            float result_formula = (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.printf("%.2f",result_formula);
        }else{
            System.out.println("Triangulo invalido");
        }
        
        scan.close();
    }
}
