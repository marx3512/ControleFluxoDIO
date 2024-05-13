import java.util.Scanner;

public class ControleDeFluxo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o primeiro parametro: ");
        int parametroUm = Integer.parseInt(input.nextLine());
        System.out.println("Digite o segundo parametro: ");
        int parametroDois = Integer.parseInt(input.nextLine());

        input.close();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        else{
            int contador = parametroDois - parametroUm;
            for(int i = 1; i <= contador; i ++){
                System.out.println("Imprimindo o numero " + i);
            }
        }
    }
}
