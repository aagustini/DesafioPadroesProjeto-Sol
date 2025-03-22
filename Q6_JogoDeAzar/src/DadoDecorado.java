import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DadoDecorado implements IDado {
    private IDado dado;

    private List<Integer> historico = new ArrayList<Integer>();

    public DadoDecorado(IDado dado) {
        this.dado = dado;
    }

    public void rolar() {
        dado.rolar();
        historico.add(dado.getValor());
    }

    public int getValor() {
        return dado.getValor();
    }

    public List<Integer> getHistorico() {
        return Collections.unmodifiableList(historico);
    }   
    
}
