import java.util.*;
public class printreverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int a = sc.nextInt();
        while (a>0 ) { 
            int lastdigit = a % 10;
            System.out.print(lastdigit);
            a = a / 10; // or a /= 10
           
        }
    }
}