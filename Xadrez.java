import java.util.Scanner;

public class Xadrez {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tamanho = scan.nextInt();
        scan.close();

        for(int linha = 0; linha < tamanho; linha++){
            if(linha % 2 == 0){
                for(int coluna = 0; coluna < tamanho; coluna++){
                    System.out.print("* ");
                }
            } else{
                for(int coluna = 0; coluna < tamanho; coluna++){
                    if(coluna == 0){
                        System.out.print(" ");
                    }
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}

