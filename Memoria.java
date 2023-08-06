public class Memoria {
    String marca;
    String tipo;
    double tamanho;
    double velocidade;
    int numPentes;

    Memoria(){
        marca = "Kingston";
        tipo = "DDR4";
        tamanho = 8.0;
        velocidade = 3.2;
        numPentes = 4;
    }

    Memoria(String marca, String tipo, double tamanho, double velocidade, int numPentes){
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.velocidade = velocidade;
        this.numPentes = numPentes;
    }

    double getTamanhoTotal(){
        return numPentes*tamanho;
    }

    double getVelocidadeParalela(){
        return velocidade*numPentes; 
    }

    String getDescricao(){
        return "Memoria: marca="+marca+", tipo="+tipo+", tamanho="+tamanho+"GB, velocidade="+velocidade+"GHz, numPentes="+numPentes+", tamanhoTotal="+getTamanhoTotal()+"GB, velocidadeParalela="+getVelocidadeParalela()+"GHz.";
    }
}
