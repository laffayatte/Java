import java.util.ArrayList;

public class Turma {
    String nome;
    String professor;
    int numAlunos;
    boolean acessivel;
    ArrayList<Integer> horarios = new ArrayList<>();

    Turma(){
        nome = "Algoritmos e Estrutura de Dados I";
        professor = "Edleno Silva";
        numAlunos = 60;
        acessivel = true;
    }

    Turma(String nome, String professor, int numAlunos, boolean acessivel){
        this.nome = nome;
        this.professor = professor;
        this.numAlunos = numAlunos;
        this.acessivel = acessivel;
    }

    void addHorario(int horario){
        this.horarios.add(horario);
    }

  
    String getHorariosString() {
        String[] dias = {"segunda", "terça", "quarta", "quinta", "sexta"};
        String[] horas = {"8hs", "10hs", "12hs", "14hs", "16hs", "18hs", "20hs"};

        StringBuilder horariosString = new StringBuilder();
        for (int horario : horarios) {
            int diaIndex = (horario - 1) / horas.length;
            int horaIndex = (horario - 1) % horas.length;
            horariosString.append(dias[diaIndex]).append(" ").append(horas[horaIndex]).append(", ");
        }

        return horariosString.substring(0, horariosString.length() - 2);
    }

    String getDescricao(){
        String acessivelStr = acessivel ? "sim" : "não";

        return "Turma: " + nome + "\n" +
                "Professor: " + professor + "\n" +
                "Número de Alunos: " + numAlunos + "\n" +
                "Horário: " + getHorariosString() + "\n" +
                "Acessível: " + acessivelStr;
    }
}
