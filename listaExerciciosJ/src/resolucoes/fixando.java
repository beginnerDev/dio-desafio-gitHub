package resolucoes;
import java.sql.SQLOutput;
import java.util.Scanner;

public class fixando {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcaoSelecionada;

        System.out.println("qual exercício executar primeiro:");
        opcaoSelecionada = input.nextInt();
        if(opcaoSelecionada == 0){
            System.exit(0);
        }else if(opcaoSelecionada == 1){
            maior();

        }else if (opcaoSelecionada == 2){
            positiveOrNegative();
        }else if(opcaoSelecionada == 3){
            sexo();
        }else if(opcaoSelecionada == 4){
            vogOrConso();
        }else if(opcaoSelecionada == 5){
            aprovOuReprove();
        }
    }

    private static void maior(){

        //1º Faça um Programa que peça dois números e imprima o maior deles.

        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.println("digite dois números:");
        num1 = input.nextInt();
        num2 = input.nextInt();

        if(num1 > num2){
            System.out.println("o maior entre os dois é: " + num1);
        }else if(num2 > num1){
            System.out.println("o maior entre os dois é: " + num2);
        }
        input.close();
    }

    private static void positiveOrNegative(){
        // 2º Faça um Programa que peça dois valores e mostre
        // na tela se os valores é positivo ou negativo.

        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.println("digite dois números: ");
        num1 = input.nextInt();
        num2 = input.nextInt();

        if (num1 > 0 && num2 > 0){
            System.out.println("Os dois números são positivos: " + num1 + "e " + num2);
        }else if(num1 < 0 && num2 < 0){
            System.out.println("Os dois números são negativos: " + num1 + "e " + num2);
        }else if(num1 < 0 && num2 >0){
            System.out.println(num1 + " é negativo e " + num2 + " é positivo.");
        }else if(num1 > 0 && num2 < 0 ){
            System.out.println(num1 + "é positivo e " + num2 + " é negativo.");
        }
    }
    private static void sexo(){
        //3ºFaça um Programa que verifique se uma letra digitada é "F" ou "M".
        // Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
        Scanner input = new Scanner(System.in);

        char Sexo;

        System.out.println("Digite seu sexo, F - Feminino, M - Masculino:");
        Sexo = input.next().charAt(0);

        if(Sexo == 'F'){
            System.out.println("Sexo: F - Feminino");
        }else if (Sexo == 'M'){
            System.out.println("Sexo: M - Masculino");
        }else if (Sexo != 'F' && Sexo != 'M'){
            System.out.println("sexo inválido");
        }

    }


    private static void vogOrConso(){

        //4º Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

        Scanner input = new Scanner(System.in);
        char letra;
        System.out.println("Digite uma letra: ");
        letra = input.next().charAt(0);

        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E'){
            System.out.println("esta letra é uma vogal: " + letra);
        }else{
            System.out.println("esta letra é uma consoante: " + letra);
        }
    }

    private static void aprovOuReprove(){
        Scanner input = new Scanner(System.in);

        double n1, n2, media;

        System.out.println("Digite as duas notas do aluno: ");
        n1 = input.nextDouble();
        n2 = input.nextDouble();

        System.out.println("-------------------------------");
        media = (n1 + n2) /2;
        System.out.println("n1: " + n1 + "  n2: " + n2);
        System.out.println("-------------------------------");

        if (media <= 7){
            System.out.println("você foi reprovado! Média:  5" + media);
        }else if (media >= 7 && media <= 9){
            System.out.println("você foi aprovado! Média:  " + media);
        }else if (media == 10){
            System.out.println("você foi aprovado com distinção! Média: " + media);
        }
    }
}
