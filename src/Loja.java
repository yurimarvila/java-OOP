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
        Eletronico p4 = new Eletronico("Smartphone", 1500, 20, "5V"); // Criando um objeto da classe Eletronico usando o construtor
        p4.exibir();

        Eletronico p5 = new Eletronico("Tablet", 1000, 15, "3V");
        p5.exibir();
    }
}
