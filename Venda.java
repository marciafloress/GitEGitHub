public class Venda {
    
    //Declaração de Variaveis encapsuladas, privadas dentro da classe.
    private long numeroNotaFiscal;
    private String dataVenda;
    private Double itensVenda;
    private Double valorTotal;
    
    //Construtor para a classe produto.
    Produto p = new Produto();
    
    //Métodos Get e Set
    public long getNumeroNotaFiscal() {
        return numeroNotaFiscal;
    }
    public void setNumeroNotaFiscal(long numeroNotaFiscal) {
        this.numeroNotaFiscal = numeroNotaFiscal;
    }
    public String getDataVenda() {
        return dataVenda;
    }
    public void setDateVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }
    public Double getItensVenda() {
        return itensVenda;
    }
    public void setItensVenda(Double itensVenda) {
        this.itensVenda = itensVenda;
    }
    public Double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public Double CalcularValorTotal(){
        valorTotal = itensVenda * p.valorCompraItem();
        return valorTotal;
    }
    @Override
    public String toString() {
        return "Venda [numeroNotaFiscal=" + numeroNotaFiscal + ", dataVenda=" + dataVenda + ", itensVenda=" + itensVenda
                + ", valorTotal=" + valorTotal + ", p=" + p + "]";
    }
    
}
