public class App {
    public static void main(String[] args) {
        IDado d6 = new DadoDecorado(new Dado(6));
        IDado d20 = new DadoDecorado(new Dado(20));

        System.out.print("\nD6:  ");
        for(int i=0;i<30;i++){ 
            d6.rolar();
            System.out.printf("%2d ",d6.getValor());
        }
        System.out.print("\nD20: ");
        for(int i=0;i<30;i++){ 
            d20.rolar();
            System.out.printf("%2d ",d20.getValor());
        }
        System.out.println("\n\nHistoricos: ");
        System.out.println("D6:  " + ((DadoDecorado)d6).getHistorico());
        System.out.println("D20: " + ((DadoDecorado)d20).getHistorico());
       
    }
}
