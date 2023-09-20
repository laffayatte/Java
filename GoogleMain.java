import java.util.LinkedList;

public class GoogleMain extends ListaInvertida{
    public static void main(String[] args) {
        ListaInvertida listaInvertida = new ListaInvertida();
        listaInvertida.insere("force", "document1.txt");
        listaInvertida.insere("force", "document2.txt");
        listaInvertida.insere("force", "document3.txt");
        listaInvertida.insere("always", "document1.txt");
        listaInvertida.insere("one", "document3.txt");
        listaInvertida.insere("is", "document2.txt");
        listaInvertida.insere("is", "document3.txt");
        listaInvertida.insere("be", "document1.txt");
        listaInvertida.insere("will", "document1.txt");
        listaInvertida.insere("you", "document1.txt");
        listaInvertida.insere("you", "document2.txt");
        listaInvertida.insere("the", "document1.txt");
        listaInvertida.insere("the", "document2.txt");
        listaInvertida.insere("the", "document3.txt");
        listaInvertida.insere("remember", "document1.txt");
        listaInvertida.insere("this", "document3.txt");
        listaInvertida.insere("strong", "document2.txt");
        listaInvertida.insere("strong", "document3.txt");
        listaInvertida.insere("with", "document1.txt");
        listaInvertida.insere("with", "document2.txt");
        listaInvertida.insere("with", "document3.txt");

        System.out.println();
        System.out.println("Lista Invertida:");
        System.out.println(listaInvertida.toString());
        System.out.println();
        LinkedList<String> documentosForce = listaInvertida.busca("force");
        if (documentosForce != null) {
            System.out.println("Documentos da palava force " + documentosForce);
            System.out.println();
        } else {
            System.out.println("A palavra force não foi encontrada na lista.");
            System.out.println();
        }
    }
}
