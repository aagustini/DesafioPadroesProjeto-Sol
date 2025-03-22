import java.util.List;

public class App {
    public static void main(String[] args){
        VendasFachada proc = VendasEmMemoria.getInstance();
        List<IProduto> produtos = proc.buscarProdutos();
        Venda venda = proc.iniciarVenda();
        proc.registrarVenda(venda, 1, 1);
        proc.registrarVenda(venda, 2, 2);
        proc.registrarVenda(venda, 3, 2);
        System.out.println(proc.emitirComprovante(venda));
        System.out.println();

        venda = proc.iniciarVenda();
        proc.registrarVenda(venda, 4, 1);
        proc.registrarVenda(venda, 4, 1);
        System.out.println(proc.emitirComprovante(venda));
        System.out.println();
        venda = proc.iniciarVenda();
        proc.registrarVenda(venda, 5, 1);
        System.out.println(proc.emitirComprovante(venda));
        System.out.println();
    }
}
