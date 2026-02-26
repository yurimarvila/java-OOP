public class Relatorio {
    public static void gerarRelatorio(Estoque estoque, Pedido pedido) {
        System.out.println("===== RELATÓRIO DO SISTEMA =====\n");

        // --- ESTOQUE ---
        System.out.println("--- ESTOQUE ---");
        estoque.exibirTodos();
        System.out.println();

        // --- PRODUTOS ABAIXO DE 12 UNIDADES ---
        System.out.println("--- PRODUTOS ABAIXO DE 12 UNIDADES ---");
        estoque.exibirAbaixoDoEstoque(12);
        System.out.println();

        // --- PEDIDO ---
        System.out.println("--- PEDIDO ---");
        pedido.exibir();
        System.out.println();

        // --- DESCONTOS DISPONÍVEIS ---
        System.out.println("--- DESCONTOS DISPONÍVEIS ---");
        for (Produto produto : estoque.getProdutos()) {
            double precoComDesconto = produto.aplicarDesconto(10); // Aplicando um desconto de 10%
            System.out.println("- " + produto.getNome() + ": Preço com desconto de 10%: R$ " + precoComDesconto);
        }
    }
}