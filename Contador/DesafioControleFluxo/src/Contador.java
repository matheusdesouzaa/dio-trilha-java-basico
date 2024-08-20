import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parametro");
        int parametroDois = scanner.nextInt();
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O parametro um deve ser menor que o parametro dois");
        }
    }

    static void contar(int parametroUm,int parametroDois) throws ParametrosInvalidosException{
            if(parametroDois < parametroUm){
                throw new ParametrosInvalidosException();
            }
            int contagem = parametroDois - parametroUm;
            for(int x = 1;x<=contagem;x++){
                System.out.println(x);
            }
    }
}

