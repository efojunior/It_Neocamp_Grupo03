import java.util.ArrayList;
import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args) {
        float num1, num2, resultado=0;

        ArrayList<Integer> opcao = new ArrayList<>();
        Scanner ler = new Scanner(System.in);
        System.out.println("Bem vindo a nossa calculadora!!\n");
        do{

            if(opcao.size() == 0){
                System.out.println("Digite um número de 1, 2 ou 3, sendo:\n1 - Operações básicas\n2 - Sair\n");//to do escrever
                opcao.add(0, ler.nextInt());
            }
            else{
                System.out.println("Digite um número de 1, 2, ou 3, sendo:\n1 - Operações básicas\n2 - Áreas \n");//to do escrever
                opcao.set(0, ler.nextInt());
            }

            if(opcao.get(0) == 1){
                System.out.println("Digite um numero para as operações matemáticas:" +
                        "\n1 - Soma" +
                        "\n2 - Subtração" +
                        "\n3 - Multiplicação" +
                        "\n4 - Divisão");
                opcao.add(1, ler.nextInt());
                switch(opcao.get(1)){
                    case 1:
                        System.out.println("Digite um 1o numero:");
                        num1 = ler.nextFloat();
                        System.out.println("Digite um 2o numero:");
                        num2 = ler.nextFloat();
                        OperacaoBasica opBas = new OperacaoBasica(num1, num2);
                        resultado = opBas.Soma();
                        System.out.println("Número "+num1+" + "+num2+" = "+resultado);
                        break;
                    case 2:
                        System.out.println("Digite um 1o numero:");
                        num1 = ler.nextFloat();
                        System.out.println("Digite um 2o numero:");
                        num2 = ler.nextFloat();
                        OperacaoBasica OpBas = new OperacaoBasica(num1, num2);
                        resultado = OpBas.Diminuir();
                        System.out.println("Número "+num1+" - "+num2+" = "+resultado);
                        break;
                    case 3:
                        System.out.println("Digite um 1o numero:");
                        num1 = ler.nextFloat();
                        System.out.println("Digite um 2o numero:");
                        num2 = ler.nextFloat();
                        OperacaoBasica OpBas1 = new OperacaoBasica(num1, num2);
                        resultado = OpBas1.Multiplicar();
                        System.out.println("Número "+num1+" x "+num2+" = "+resultado);
                        break;
                    case 4:
                        System.out.println("Digite um 1o numero:");
                        num1 = ler.nextFloat();
                        System.out.println("Digite um 2o numero:");
                        num2 = ler.nextFloat();
                        OperacaoBasica OpBas2 = new OperacaoBasica(num1, num2);
                        resultado = OpBas2.Dividir();
                        System.out.println("Número "+num1+" / "+num2+" = "+resultado);
                        break;
                    default:
                        System.out.println("Operação inválida!");
                }
            System.out.println("Você deseja continuar?\n1 - Voltar para o menu inicial\n2 - Sair");
            opcao.set(0, ler.nextInt());
            }

            else if (opcao.get(0) > 2)System.out.println("Digite outro numero!");
        }while(opcao.get(0) != 2);
        System.out.println("\n**   Muito Obrigado por usar nosso programa!   **\n\n**   Até breve!   **");
    }
}
