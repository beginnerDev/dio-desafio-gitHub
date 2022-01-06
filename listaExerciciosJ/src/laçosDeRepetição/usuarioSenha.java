package laçosDeRepetição;

import java.util.Scanner;

// Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
// mostrando uma mensagem de erro e voltando a pedir as informações.
public class usuarioSenha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String usuario, senha;

        while (true) {
            System.out.println("Digite seu nome de usuário: ");
            usuario = input.next();
            System.out.println("agora informe sua senha: ");
            senha = input.next();
            if (usuario.equals(senha)){
                System.out.println("usuário e senha iguais! Tente novamente...");
            }else{
                break;
            }
        }
    }
}
