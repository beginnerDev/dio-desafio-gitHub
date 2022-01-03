package repetição;
import java.util.Scanner;

// faça um programa com N números inteiros e
// informe a quantidade de numeros impares e pares;
public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int qtdNumeros;
        int count = 0;
        int numeros;
        int qtdPares = 0, qtdImpares = 0;

        System.out.println("quantos números?");
        qtdNumeros = input.nextInt();

        do {
            System.out.println("informe os números:");
            numeros = input.nextInt();

            if (numeros % 2 == 0){
                qtdPares++;
            }else{
                qtdImpares++;
            }
            count++;
        }while(count < qtdNumeros);
        System.out.println("números pares: " + qtdPares);
        System.out.println("números impares: " + qtdImpares);

    }
}
