public class App {
    public static void main(String[] args) throws Exception {
        String email = "bernardo.copstein@pucrs.br";
        var validador = new Validador();

        System.out.println();
        if (validador.valida(Validador.Tipo.EMAIL, email)){
            System.out.println(email+" é um email válido!");
        }else{
            System.out.println(email+" não é um email válido!");
        }

        String numero = "202310034-4";
        if (validador.valida(Validador.Tipo.INTEIRO, numero)){
            System.out.println(numero+" é um número inteiro válido!");
        }else{
            System.out.println(numero+" não é um numero inteiro válido!");
        }

        if (validador.valida(Validador.Tipo.MATRICULA, numero)){
            System.out.println(numero+" é uma matrícula válida!");
        }else{
            System.out.println(numero+" não é uma matrícula válida!");
        }


    }
}
