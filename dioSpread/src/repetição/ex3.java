package repetição;
import java.util.Scanner;
// faça um programa que leia 5 valores,
// informe o maior entre eles e cálcule a média;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        int soma = 0;
        int maior = 0;
        int count = 0;

        do {
            System.out.println("informe um número: ");
            numero = input.nextInt();
            if (numero > maior){
                maior = numero;
            }
            soma = soma + numero;
            count = count + 1;
        }while(count < 5);
        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5));
    }
}
