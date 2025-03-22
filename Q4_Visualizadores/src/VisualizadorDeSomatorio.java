import java.util.List;

public class VisualizadorDeSomatorio implements IVisualizador{
    private List<Integer> valores;

    public VisualizadorDeSomatorio(List<Integer> valores){
        this.valores = valores;
    }

    public void defineValores(List<Integer> valores){
        this.valores = valores;
    }

    public void acrescentaValor(Integer valor){
        this.valores.add(valor);
    }

    public void exibeSomatorio(){
        Integer soma = valores.stream()
            .mapToInt(Integer::intValue)
            .sum();
        System.out.println("Somatorio: "+soma+", quantidade de elementos analisados: "+valores.size());
    }

    @Override
    public void notifica(List<Integer> valores) {
        this.defineValores(valores);
        this.exibeSomatorio();
    }
}
