class Proprietario {

    //-> Atributos da classe
    String nome;
    int cnh;
    int anoNascimento;

    //-> Construtor
    Proprietario(){
        nome ="Emmett L. Brown";
        cnh = 98008173;
        anoNascimento = 1920;     
    }

    //-> Metodo de encadeamento de construtores
    Proprietario(String nome,int cnh, int anoNascimento){
        this.nome = nome;
        this.cnh = cnh;
        this.anoNascimento = anoNascimento;
    }

    Proprietario(String nome,int cnh){
        this(nome,cnh,0);
    }

    Proprietario(String nome){
        this(nome,0,0);
    }

    //-> metodos da classe
    int getIdade(int anoReferencia){
        return anoReferencia-anoNascimento;
    }

    String getDescricao(){
        return "Proprietario: nome="+nome+", cnh="+cnh+", anoNascimento=" +anoNascimento+".";
    }
}
