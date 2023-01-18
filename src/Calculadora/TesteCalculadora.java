import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args) {
        int opcao1=0, opcao2, num, a, b;
        float num1, num2, resultado=0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Bem vindo a nossa calculadora!!\n");
        do{
            System.out.println("Digite um número de 1 ou 2, sendo:\n1 - Operações básicas\n2 - Sair\n");//to do escrever
            opcao1 = ler.nextInt();
            if(opcao1 == 1){
                System.out.println("Digite um numero para as operações matemáticas:" +
                        "\n1 - soma" +
                        "\n2 - subtração" +
                        "\n3 - multiplicação" +
                        "\n4 - Divisão");
                opcao2 = ler.nextInt();
                switch (opcao2){
                    case 1:
                        System.out.println("Digite um 1o numero:");
                        num1 = ler.nextFloat();
                        System.out.println("Digite um 2o numero:");
                        num2 = ler.nextFloat();
//                        OperacaoBasica opBas = new OpercaoBasica(num1, num2);
//                        resultado = opBas.Soma(num1, num2);
                        System.out.println("Número "+num1+" + "+num2+" = "+resultado);
                        break;
                    case 2:
                        System.out.println("Digite um 1o numero:");
                        num1 = ler.nextFloat();
                        System.out.println("Digite um 2o numero:");
                        num2 = ler.nextFloat();
//                        operacaoBasica OpBas = new opercaoBasica(num1, num2);
//                        resultado = OpBas.Diminuir(num1, num2);
                        System.out.println("Número "+num1+" - "+num2+" = "+resultado);
                        break;
                    case 3:
                        System.out.println("Digite um 1o numero:");
                        num1 = ler.nextFloat();
                        System.out.println("Digite um 2o numero:");
                        num2 = ler.nextFloat();
//                        operacaoBasica OpBas = new opercaoBasica(num1, num2);
//                        resultado = OpBas.Multiplicar(num1, num2);
                        System.out.println("Número "+num1+" x "+num2+" = "+resultado);
                        break;
                    case 4:
                        System.out.println("Digite um 1o numero:");
                        num1 = ler.nextFloat();
                        System.out.println("Digite um 2o numero:");
                        num2 = ler.nextFloat();
//                        operacaoBasica OpBas = new opercaoBasica(dim1, dim2);
//                        resultado = OpBas.Dividir(num1, num2);
                        System.out.println("Número "+num1+" / "+num2+" = "+resultado);
                        break;
                    default:
                        System.out.println("Operação inválida!");
                }
            System.out.println("Você deseja continuar?\n1 - Voltar para o menu inicial\n2 - Sair");
            opcao1 = ler.nextInt();
            }
            else if (opcao1 != 2)System.out.println("Digite outro numero!");
            else {
                System.out.println("Calculadora foi finalizada com sucesso, obrigada!");
            }
        }while(opcao1 != 2);
    }
}
