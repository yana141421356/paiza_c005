import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regexp = "^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}$";
        int size = sc.nextInt();
        for( int i = 0 ; i < size ; i++ )
        {
            if ( Pattern.matches(regexp, sc.next()) )
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}
