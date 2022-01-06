package laçosDeRepetição;
import java.util.Scanner;
//Faça um programa que leia e valide as seguintes informações:
//
//    Nome: maior que 3 caracteres;
//    Idade: entre 0 e 150;
//    Salário: maior que zero;
//    Sexo: 'f' ou 'm';
//    Estado Civil: 's', 'c', 'v', 'd';

public class validacaoInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numChar;
        String nome;

        while(true){
            System.out.println("Digite seu nome: ");
            nome = input.next();
            numChar = nome.length();
            if (numChar >= 3){
                 break;
            }else{
                System.out.println("Nome inválido, seu nome tem que ter no mínimo 3 letras!");
            }
        }
        int idade;

        while(true){
            System.out.println("Digite sua idade: ");
            idade = input.nextInt();

            if (idade > 0 && idade < 150){
                break;
            }else{
                System.out.println("idade inválida, tente novamente!");
            }
        }

        int salario;
        System.out.println("digite seu salário: ");
        salario = input.nextInt();
        while(salario < 0){
            System.out.println("salário inválido: ");
            salario = input.nextInt();
        }

        char sexo;
        System.out.println("Digite seu sexo: 'f'- feminino ou 'm' para masculino.");
        sexo = input.next().charAt(0);

        while(sexo != 'f' && sexo != 'm'){
            System.out.println("sexo inválido, tente novamente: ");
            sexo = input.next().charAt(0);
        }
        char estadoCivil;

        System.out.println("digite seu estado civil:");
        System.out.println("'s' para solteiro(a), 'c' para casado(a), 'v' para viúva(o) ou 'd' para divorciado(a).");
        estadoCivil = input.next().charAt(0);

        while(estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd'){
            System.out.println("estado civil inválido, tente novamente:");
            estadoCivil = input.next().charAt(0);

        }
        System.out.println("Usuário cadastrado!");
    }
}
