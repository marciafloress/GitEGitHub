public class Fornecedor extends PessoaJuridica {
    
    //Declaração de Variaveis encapsuladas, privadas.
    private String responsavel;
    public Fornecedor(String nome, int idade, String cidade, String estado, String bairro, long telefone, String email,
                long cnpj, long inscricaoEstadual, String nomeFantasia, long razaoSocial, String responsavel) {
            super(nome, idade, cidade, estado, bairro, telefone, email, cnpj, inscricaoEstadual, nomeFantasia, razaoSocial);
            this.responsavel = responsavel;
    }
    

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }


    @Override
    public String toString() {
        return "Fornecedor [cnpj=" + cnpj + ", responsavel=" + responsavel + ", inscricaoEstadual=" + inscricaoEstadual
                + ", nomeFantasia=" + nomeFantasia + ", razaoSocial=" + razaoSocial + "]";
    }

    
    

    

    
}
