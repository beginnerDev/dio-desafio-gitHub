package laçosDeRepetição;
import java.util.Scanner;
//Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso
// o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
public class nota {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int nota;


        while (true){
            System.out.println("Digite sua nota: ");
            nota = input.nextInt();

            if (nota >= 0 && nota <= 10){
                break;
            }else{
                System.out.println("nota inválida, informe um valor válido");
            }

        }
    }
}
