public class App {
    public static void main(String[] args) throws Exception {

        String aux = "Desafio Padrões de Projeto";

        System.out.println("\nTexto: "+aux);
        System.out.println("\nCodificador Simples");
        Codificador simples = new Codificador(new CodificadorSimples());
        aux = simples.codifica( aux);
        System.out.println(aux);
        aux = simples.deCodifica(aux);
        System.out.println(aux);

        System.out.println("\nCodificador Deslocamento (1)");
        Codificador desloca = new Codificador(new CodificadorDeslocamento(1));
        aux = desloca.codifica( aux);
        System.out.println(aux);
        aux = desloca.deCodifica(aux);
        System.out.println(aux);
    }
}
