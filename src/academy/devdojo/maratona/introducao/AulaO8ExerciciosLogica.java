package academy.devdojo.maratona.introducao;
import java.util.Scanner;

public class AulaO8ArraysMultidimencionaisEx {
    public static void main(String[] args) {
//        Sistema de imposto progressivo
//        double salario = 70000;
//        double imposto = 0;
//        double valorLiquido;
//        if(salario <= 34712){
//            imposto = salario * 0.097;
//        }
//        else if(=salario <= 68507){
//            imposto = salario * 0.3735;
//        }
//        else{
//            imposto = salario * 0.495;
//        }
//        valorLiquido = salario - imposto;
//        System.out.println("Salario inicial: "+salario);
//        System.out.println("Salario final: "+valorLiquido);
//        System.out.println("Imposto: "+imposto);

//        Verificador de ano bissexto
//        boolean ehBissexto = true;
//        int ano = 2035;
//        if(ano % 4 != 0){
//            ehBissexto = false;
//        }
//        if(ano % 100 == 0){
//            if(ano % 400 != 0){
//                ehBissexto = false;
//            }
//        }
//        System.out.println(ehBissexto);

//        Calculadora de parcelas
//        double valorCarro = 30000;
//        double valorParcelas = 30000;
//        double qtdParcelas;
//        for(qtdParcelas = 1; valorParcelas >= 1000 && qtdParcelas <= 12; qtdParcelas++){
//            valorParcelas = valorCarro / qtdParcelas;
//            System.out.println("Qtd de parcelas: "+qtdParcelas);
//            System.out.println("Valor das parcelas: "+valorParcelas);
//        }

//        Soma dos pares até N
//        int n = 14;
//        int soma = 0;
//        for(int i = 0; i <= n; i+=2){
//            soma += i;
//        }
//        System.out.println(soma);

//        Fatorial usando for
//        int num = 5;
//        int fat = 1;
//        for(int i = num; i > 0 ; i--){
//            fat = fat * num;
//        }
//        System.out.println(fat);

//        Tabela customizada
//        int num = 2;
//        int tab = 0;
//        for(int i = 1; tab < 100 && i <= 20; i++){
//            tab = num * i;
//            System.out.println(num+"*"+i+" = "+tab);
//        }

//        Maior e menor valor
//        int[] array = new int[10];
//        int media = 0;
//        for(int i = 0; i < array.length; i++){
//            array[i] = (i * 2) + 3;
//        }
//        int menor = array[0];
//        int maior = array[0];
//        for(int i = 0; i < array.length; i++) {
//            if (array[i] < menor) {
//                menor = array[i];
//            }
//            if (array[i] > maior) {
//                maior = array[i];
//            }
//            media = media + array[i];
//        }
//        media = media / array.length;
//        System.out.println("Menor = "+menor);
//        System.out.println("Maior = "+maior);

//        Inverter array
//        int[] array = new int[8];
//        for(int i=0; i<array.length; i++){
//            array[i]=i;
//        }
//        for(int i=0; i<array.length / 2; i++){
//                int temp = array[i];
//                array[i] = array[array.length - 1 - i];
//                array[array.length - 1 - i] = temp;
//        }
//        for(int i=0; i<array.length; i++){
//            System.out.println(array[i]);
//        }

//        Frequência de número
//        int[] array =  {1, 4, 0, 3, 5, 2, 1, 4, 0, 5, 3, 2, 4, 1, 0, 2, 5, 3, 4, 2};
//        Scanner input = new Scanner(System.in);
//        System.out.println("Digite um numero: ");
//        int numero = input.nextInt();
//        int qtd = 0;
//        for(int i = 0; i < array.length; i++){
//            if(array[i] == numero){
//                qtd++;
//            }
//        }
//        System.out.println(qtd);
//        input.close();

//        Sistema de login simples
//        Usuário tem 3 tentativas para acertar a senha.
//                Se errar 3 vezes → "Conta bloqueada".
//                Se acertar → "Acesso permitido".
//        String senha = "batatinha123";
//        Scanner input = new Scanner(System.in);
//        boolean acertou = false;
//        System.out.println("Sistema de login");
//        System.out.println("São permitidas 3 tentativas de login");
//        System.out.println("-------------------------------------");
//        for(int i = 1; i < 4; i++){
//            System.out.println("Tentativa "+i+" de acertar a senha: ");
//            String tentativa = input.nextLine();
//            if(tentativa.equals(senha)){
//                System.out.println("Acesso Permitido");
//                acertou = true;
//                break;
//            }
//            else{
//                System.out.println("Senha Incorreta");
//            }
//        }
//        if(!acertou){
//            System.out.println("Conta bloqueada");
//        }

//        Crescimento populacional
//        País A: 80000 CRESCE 3% AO ANO
//        País B: 200000 CRESCE 1.5% AO ANO
//        Em quantos anos o país A ultrapassa o B
//        double qtdA = 80000;
//        double qtdB = 200000;
//        int qtdAnos = 0;
//        for(qtdAnos = 0; qtdA < qtdB; qtdAnos++){
//            qtdA = qtdA * 1.03;
//            qtdB = qtdB * 1.015;
//        }
//        System.out.println(qtdAnos+" anos até o país A ultrapassar o país B");

//        Scanner input = new Scanner(System.in);
//        double saldo = 1000;
//        int escolha = 0;
//
//        while(escolha != 4){
//            System.out.println("1 - Ver saldo");
//            System.out.println("2 - Depositar");
//            System.out.println("3 - Sacar");
//            System.out.println("4 - Sair");
//            System.out.println("Digite a escolha: ");
//            escolha = input.nextInt();
//
//            switch(escolha){
//                case 1:
//                    System.out.println("Saldo = " + saldo);
//                    break;
//
//                case 2:
//                    System.out.println("Diga o valor a ser depositado: ");
//                    double deposito = input.nextDouble();
//
//                    if (deposito <= 0) {
//                        System.out.println("Valor inválido para depósito");
//                    } else {
//                        saldo += deposito;
//                        System.out.println("Depósito realizado");
//                    }
//                    break;
//
//                case 3:
//                    System.out.println("Diga o valor do saque: ");
//                    double saque = input.nextDouble();
//
//                    if (saque <= 0) {
//                        System.out.println("Valor inválido para saque");
//                    } else if (saque > saldo) {
//                        System.out.println("Saldo insuficiente");
//                    } else {
//                        saldo -= saque;
//                        System.out.println("Saque realizado");
//                    }
//                    break;
//
//                case 4:
//                    System.out.println("Saindo do programa.");
//                    break;
//
//                default:
//                    System.out.println("Opcao invalida");
//                    break;
//            }
//        }
//        input.close();
    }
}
