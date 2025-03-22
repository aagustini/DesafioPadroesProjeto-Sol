import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VendasEmMemoria implements VendasFachada{
	private static VendasEmMemoria instance;

	public static VendasEmMemoria getInstance() {
		if (instance == null) {
			instance = new VendasEmMemoria();
			instance.seed();
		}
		return instance;
	}

	private List<IProduto> produtos;
	
	private VendasEmMemoria() {
		produtos = new ArrayList<>();
	}


	
	@Override
	public Venda iniciarVenda() {
		return new Venda(LocalDateTime.now());
	}

	@Override
	public void registrarVenda(Venda umaVenda, int codigoProduto, int quantidade) {
		IProduto prod = produtos.stream().filter(p -> p.getId() == codigoProduto).findFirst().orElse(null);
		if (prod !=null)
			umaVenda.registrarVenda(prod, quantidade);
	}

	@Override
	public String emitirComprovante(Venda umaVenda) {
		return umaVenda.emitirComprovante();
	}

	@Override
	public List<IProduto> buscarProdutos() {
		return Collections.unmodifiableList(produtos);
	}

	public IProduto buscarProduto(int id) {
		return produtos.stream().filter(p -> p.getId() == id).findFirst().get();
	}

	public void seed() {
		produtos.add(ProdutosFactory.createProduto(1, "Caneta", 1.55));
		produtos.add(ProdutosFactory.createProduto(2, "Borracha", 1.15));
		produtos.add(ProdutosFactory.createProduto(3, "Caderno", 32.99));
		produtos.add(ProdutosFactory.createProduto(4, "Kit", new int[] {1,2,3}));
		produtos.add(ProdutosFactory.createProduto(5, "Kit2", new int[] {4,4}));
	}

}
