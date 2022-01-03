package repetição;
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        int i;
        int tabuada;
        Scanner input = new Scanner(System.in);


        System.out.println("qual tabuada você quer?");
        tabuada = input.nextInt();
        for (i = 0; i <= 10; i++){
            System.out.println(tabuada + "x" + i + "=" + (tabuada*i));
        }
    }
}
