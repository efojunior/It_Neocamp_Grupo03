import Area.CalcularArea;
import Datas.CalculadoraDatas;
import Moeda.ConversorDeMoeda;
import OperacoesBasicas.OperacaoBasica;
import OutrasOperacoes.OutrasOperacoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteCalculadora {
public static void main(String[] args) throws ParseException {
        float num1, num2, resultado=0;

        ArrayList<Integer> opcao = new ArrayList<>();
        Scanner ler = new Scanner(System.in);
        System.out.println("\n**   Bem vindo!!   **\n\n**   A calculadora! :D  **\n\n");
        do{
                try{
                    //Verificacao se o array esta limpo

                    if(opcao.size() == 0){
                        System.out.println("Digite um número de 1, 2, 3, 4, 5 ou 6, sendo:\n\n1 - Operações básicas\n2 - Outras operações\n3 - Conversor Moeda\n4 - Áreas\n5 - Datas\n6 - Sair");
                        opcao.add(0, ler.nextInt());
                    }
                    else{
                        System.out.println("Digite um número de 1, 2, 3, 4, 5 ou 6, sendo:\n\n1 - Operações básicas\n2 - Outras operações\n3 - Conversor Moeda\n4 - Áreas\n5 - Datas\n6 - Sair");//to do escrever
                        opcao.set(0, ler.nextInt());
                    }

                    //Verificacao se vai para Operacoes basicas

                    if(opcao.get(0) == 1){
                        System.out.println("Digite um numero para as operações matemáticas:" +
                                "\n1 - Soma" +
                                "\n2 - Subtração" +
                                "\n3 - Multiplicação" +
                                "\n4 - Divisão");
                        opcao.add(1, ler.nextInt());
                        switch (opcao.get(1)) {
                            case 1 -> {
                                System.out.println("Digite um 1o numero:");
                                num1 = ler.nextFloat();
                                System.out.println("Digite um 2o numero:");
                                num2 = ler.nextFloat();
                                OperacaoBasica opBas = new OperacaoBasica(num1, num2);
                                resultado = opBas.Soma();
                                System.out.println("Número " + num1 + " + " + num2 + " = " + resultado + "\n");
                            }
                            case 2 -> {
                                System.out.println("Digite um 1o numero:");
                                num1 = ler.nextFloat();
                                System.out.println("Digite um 2o numero:");
                                num2 = ler.nextFloat();
                                OperacaoBasica OpBas = new OperacaoBasica(num1, num2);
                                resultado = OpBas.Diminuir();
                                System.out.println("Número " + num1 + " - " + num2 + " = " + resultado + "\n");
                            }
                            case 3 -> {
                                System.out.println("Digite um 1o numero:");
                                num1 = ler.nextFloat();
                                System.out.println("Digite um 2o numero:");
                                num2 = ler.nextFloat();
                                OperacaoBasica OpBas1 = new OperacaoBasica(num1, num2);
                                resultado = OpBas1.Multiplicar();
                                System.out.println("Número " + num1 + " x " + num2 + " = " + resultado + "\n");
                            }
                            case 4 -> {
                                System.out.println("Digite um 1o numero:");
                                num1 = ler.nextFloat();
                                System.out.println("Digite um 2o numero:");
                                num2 = ler.nextFloat();
                                OperacaoBasica OpBas2 = new OperacaoBasica(num1, num2);
                                resultado = OpBas2.Dividir();
                                System.out.println("Número " + num1 + " / " + num2 + " = " + resultado + "\n");
                            }
                            default -> System.out.println("Operação inválida!");
                        }
                        System.out.println("Você deseja continuar?\n1 - Voltar para o menu inicial\n6 - Sair");
                        opcao.set(0, ler.nextInt());
                    }

                    //Verificacao Outras operacoes

                    else if(opcao.get(0) == 2){
                        System.out.println("Digite um numero para as outras operações:" +
                                "\n1 - Exponenciação " +
                                "\n2 - Raiz quadrada" +
                                "\n3 - Porcenatagem");
                        opcao.add(1, ler.nextInt());
                        switch (opcao.get(1)){
                            case 1 -> {
                                double res;
                                System.out.println("Digite a base:");
                                num1 = ler.nextFloat();
                                System.out.println("Digite o expoente:");
                                num2 = ler.nextFloat();
                                OutrasOperacoes OO = new OutrasOperacoes(0, 0, num1, num2);
                                res = OO.exponenciacao();
                                System.out.println("Exponenciação: " + res + "\n");
                            }
                            case 2 -> {
                                double res;
                                System.out.println("Digite um 1 numero para a raiz:");
                                num1 = ler.nextFloat();
                                OutrasOperacoes OO1 = new OutrasOperacoes(0, 0, num1, 0);
                                res = OO1.raiz();
                                System.out.println("Raiz quadrada: " + res + "\n");
                            }
                            case 3 -> {
                                double res;
                                System.out.println("Digite o valor:");
                                num1 = ler.nextFloat();
                                System.out.println("Digite a porcentagem:");
                                num2 = ler.nextFloat();
                                OutrasOperacoes OO2 = new OutrasOperacoes(num1, num2, 0, 0);
                                res = OO2.porcentagem();
                                System.out.printf("Porcentagem: %.2f\n",res);
                            }
                            default -> System.out.println("Operação inválida!");
                        }
                        System.out.println("Você deseja continuar?\n1 - Voltar para o menu inicial\n6 - Sair");
                        opcao.set(0, ler.nextInt());
                    }

                    //Verificacao conversor de moedas

                    else if (opcao.get(0) == 3){
                        System.out.println("Digite um numero para a Conversor Moeda:" +
                                "\n1 - Conversor de Real para Dolar "+
                                "\n2 - Conversor de Dolar para Real"+
                                "\n3 - Conversor de Reais para Euro" +
                                "\n4 - Conversor de Euro para Real");
                        opcao.add(1, ler.nextInt());
                        switch(opcao.get(1)){
                            case 1 -> {
                                double res;
                                System.out.println("Digite quantidade de Reais:");
                                num1 = ler.nextFloat();
                                ConversorDeMoeda moeda = new ConversorDeMoeda(num1);
                                res = moeda.ConverterReaisDolar();
                                System.out.printf("Dólar: %.2f\n" ,res);
                            }
                            case 2 -> {
                                double res;
                                System.out.println("Digite a quantidade de Dólares:");
                                num1 = ler.nextFloat();
                                ConversorDeMoeda moeda = new ConversorDeMoeda(num1);
                                res = moeda.ConverterDolar();
                                System.out.printf("Reais: %.2f\n" ,res);
                            }
                            case 3 -> {
                                double res;
                                System.out.println("Digite quantidade de Reais:");
                                num1 = ler.nextFloat();
                                ConversorDeMoeda moeda = new ConversorDeMoeda(num1);
                                res = moeda.ConverterReaisEuro();
                                System.out.printf("Euro: %.2f\n" ,res);
                            }
                            case 4 -> {
                                double res;
                                System.out.println("Digite um 1o numero:");
                                num1 = ler.nextFloat();
                                ConversorDeMoeda moeda = new ConversorDeMoeda(num1);
                                res = moeda.ConverterEuro();
                                System.out.printf("Reais: %.2f\n" ,res);
                            }
                            default -> System.out.println("Operação inválida!");
                        }
                        System.out.println("Você deseja continuar?\n1 - Voltar para o menu inicial\n6 - Sair");
                        opcao.set(0, ler.nextInt());
                    }

                    //Vericacao de areas

                    else if(opcao.get(0) == 4){
                        System.out.println("Digite um numero para as áreas das formas geométricas:" +
                                "\n1 - Área do retângulo" +
                                "\n2 - Área do triângulo" +
                                "\n3 - Área do círculo");
                        opcao.add(1, ler.nextInt());
                        switch (opcao.get(1)) {
                            case 1 -> {
                                System.out.println("Digite a base:");
                                num1 = ler.nextFloat();
                                System.out.println("Digite a altura:");
                                num2 = ler.nextFloat();
                                CalcularArea area = new CalcularArea(num1, num2);
                                resultado = area.AreaRetangulo();
                                System.out.println("Área do retângulo: " + resultado + "\n");
                            }
                            case 2 -> {
                                System.out.println("Digite a base:");
                                num1 = ler.nextFloat();
                                System.out.println("Digite a altura:");
                                num2 = ler.nextFloat();
                                CalcularArea area1 = new CalcularArea(num1, num2);
                                resultado = area1.AreaTriangulo();
                                System.out.println("Área do triângulo: " + resultado + "\n");
                            }
                            case 3 -> {
                                System.out.println("Digite o raio:");
                                num1 = ler.nextFloat();
                                CalcularArea area2 = new CalcularArea(num1, 0);
                                resultado = area2.AreaCirculo();
                                System.out.println("Área do círculo: " + resultado + "\n");
                            }
                            default -> System.out.println("Operação inválida!");
                        }
                        System.out.println("Você deseja continuar?\n1 - Voltar para o menu inicial\n6 - Sair");
                        opcao.set(0, ler.nextInt());
                    }
                    else if(opcao.get(0) == 5){
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                        System.out.println("Digite a data inicial:");
                        String data1 = ler.next();
                        Date dataBase = sdf.parse(data1);
                        System.out.println("Digite a data final:");
                        String data2 = ler.next();
                        Date vencimento = sdf.parse(data2);
                        CalculadoraDatas calcDatas = new CalculadoraDatas(dataBase, vencimento);
                        System.out.println("Diferenças para as datas inseridas:" +
                                "\nDiferença em milissegundos: " + calcDatas.diferencaMS() +
                                "\nDiferença em segundos: " + calcDatas.diferencaSegundos() +
                                "\nDiferença em minutos: " + calcDatas.diferencaMinutos() +
                                "\nDiferença em horas: " + calcDatas.diferencaHoras() +
                                "\nDiferença em dias: " + calcDatas.diferencaDias());
                        System.out.println("Você deseja continuar?\n1 - Voltar para o menu inicial\n6 - Sair");
                        opcao.set(0, ler.nextInt());
                    }
                    else if (opcao.get(0) > 6) System.out.println("Digite outro número!\nNúmero inválido");
                }
                catch(InputMismatchException e){
                    System.out.println("Digite um valor inteiro correspondente ao menu , para o acesso!!\n\nErro:"+e);
                }
            }while(opcao.get(0) != 6);

        System.out.println("\n**   Muito Obrigado por usar nosso programa!   **\n\n**   Até breve!   **");
    }
}
