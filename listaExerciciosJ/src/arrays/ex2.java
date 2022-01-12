package arrays;
//Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.
public class ex2 {
    public static void main(String[] args) {
        double[] vetor = new double[]{12,34,5,5.2,624,4,65,54.13,32,};
        int count = 0;
        while(count < (vetor.length)){
            System.out.println(vetor[count]);
            count++;
        }
        System.out.println("ordem inversa: ");
        for (int i =  (vetor.length - 1); i >= 0; i--){
                System.out.println(vetor[i]);
        }


    }

}
