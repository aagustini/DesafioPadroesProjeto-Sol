import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FonteDeDados{
    private List<Integer> lst;
    private List<IVisualizador> visualizadores = new ArrayList<>();

    public FonteDeDados(){
        lst = new LinkedList<>();
        visualizadores = new ArrayList<>();
    }

    public void add(Integer value){
        if (value < 0) throw new IllegalArgumentException("Valor invalido");
        lst.add(value);
        this.notifica();
    }

    public void addVisualizador(IVisualizador visualizador){
        visualizadores.add(visualizador);
    }

    public void removeVisualizador(IVisualizador visualizador){
        visualizadores.remove(visualizador);
    }

    private void notifica(){
        for (IVisualizador visualizador : visualizadores){
            visualizador.notifica(lst);
        }
    }

    public int quantidade(){
        return lst.size();
    }

    public List<Integer> getValores(){
        return new ArrayList<>(lst);
    }
}