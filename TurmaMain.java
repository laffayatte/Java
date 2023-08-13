public class TurmaMain {
    public static void main(String[] args){
        Aluno aluno = new Aluno();

        aluno.nome = "Emmet L. Brown";
        aluno.matricula = 7714;
        aluno.anoNascimento = 2001;

        Professor professor = new Professor("Dr.", "Hubert J. Fransworth", 2208);

        Turma turma = new Turma(null, 0, 0, null);
        turma.disciplina = "Iniciação Tecnológica e Científica";
        turma.ano = 2016;
        turma.semestre = 1;
        turma.professor = professor;

        turma.addAluno(aluno);



        System.out.println();
    }
}
