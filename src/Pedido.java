import java.util.ArrayList;

public class Pedido {
    private Cliente cliente;// Atributo para armazenar o cliente associado ao pedido
    private ArrayList<Produto> produtos;// Atributo para armazenar a lista de produtos do pedido

    public Pedido(Cliente cliente) { // Construtor para inicializar o cliente e a lista de produtos
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto compra) { // Método para adicionar um produto ao pedido
        this.produtos.add(compra);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco() * produto.getQuantidade(); // Calcula o total multiplicando o preço pela
                                                                   // quantidade de cada produto
        }
        return total; // Retorna o valor total do pedido
    }

    public void exibir() {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Produtos:");
        for (Produto produto : produtos) {
            System.out.println("- " + produto.getNome() + " (" + produto.getQuantidade() + " x R$ " + produto.getPreco() + ")");
        }
        System.out.println("Total: R$ " + calcularTotal());
    }
}
