public class Venda {

    //Variáveis encapsuladas, privadas dentro da classe
    private long numeroNotaFiscal;
    private String dataVenda;
    private float itensVenda;
    private float valorTotal;

    //Construtor para a classe produto
    Produto p = new Produto();

    //Método Get e Set
    public long getNumeroNotaFiscal() {
        return numeroNotaFiscal;
    }
    public void setNumeroNotaFiscal(long numeroNotaFiscal) {
        this.numeroNotaFiscal = numeroNotaFiscal;
    }
    public String getDataVenda() {
        return dataVenda;
    }
    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }
    public float getItensVenda() {
        return itensVenda;
    }
    public void setItensVenda(float itensVenda) {
        this.itensVenda = itensVenda;
    }
    public float getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public valorVendaTotalItem(){    
        for(int i = 0; i <= p.valorCompraItem(); i++){
        return (p.valorCompraItem()+i);
    }
    
    }
}
    

