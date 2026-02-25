import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> p;// Atributo para armazenar a lista de produtos do pedido

    public Estoque() { // Construtor para inicializar o cliente e a lista de produtos
        this.p = new ArrayList<>();
    }

    public void adicionarProduto(Produto p) { // Método para adicionar um produto ao pedido
        this.p.add(p);
    }

    public Produto buscarPorNome(String nome) {
        for (Produto produto : p) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto; // retorna o objeto inteiro
            }
        }
        return null; // retorna null se não encontrar
    }

    public void exibirTodos() {
        System.out.println("Produtos em estoque:");
        for (Produto produto : p) { // Itera sobre cada produto na lista de produtos do pedido
            System.out.println("- " + produto.getNome() + " - Preço: R$ " + produto.getPreco() + " - Quantidade: "
                    + produto.getQuantidade());
        }
    }

    public void exibirAbaixoDoEstoque(int limite) {
        System.out.println("Produtos abaixo do estoque mínimo (" + limite + " unidades):");
        for (Produto produto : p) { // Itera sobre cada produto na lista de produtos do pedido
            if (produto.getQuantidade() < limite) { // Verifica se a quantidade do produto é menor que o limite
                System.out.println("- " + produto.getNome() + " - Quantidade: " + produto.getQuantidade());
            }
        }
    }
}
