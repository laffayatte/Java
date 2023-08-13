import java.util.Scanner;

public class CifraCesar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int deslocamento = scan.nextInt();
        String textoOriginal = scan.nextLine();

        scan.close();

        String textoCriptografado = criptografarCesar(textoOriginal, deslocamento);
        System.out.println(textoCriptografado);
    }

    public static String criptografarCesar(String textoOriginal, int deslocamento) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < textoOriginal.length(); i++) {
            char cOriginal = textoOriginal.charAt(i);
            char cCifrado = cOriginal;

            if (Character.isLetter(cOriginal)) {
                if (Character.isUpperCase(cOriginal)) {
                    cCifrado = (char) ((cOriginal-'A' + deslocamento)%26+'A');
                } else if (Character.isLowerCase(cOriginal)) {
                    cCifrado = (char) ((cOriginal-'a' + deslocamento)%26+'A');
                }
            }
            resultado.append(cCifrado);
        }
        resultado.deleteCharAt(0);
        return resultado.toString();
    }
}
