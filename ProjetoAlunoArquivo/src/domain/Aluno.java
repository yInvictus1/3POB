package domain;

public class Aluno {

    private int matricula;
    private String nome;
    private double coeficienteRendimento;
    
    public Aluno(int matricula, String nome, double coeficienteRendimento) {
        this.matricula = matricula;
        this.nome = nome;
        this.coeficienteRendimento = coeficienteRendimento;
    }

    public int getMatricula() {
        return matricula;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }    
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getCoeficienteRendimento() {
        return coeficienteRendimento;
    }
    
    public void setCoeficienteRendimento(double coeficienteRendimento) {
        this.coeficienteRendimento = coeficienteRendimento;
    }
    
    public void mostrarInfo(){
        System.out.println("Nome: " + nome + "\nMatricula: " + matricula + "\nCoeficiente de Rendimento: " + coeficienteRendimento);
        //toString();
    }
}
