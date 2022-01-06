package laçosDeRepetição;
//Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro.
// Depois modifique o programa para que ele mostre os números um ao lado do outro.
public class imprimirAbaixo {
    public static void main(String[] args) {
        for (int count = 0; count <= 20; count++){
            System.out.println(count);
        }
        System.out.println("Programa modificado: ");
        for (int count2 = 0; count2 <= 20; count2++){
            System.out.print(count2 + ", ");
        }
    }
}
