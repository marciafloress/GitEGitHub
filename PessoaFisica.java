public class PessoaFisica extends Pessoa{
    
    //Declaração de Variaveis encapsuladas, protegidas.
    protected long cpf;
    protected long rg;
    protected String nomeMae;

    public PessoaFisica(String nome, int idade, String cidade, String estado, String bairro, long telefone,
                String email, long cpf, long rg, String nomeMae) {
            super(nome, idade, cidade, estado, bairro, telefone, email);
            this.cpf = cpf;
            this.rg = rg;
            this.nomeMae = nomeMae;
    }
       
    
    //Métodos Get e Set
    public long getCpf() {
        return cpf;
    }
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    public long getRg() {
        return rg;
    }
    public void setRg(long rg) {
        this.rg = rg;
    }
    public String getNomeMae() {
        return nomeMae;
    }
    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    
}
