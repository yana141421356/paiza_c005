package paiza_d007;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String w ="";
        for( int i = 0 ; i < len ; i++)
        {
            w += "*";
        }
        System.out.println(w);
    }

}
