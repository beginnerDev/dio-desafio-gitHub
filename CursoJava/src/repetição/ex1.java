package repetição;
import java.util.Scanner;

//faça um programa que leia um conjunto de dois valores,
// nome e idade de um aluno,
//(pare o programa inserindo o valor "0" no campo nome);
public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.println("nome: ");
            nome = input.next();
            if(nome.equals("0"))break;
            System.out.println("idade: ");
            idade = input.nextInt();
        }
    }
}
