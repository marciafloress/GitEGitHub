public class PessoaJuridica extends Pessoa{
    
    //Declaração de Variaveis encapsuladas, protegidas.
    protected long cnpj;
    protected long inscricaoEstadual;
    protected String nomeFantasia;
    protected long razaoSocial;

    public PessoaJuridica(String nome, int idade, String cidade, String estado, String bairro, long telefone,
                String email, long cnpj, long inscricaoEstadual, String nomeFantasia, long razaoSocial) {
            super(nome, idade, cidade, estado, bairro, telefone, email);
            this.cnpj = cnpj;
            this.inscricaoEstadual = inscricaoEstadual;
            this.nomeFantasia = nomeFantasia;
            this.razaoSocial = razaoSocial;
            
    }

    //Métodos Get e Set
    public long getCnpj() {
        return cnpj;
    }
    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }
    public long getInscricaoEstadual() {
        return inscricaoEstadual;
    }
    public void setInscricaoEstadual(long inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    public String getNomeFantasia() {
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    public long getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(long razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String toString() {
        return "PessoaJuridica [cnpj=" + cnpj + ", inscricaoEstadual=" + inscricaoEstadual + ", nomeFantasia="
                + nomeFantasia + ", razaoSocial=" + razaoSocial + ", getNome()=" + getNome() + ", getCnpj()="
                + getCnpj() + ", getCidade()=" + getCidade() + ", getEstado()=" + getEstado() + ", getNomeFantasia()="
                + getNomeFantasia() + ", getBairro()=" + getBairro() + ", getRazaoSocial()=" + getRazaoSocial()
                + ", getTelefone()=" + getTelefone() + ", getEmail()=" + getEmail() + "]";
    }
    
}
