public class Loja {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3500, 10); // Criando um objeto da classe Produto usando o construtor
        p1.exibir();

        Produto p2 = new Produto("Smartphone", 1500, 20);
        p2.exibir();

        Produto p3 = new Produto("Tablet", 1000, 15);
        p3.exibir();
    }
}
