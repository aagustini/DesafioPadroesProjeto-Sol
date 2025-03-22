public class CodificadorDeslocamento implements ICodificador {
    private int deslocamento;
    
    public CodificadorDeslocamento(int deslocamento){
        this.deslocamento = deslocamento;
    }
    
    public String codifica(String str){
        char[] aux = str.toCharArray();
        char[] resp = new char[str.length()];
        for(int i=0;i<aux.length;i++){
            resp[i] = (char)(Character.valueOf(aux[i])+deslocamento);
        }
        return(new String(resp));
    }
    
    public String deCodifica(String str){
        char[] aux = str.toCharArray();
        char[] resp = new char[str.length()];
        for(int i=0;i<aux.length;i++){
            resp[i] = (char)(Character.valueOf(aux[i])-deslocamento);
        }
        return(new String(resp));
    }
}
