public class Computador {
    String fabricante; 
    Processador processador = new Processador();
    Memoria memoria = new Memoria();
    Disco disco = new Disco();

    Computador(String fabricante,Processador processador, Memoria memoria, Disco disco){
        this.fabricante = fabricante;
        this.processador = processador;
        this.memoria = memoria;
        this.disco = disco;
    }

    String getDescricao(){
        return "Computador da fabricante "+fabricante+". Processador: marca="+processador.marca+", modelo="+processador.modelo+", velocidade="+processador.velocidade+"GHz, numNucleos="+processador.numNucleos+", velocidadeParalela="+processador.getVelocidadeParalela()+"GHz. Memoria: marca="+memoria.marca+", tipo="+memoria.tipo+", tamanho="+memoria.tamanho+"GB, velocidade="+memoria.velocidade+"GHz, numPentes="+memoria.numPentes+", tamanhoTotal="+memoria.getTamanhoTotal()+"GB, velocidadeParalela="+memoria.getVelocidadeParalela()+"GHz. Disco: marca="+disco.marca+", tipo="+disco.tipo+", capacidade="+disco.capacidade+"GB, rpm="+disco.rpm+"rpm.";
    }
}
