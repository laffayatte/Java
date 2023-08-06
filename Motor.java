public class Motor {
    
    int tipo;
    double capacidade;
    int potencia;

    Motor(){
        tipo = 1;
        capacidade = 2.85;
        potencia = 130;
    }

    Motor(int tipo, double capacidade, int potencia){
        this.tipo=tipo;
        this.capacidade=capacidade;
        this.potencia=potencia;
    }

    String getTipoString(){
        switch(tipo){
            case 1:
                return "Gasolina";
            case 2:
                return "Alcool";
            case 3:
                return "Flex";
            case 4:
                return "Diesel";
            case 5:
                return "Eletrico";
            default:
                return "Outros";
        }
    }

    String getDescricao(){
        return "Motor: tipo="+getTipoString()+", capacidade="+capacidade+"L, potencia="+potencia+"CV.";
    }
}
