import java.util.Scanner;

public class AsciiArt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quant = scan.nextInt();
        int altura = quant;
        for(int i=0; i < altura; i++){

            for(int j=0; j < quant*2; j++){
                if(j < quant - i || j >= quant + i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}
