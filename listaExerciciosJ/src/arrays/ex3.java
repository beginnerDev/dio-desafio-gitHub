package arrays;
import java.util.Arrays;
import java.util.Scanner;
//Faça um Programa que leia um vetor de 10 caracteres, e mostre-os na tela;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         char[] vogOrConso = new char[10];

         for(int i = 0; i < vogOrConso.length; i++){
             System.out.println("letra: ");
            vogOrConso[i] = input.next().charAt(0);
         }

        System.out.println(Arrays.toString(vogOrConso) + " ");
    }
}
