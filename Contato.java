public class Contato {
    private String nome;
    private String telefone;
    private String endereco;

    // Construtor
    public Contato(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    // Método para exibir os dados do contato
    @Override
    public String toString() {
        return "Nome: " + nome + "\nTelefone: " + telefone + "\nEndereco: " + endereco;
    }
}