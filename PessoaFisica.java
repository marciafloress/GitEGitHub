public class PessoaFisica extends Pessoa {

    //Veriáveis protegidas devido a herança
    protected long cpf;
    protected long rg;
    protected String nomeMae;

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
