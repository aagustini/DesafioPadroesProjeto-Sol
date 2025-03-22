import java.util.List;

public class VisualizadorExtremos implements IVisualizador{
    private List<Integer> valores;

    public VisualizadorExtremos(List<Integer> valores){
        this.valores = valores;
    }

    public void defineValores(List<Integer> valores){
        this.valores = valores;
    }

    public void acrescentaValor(Integer valor){
        this.valores.add(valor);
    }

    public void exibeExtremos(){
        int menor = valores.stream()
            .mapToInt(Integer::intValue)
            .min()
            .getAsInt();
        int maior = valores.stream()
            .mapToInt(Integer::intValue)
            .max()
            .getAsInt();
        System.out.println("Menor: "+menor+", Maior: "+maior+", quantidade de elementos analisados: "+valores.size());
    }

    @Override
    public void notifica(List<Integer> valores) {
        this.defineValores(valores);
        this.exibeExtremos();
    }
}
               