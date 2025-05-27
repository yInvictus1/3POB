package controller;
import java.util.ArrayList;
import java.util.List;
import domain.Aluno;

public class AlunoController {
    private ArrayList<Aluno> alunos;

    public AlunoController(){
        this.alunos = new ArrayList<>();

    }

    public List<Aluno> listarAlunos() {
        return new ArrayList<>(alunos);
    }

    public void adicionarAluno(int matricula, String nome, double coeficienteRendimento) {
        alunos.add(new Aluno(matricula, nome, coeficienteRendimento));
    }

    public boolean alterarAluno(int matricula, String nome, double coeficienteRendimento) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula() == matricula) {
                aluno.setNome(nome);
                aluno.setCoeficienteRendimento(coeficienteRendimento);
                return true;
            }
        }
        return false;
    }

    public boolean removerAluno(int matricula) {
        return alunos.removeIf(aluno -> aluno.getMatricula() == matricula);
    }
    

}
