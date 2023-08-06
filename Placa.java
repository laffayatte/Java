class Placa {

    //Atributos da classe
    String placa;
    int tipo;

    //construtor
    Placa(){
        placa = "OAT-3966";
        tipo = 6;
    }

    Placa(String placa, int tipo){
        this.placa=placa;
        this.tipo=tipo;
    }

    //metodo
    String getTipoString(){
        switch(tipo){
            case 1:
                return "normal";
            case 2:
                return "Servico";
            case 3:
                return "Oficial";
            case 4:
                return "Auto Escola";
            case 5:
                return "Prototipo";
            case 6:
                return "Colecionador";
            default:
                return "Outros";
        }

    }

    boolean temEstacionamentoLivre(){
        if((tipo==2) || (tipo == 3)){
            return true;
        }else{
            return false;
        }
    }

    String getDescricao(){
        return "Placa: placa="+placa+", tipo="+getTipoString()+", estacionamentoLivre=" +temEstacionamentoLivre()+".";
        //o return recebe os metodos getTipoString e temEstacionamentoLivre
    }
}
