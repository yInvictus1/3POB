package L7.ex3;

class PrecoInvalidoException extends Exception {
    public PrecoInvalidoException(String mensagem) {
        super(mensagem);
    }
}

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) throws PrecoInvalidoException {
        if (preco <= 0) {
            throw new PrecoInvalidoException("Erro: O preço do produto deve ser maior que zero.");
        }
        this.nome = nome;
        this.preco = preco;
    }
    
    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: " + preco;
    }
}

public class Cadastrar_Produto{
    public static void main(String[] args) {
        try {
            Produto produto = new Produto("Notebook", -1000);
            System.out.println(produto);
        } catch (PrecoInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}