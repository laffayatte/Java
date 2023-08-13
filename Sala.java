public class Sala {
    int bloco;
    int sala;
    int capacidade;
    boolean acessivel;

    Sala(){
        bloco = 6;
        sala = 101;
        capacidade = 50;
        acessivel = true;        
    }

    Sala(int bloco, int sala, int capacidade, boolean acessivel){
        this.bloco = bloco;
        this.sala = sala;
        this.capacidade = capacidade;
        this.acessivel = acessivel;
    }

    String getDescricao(){
        String saidaAcesso;
        if(acessivel == true){
            saidaAcesso = "acessível";
        }else{
            saidaAcesso = "não acessível";
        }
        return "Bloco "+bloco+", Sala "+sala+" ("+capacidade+" lugares, "+saidaAcesso+")";
    }
}
