public class Pessoa {

    //Declaração de Variaveis encapsuladas, privadas.
    private String nome;
    private int idade;
    private String cidade;
    private String estado;
    private String bairro;
    private long telefone;
    private String email;
    
    
    public Pessoa(String nome, int idade, String cidade, String estado, String bairro, long telefone, String email) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.estado = estado;
        this.bairro = bairro;
        this.telefone = telefone;
        this.email = email;
    }
    
    //Métodos Get e Set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public long getTelefone() {
        return telefone;
    }
    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", cidade=" + cidade + ", estado=" + estado + ", bairro="
                + bairro + ", telefone=" + telefone + ", email=" + email + "]";
    }

    
}
