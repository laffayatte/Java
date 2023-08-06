package Lista2;
import java.util.Scanner;

public class PinturaMuro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float custo_pintor = (float) scan.nextFloat();
        int altura= 3;
        int comprimento = 12;
        float area = comprimento*altura;
        float valor_area_pintor = area*custo_pintor;
        float valor_materiais = 100;
        float valor_total = valor_area_pintor+valor_materiais;
        System.out.printf("%.1f", valor_total);
        scan.close();
    }
}
