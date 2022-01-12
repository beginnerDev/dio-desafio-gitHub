package repetição;
import java.util.Scanner;
// faça um programa que calcule o fatorial de um número informado pelo úsuario;
public class ex6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int fatorial;
        int mult = 1;
        int cont;
        System.out.println("informe o fatorial a ser calculado:");
             fatorial = input.nextInt();
        for (cont = fatorial; cont >= 1; cont--){
               mult = mult * cont;

        }
        System.out.println(mult);

    }
}
