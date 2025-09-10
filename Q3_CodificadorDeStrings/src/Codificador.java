
public class Codificador{

    private ICodificador codificador;

    public Codificador(ICodificador codificador){
        this.codificador = codificador;
    }   

   
    public String codifica(String str){
        return codificador.codifica(str);
    }

    public String deCodifica(String str){
        return codificador.deCodifica(str);
    }
}