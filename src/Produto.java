public class Produto { // Classe Produto com atributos e métodos

    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() { // Getter para obter o nome do produto
        return nome;
    }

    public void setNome(String nome) { // Setter para definir o nome do produto
        this.nome = nome;
    }

    public double getPreco() { // Getter para obter o preço do produto
        return preco;
    }

    public void setPreco(double preco) { // Setter para definir o preço do produto
        this.preco = preco;
    }

    public int getQuantidade() { // Getter para obter a quantidade do produto
        return quantidade;
    }

    public void setQuantidade(int quantidade) { // Setter para definir a quantidade do produto
        this.quantidade = quantidade;
    }

    public Produto(String nome, double preco, int quantidade) { // Construtor para inicializar os atributos
        this.nome = nome; // O "this" é usado para referenciar os atributos da classe
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibir() { // Método para exibir as informações do produto
        System.out.println("Nome: " + nome);
        System.out.println("Preço R$: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }
}