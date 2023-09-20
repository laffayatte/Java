import java.util.Hashtable;
import java.util.LinkedList;

public class ListaInvertida {
    private Hashtable<String, LinkedList<String>> tabela;

    public ListaInvertida() {
        tabela = new Hashtable<>();
    }

    public boolean insere(String palavra, String documento) {
        if (tabela.containsKey(palavra)) {
            LinkedList<String> documentos = tabela.get(palavra);
            if (!documentos.contains(documento)) {
                documentos.add(documento);
                return true;
            }
            return false; 
        } else {
            LinkedList<String> novaLista = new LinkedList<>();
            novaLista.add(documento);
            tabela.put(palavra, novaLista);
            return true;
        }
    }

    public LinkedList<String> busca(String palavra) {
        return tabela.get(palavra);
    }

    @Override
    public String toString() {
        return tabela.toString();
    }

}

