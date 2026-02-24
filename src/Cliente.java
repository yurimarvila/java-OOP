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

    public void setCpf(String cpf) { // Validação simples para garantir que o CPF tenha 11 dígitos numéricos
        if (cpf != null && cpf.matches("\\d{11}")) { // Verifica se o CPF é composto por exatamente 11 dígitos numéricos
            this.cpf = cpf; // Se o CPF for válido, atribui o valor ao atributo cpf
        } else {
            System.out.println("CPF inválido. O CPF deve conter 11 dígitos numéricos.");
            this.cpf = null; // Define o CPF como null para indicar que o valor é inválido
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
