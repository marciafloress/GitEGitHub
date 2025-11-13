public class Main{
    public static void main(String[] args) {
        
        PessoaFisica pf = new PessoaFisica("Cristiano", 25, "São Paulo", "SP", "Bairro", 1258963258, "email", 1258963258, 1258963258, "Maria");
        Produto p = new Produto();
        Venda v = new Venda();
        Estoque e = new Estoque();

        p.setQuantidade(8);
        p.setValorUnitario(10);
        v.setDateVenda("07/05/2028");
        v.setNumeroNotaFiscal(2456735);
        v.setValorTotal(4.0);
        e.setQuantidadeEmEstoque(28);

        System.out.println("****** Venda ******");

        System.out.println("\nO cpf do cliente é: " + pf.getCpf());
        System.out.println("O nome do cliente é: " + pf.getNome());
        System.out.println("A quantidade de produto vendida é: " + p.getQuantidade());
        System.out.println("O valor unitario do produto é: " + p.getValorUnitario());
        System.out.println("O valor da compra parcial é: " + p.valorCompraItem());
        System.out.println("A data da Venda é: " + v.getDataVenda());
        System.out.println("O número da nota fiscal é: " + v.getNumeroNotaFiscal());
        System.out.println("O valor da venda é: " + v.getValorTotal());
        System.out.println("A quantidade disponível em estoque é: " + e.getQuantidadeEmEstoque());
        System.out.println("A quantidade disponível em estoque após a venda é: " + (e.getQuantidadeEmEstoque() - p.getQuantidade()));

    }
}

