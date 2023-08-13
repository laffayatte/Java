import java.util.ArrayList;

public class Turma {
    String disciplina;
    int ano;
    int semestre;
    Professor professor;
    ArrayList<Aluno> alunos = new ArrayList<>();

    Turma(String disciplina, int ano, int semestre, Professor professor){
        this.disciplina = disciplina;
        this.ano = ano;
        this.semestre = semestre;
        this.professor = professor;

    }

    Aluno getAluno(int matricula){
        for(int i =0; i <= this.alunos.size() ; i++){
            if(alunos.get(i).matricula == matricula ){
                return this.alunos.get(i);
            }
            
        }
        return null;
    }
    
    void addAluno(Aluno aluno){
        for(Aluno alunoAux : this.alunos){
            if(alunoAux.matricula == aluno.matricula){
                return;
            }
        }
        alunos.add(aluno);
    }

    double getMediaIdade(){
        double media = 0;
        double idadetotal = 0;
        for(int i =0; i < alunos.size(); i++){
            idadetotal += alunos.get(i).getIdade();
        }
        media = idadetotal/alunos.size();
        return media;
    }

    String getDescricao(){
        int cont = 1;
        String descricao =  "turma "+disciplina+" - "+ano+"/"+semestre+" ("+professor.getDescricao()+"): \n";
        for(Aluno aluno : alunos){
            descricao += "- Aluno " + cont + ": " + aluno.getDescricao() + "\n";
            cont += 1;
        } 

        return descricao;
    }
}




