public class Main{
    public static void main(String[] args) {
        
        
        Produto p = new Produto();
        Venda v = new Venda();

        System.out.println("****** Venda ******");
        
        System.out.println("A quantidade de produto vendida é: " + p.getQuantidade());
        System.out.println("O valor unitario do produto é: " + p.getValorUnitario());
        System.out.println("O valor da compra parcial é: " + p.valorCompraItem());
        System.out.println("A data da Venda é: " + v.getDataVenda());
        System.out.println("O número da nota fiscal é: " + v.getNumeroNotaFiscal());
        System.out.println("O valor da venda é: " + v.getValorTotal());


    }
}
