public class Loja {
    public static void main(String[] args) { // Método principal
        Produto p1 = new Produto("Notebook", 3500, 10); // Criando um objeto da classe Produto usando o construtor
        p1.exibir();

        Produto p2 = new Produto("Smartphone", 1500, 20);
        p2.exibir();

        Produto p3 = new Produto("Tablet", 1000, 15);
        p3.exibir();

        p1.setPreco(-500); // Tentando definir um preço negativo para o produto p1, o que é inválido
        System.out.println(p1.getPreco());

        /////////////////////////////////////////////////////////////
        Eletronico p4 = new Eletronico("Smartphone", 1500, 20, "5V"); // Criando um objeto da classe Eletronico usando o
                                                                      // construtor
        p4.exibir();

        Eletronico p5 = new Eletronico("Tablet", 1000, 15, "3V");
        p5.exibir();

        ///////////////////////////////////////////////////

        Cliente c1 = new Cliente("Yuri", "123456789", "yuri@yuri"); // Criando um objeto da classe Cliente usando o
                                                                    // construtor padrão
        c1.exibir();

        Cliente c2 = new Cliente("Maria", "98765432111", "maria@maria");
        c2.exibir();

        // Pedido
        Pedido pedido1 = new Pedido(c1); // Criando um objeto da classe Pedido associado ao cliente c1
        pedido1.adicionarProduto(p1); // Adicionando o produto p1 ao pedido
        pedido1.adicionarProduto(p4); // Adicionando o produto p4 ao pedido
        pedido1.exibir(); // Exibindo os detalhes do pedido, incluindo o cliente, os produtos e o total
    }
}
