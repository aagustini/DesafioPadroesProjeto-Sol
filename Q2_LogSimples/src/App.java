public class App {
    public static void main(String[] args) throws Exception {
        LogSimples log = LogSimples.getInstance();
        log.log("Mensagem de alerta 1");
        log.log("Mensagem de alarme 23");
        log.log("Mensagem de PANICO!!");

        LogSimples log2 = LogSimples.getInstance();
        log.log("Mensagem 1 no log 2");
        log.log("Mensagem 2 no log 2");

        for(String m:log){
            System.out.println(m);
        }
    }
}
