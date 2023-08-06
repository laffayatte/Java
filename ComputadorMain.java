public class ComputadorMain {
    public static void main(String[] args){
        Processador pros = new Processador();
        Memoria memo = new Memoria();
        Disco disco = new Disco();
        String fabricante = "Dell";
        Computador comp = new Computador(fabricante, pros, memo, disco);

        System.out.println(comp.getDescricao());
    }
}
