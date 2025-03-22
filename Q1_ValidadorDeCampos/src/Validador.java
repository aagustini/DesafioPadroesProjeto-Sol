public class Validador{
    public enum Tipo { EMAIL, INTEIRO, MATRICULA }

    public boolean valida(Tipo tipo,String valor){
        switch(tipo){
            case INTEIRO:
                return new ValidadorInt().valida(valor);     
            case MATRICULA:
                return new ValidadorMatricula().valida(valor);
            case EMAIL:
                 return new ValidadorEMail().valida(valor);
            default:
                return false;
        }
    }
}