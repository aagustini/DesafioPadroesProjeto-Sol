public class ProdutosFactory {
    public static IProduto createProduto(int id, String nome, double preco) {
        return new Produto(id, nome, preco);
    }

    public static IProduto createProduto(int id, String nome, int[] idProdutos) {
        VendasEmMemoria vendas = VendasEmMemoria.getInstance();
        ProdutoComposite produto = new ProdutoComposite(id, nome);
        for (int p : idProdutos) {
            IProduto prod = vendas.buscarProduto(p);
            if ( prod != null )
                produto.addProduto(prod);
        }
        return produto;
    }
}
