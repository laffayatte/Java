import java.util.Scanner;

public class Palindromos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sequencia = scan.nextLine();
        scan.close();

        String sequenciaLimpa = formatarSequencia(sequencia);
        String sequenciaInvertida = inverterSequencia(sequenciaLimpa);

        System.out.println(sequenciaLimpa+" "+(sequenciaLimpa.equals(sequenciaInvertida)?"1":"0"));
    }

    public static String formatarSequencia(String sequencia) {
        return sequencia.replaceAll("[^a-zA-Z]", "").toUpperCase();
    }

    public static String inverterSequencia(String sequencia) {
        StringBuilder stringNula = new StringBuilder(sequencia);
        return stringNula.reverse().toString();
    }
}

