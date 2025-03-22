import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var dados = new FonteDeDados();
        var cm = new VisualizadorDeMedia(dados.getValores());
        var cs = new VisualizadorDeSomatorio(dados.getValores());
        var ce = new VisualizadorExtremos(dados.getValores());
        boolean ligadoCe = false;
        boolean ligadoCs = false;
        boolean ligadoCm = false;

        Scanner s = new Scanner(System.in);
        int valor = 0;
        while(true){
            System.out.println("\nEntre um valor positivo maior que zero (0=fim):");
            valor = Integer.parseInt(s.nextLine());
            if (valor == 0){
                break;
            } else if (valor == -1) {
                if (ligadoCe) {
                    dados.removeVisualizador(ce);
                } else {
                    dados.addVisualizador(ce);
                }
                ligadoCe = !ligadoCe;
            } else if (valor == -2) {
                if (ligadoCs) {
                    dados.removeVisualizador(cs);

                } else {
                    dados.addVisualizador(cs);
                }
                ligadoCs = !ligadoCs;
                
            } else if (valor == -3) {
                if (ligadoCm) {
                    dados.removeVisualizador(cm);
                } else {
                    dados.addVisualizador(cm);
                }
                ligadoCm = !ligadoCm;
            } else {
                dados.add(valor);
            }
        }
        System.out.println("Fim");
    }
}
