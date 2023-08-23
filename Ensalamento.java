import java.util.ArrayList;
import java.util.Collections;

public class Ensalamento {
    ArrayList<Sala> salas;
    ArrayList<Turma> turmas;
    ArrayList<TurmaEmSala> ensalamento;
     
    Ensalamento(){
        salas = new ArrayList<>();
        turmas = new ArrayList<>();
        ensalamento = new ArrayList<>();
    }

    void addSala(Sala sala){
        this.salas.add(sala);
    }

    void addTurma(Turma turma){
        this.turmas.add(turma);
    }

    Sala getSala(Turma turma){
        for(TurmaEmSala turmaSalaAux: this.ensalamento){
            if(turmaSalaAux.turma == turma){
                return turmaSalaAux.sala;
            }
        }
        
        return null;
    }

    boolean salaDisponivel(Sala sala, int horario){
        for (TurmaEmSala turmaSalaAux : this.ensalamento){
            if(turmaSalaAux.sala == sala && turmaSalaAux.turma.horarios.contains(horario)){
                return false;
            }
        }

        return true;
    }

    boolean salaDisponivel(Sala sala, ArrayList<Integer> horarios) {
        for (Integer horario : horarios) {
            if (!salaDisponivel(sala, horario)) {
                return false;
            }
        }
        return true;
    }
    
    boolean alocar(Turma turma, Sala sala) {
        
        if (((turma.acessivel == sala.acessivel) || (sala.acessivel)) && (turma.numAlunos <= sala.capacidade) && (salaDisponivel(sala, turma.horarios))){
            this.ensalamento.add(new TurmaEmSala(turma, sala));
            return true;
        }
        return false;

    }
    
    ArrayList<Sala> ordenarSalasPorProximidade(Turma turma) {
        ArrayList<Sala> salasOrdenadas = new ArrayList<>(this.salas);
        Collections.sort(salasOrdenadas, (sala1, sala2) ->
            Math.abs(sala1.capacidade - turma.numAlunos) - Math.abs(sala2.capacidade - turma.numAlunos)
        );
        return salasOrdenadas;
    }
    
    void alocarTodas() {
        for (Turma turma : this.turmas) {
            ArrayList<Sala> salasOrdenadas = ordenarSalasPorProximidade(turma); 
            for (Sala salaAux : salasOrdenadas) {
                if(alocar(turma, salaAux)){
                    break;
                }
            }
        }
    }

    int getTotalTurmasAlocadas() {
        int totalAlocadas = 0;
        for (TurmaEmSala turmaSala : this.ensalamento) {
            if (turmaSala.sala != null) {
                totalAlocadas++;
            }
        }
        return totalAlocadas;
    }

    int getTotalEspacoLivre() {
        int totalEspacoLivre = 0;
        for (TurmaEmSala turmaSala : this.ensalamento) {
            Sala salaAtual = turmaSala.sala;
            Turma turmaAtual = turmaSala.turma;
            if (salaAtual != null) {
                totalEspacoLivre += salaAtual.capacidade - turmaAtual.numAlunos;
            }
        }
        return totalEspacoLivre;
    }

    String relatorioResumoEnsalamento(){
        return "Total de Salas: "+this.salas.size()+"\nTotal de Turmas: "+this.turmas.size()+"\nTurmas Alocadas: "+getTotalTurmasAlocadas()+"\nEspaços Livres: "+getTotalEspacoLivre();
    }

    String relatorioTurmasPorSala(){
        StringBuilder relatorio = new StringBuilder(relatorioResumoEnsalamento());
        
        for (Sala salaAux : this.salas) {
            relatorio.append(String.format("\n--- %s ---\n\n", salaAux.getDescricao()));
            for(TurmaEmSala turmaSala : this.ensalamento){
                if (turmaSala.sala != null && turmaSala.sala == salaAux) {
                    relatorio.append(String.format("%s\n", turmaSala.turma.getDescricao())).append("\n");
                }
            }
        }
        
        return relatorio.toString();
    }
    
    String relatorioSalasPorTurma(){
        StringBuilder relatorio = new StringBuilder(relatorioResumoEnsalamento());
        Sala salaAux;
        for(Turma turmaAux : this.turmas){
            relatorio.append(String.format("\n%s", turmaAux.getDescricao()));
            salaAux = getSala(turmaAux);
            if (salaAux != null) {
                relatorio.append(String.format("\nSala: %s\n", salaAux.getDescricao()));
            } else {
                relatorio.append("Sala: SEM SALA\n");
            }
        }

        return relatorio.toString();
    }

}
