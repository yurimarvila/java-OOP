public class Cliente {
    private String nome;
    private String cpf;
    private String email;

    /////// Getters para acessar os atributos privados da classe Cliente
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    /////// Setters para modificar os atributos privados da classe Cliente

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        if (cpf != null && cpf.matches("\\d{11}")) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF inválido. O CPF deve conter 11 dígitos numéricos.");
            this.cpf = null;
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Construtor para inicializar os atributos do cliente
    public Cliente(String nome, String cpf, String email) {
        this.nome = nome;
        setCpf(cpf); // Usando o setter para validar o CPF
        this.email = email;
    }

    // Método para exibir as informações do cliente
    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
    }
}
