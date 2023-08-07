import java.util.Scanner;

public class DataExtenso {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String valorData = scan.next();
        scan.close();

        String diaString = valorData.substring(0,2);
        String mesString = valorData.substring(2,4);
        int mes = Integer.parseInt(mesString);
        String anoString = valorData.substring(4,8);

        String calendario[] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho","julho","agosto","setembro","outubro","novembro","dezembro"};
        System.out.printf("%s de %s de %s", diaString, calendario[(mes-1)], anoString);
    }
}
