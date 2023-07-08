import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        int k;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz :");
        k = inp.nextInt();

        for (int i = 1; i<=k; i*=4 ) {
            System.out.println(i);



        }for (int i = 1; i<=k; i*=5){
            System.out.println(i);
        }


    }
}