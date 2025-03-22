import java.util.ArrayList;
import java.util.List;

public  class ProdutoComposite implements IProduto {
    private int id;
    private String nome;
    private double preco;
    private List<IProduto> produtos = new ArrayList<IProduto>();

    public ProdutoComposite(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.preco = 0.0;
    }

    public void addProduto(IProduto produto) {
        produtos.add(produto);
    }

    public void removeProduto(IProduto produto) {
        produtos.remove(produto);
    }

    public List<IProduto> getProdutos() {
        return produtos;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        double total = preco;
        for (IProduto produto : produtos) {
            total += produto.getPreco();
        }
        double desconto = total * 0.1;
        return total-desconto;
    }

    public String toString() {
        return "ProdutoComposite [id=" + id + ", nome=" + nome + ", preco=" + preco + ", produtos=" + produtos + "]";
    }
    
}
