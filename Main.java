public class Main{
    public static void main(String[] args) {

        PessoaFisica pf =  new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica();
        Produto p = new Produto();
        Venda v = new Venda();

        System.out.println("********** Venda *********");
        System.out.println("O Cpf do cliente é: " + pf.getCpf());
        System.out.println("O nome do cliente é: " + pf.getNome());
        System.out.println("A quantidade de produto vendidan é: " + p.getQuantidade());
        System.out.println("O valor unitário do produto é: " +p.getValorUnitario());
        System.out.println("O valor da compra parcial é: " + p.valorCompraItem());
        System.out.println("A Data da Venda é: " + v.getDataVenda());
        System.out.println("O número da nota fiscal é: " + v.getNumeroNotaFiscal());
        System.out.println("O valor da venda é: "+v.getValorTotal());
        
    }

}