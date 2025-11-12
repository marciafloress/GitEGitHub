public class PessoaJuridica extends Pessoa {
    
    //Veriáveis protegidas devido a herança
    protected long cnpj;
    protected long inscricaoEstadual;
    protected String nomeFantasia;
    protected long razaoSocial;

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

    
}
