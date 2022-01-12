package repetição;
import java.util.Scanner;

// faça um programa que peça uma nota, entre 0 e 10,
// mostre uma mensagem caso o valor seja inválido
// e continue pedindo até que informe um valor válido;
public class ex2 {
    public static void main(String[] args) {
        int nota;
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("digite sua nota: ");
            nota = input.nextInt();
            if (nota >=0 && nota <= 10){
                break;
            }else{
                System.out.println("digite um valor válido! ");
            }
        }
    }
}
