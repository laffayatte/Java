import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ensalamento {
    ArrayList<Sala> sala;
    ArrayList<Turma> turma;
    ArrayList<TurmaEmSala> ensalamento;
     
    Ensalamento(){
        sala = new ArrayList<>();
        turma = new ArrayList<>();
        ensalamento = new ArrayList<>();
    }

    void addSala(Sala sala){
        this.sala.add(sala);
    }

    void addTurma(Turma turma){
        this.turma.add(turma);
    }

    Sala getSala(Turma turma){
        for(TurmaEmSala turmaSalaAux: ensalamento){
            if(turmaSalaAux.turma == turma){
                return turmaSalaAux.sala;
            }
        }
        
        return null;
    }

    boolean salaDisponivel(Sala sala, int horario){
        for (TurmaEmSala turmaSalaAux : ensalamento){
            if(turmaSalaAux.sala == sala){
                for(int horarioAux: turmaSalaAux.turma.horarios){
                    if(horarioAux == horario){
                        return false;
                    }
                }
            }
        }

        return true;
    }

    boolean salaDisponivel(Sala sala, ArrayList<Integer> horarios) {
        for (int horario : horarios) {
            if (!salaDisponivel(sala, horario)) {
                return false;
            }
        }
        return true;
    }
    
    boolean alocar(Turma turma, Sala sala) {
        if (!turma.acessivel || !sala.acessivel) {
            return false;
        }
    
        if (turma.numAlunos > sala.capacidade) {
            return false;
        }
    
        for (int horario : turma.horarios) {
            if (!salaDisponivel(sala, horario)) {
                return false;
            }
        }
        ensalamento.add(new TurmaEmSala(turma, sala));
        return true;
    }

    void alocarTodas() {
        List<Turma> turmasOrdenadas = new ArrayList<>(turma);
        for(Turma turmaAux: turma){
            int numAlunos = turmaAux.numAlunos;
            Collections.sort(turmasOrdenadas, Comparator.comparingInt(turma -> -numAlunos).reversed());
        }
        

        for (Turma turma : turmasOrdenadas) {
            boolean alocada = false;

            for (Sala salaAux : sala) {
                if (salaAux.acessivel && turma.numAlunos <= salaAux.capacidade) {
                    ArrayList<Integer> horariosTurma = turma.horarios;
                    boolean disponivel = true;

                    for (int horario : horariosTurma) {
                        if (!salaDisponivel(salaAux, horario)) {
                            disponivel = false;
                            break;
                        }
                    }

                    if (disponivel) {
                        alocar(turma, salaAux);
                        alocada = true;
                        break;
                    }
                }
            }
        }
    }

    int getTotalTurmasAlocadas() {
        int totalAlocadas = 0;
        for (TurmaEmSala turmaSala : ensalamento) {
            if (turmaSala.sala != null) {
                totalAlocadas++;
            }
        }
        return totalAlocadas;
    }

    int getTotalEspacoLivre() {
        int totalEspacoLivre = 0;
        for (TurmaEmSala turmaSala : ensalamento) {
            Sala salaAtual = turmaSala.sala;
            Turma turmaAtual = turmaSala.turma;
            if (salaAtual != null) {
                totalEspacoLivre += salaAtual.capacidade - turmaAtual.numAlunos;
            }
        }
        return totalEspacoLivre;
    }

    
    
}
