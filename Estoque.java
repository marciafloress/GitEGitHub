public class Estoque {
    private String localizacao;
    private int quantidadeEmEstoque;
    private String categoria;

    // Produto p = new Produto();

    public String getLocalizacao() {
        return localizacao;
    }

    public void setlocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    // método para subtração da quantidade em estoque
    // public int valorTotalEmEstoque(){
    //     quantidadeEmEstoque = getQuantidadeEmEstoque() - p.getQuantidade();
    //     return quantidadeEmEstoque;
    // }
}





