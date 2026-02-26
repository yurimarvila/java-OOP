public class Eletronico extends Produto { // Classe Eletronico que herda da classe Produto
    private String voltagem;

    /////////////////////////// Implementação dos métodos da interface Desconto

    @Override
    public double aplicarDesconto(double percentual) {
        return getPreco() * (1 - percentual / 100); // Aplica o desconto diretamente no preço do eletrônico, sem considerar a quantidade
    }

    //////////////// Fim da implementação dos métodos da interface Desconto

    public Eletronico(String nome, double preco, int quantidade, String voltagem) {
        super(nome, preco, quantidade); // Chama o construtor da classe pai (Produto)
        this.voltagem = voltagem;
    }

    @Override // Anotação para indicar que o método exibir foi sobrescrito
    public void exibir() { // Sobrescreve o método exibir para incluir a voltagem
        super.exibir(); // Chama o método exibir da classe pai para mostrar as informações do produto
        System.out.println("Voltagem: " + voltagem); // Exibe a voltagem específica do eletrônico
    }
}