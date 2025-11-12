public class Produto {

    //Declaração das variáveis encapsuladas, privadas.
    private long codigoBarras;
    private String nomeProduto;
    private String marcaProduto;
    private int quantidade;
    private float valorUnitario;

    //Métodos Get e Set
    public long getCodigoBarras() {
        return codigoBarras;
    }
    public void setCodigoBarras(long codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public String getMarcaProduto() {
        return marcaProduto;
    }
    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public float getValorUnitario() {
        return valorUnitario;
    }
    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public float valorCompraItem(){
        return (getValorUnitario() * getQuantidade());
    }   
    
}
