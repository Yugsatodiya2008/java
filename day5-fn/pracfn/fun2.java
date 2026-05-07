import java.util.*;

public class fun2{
    
    public static int isEven(int a) {
        if (a % 2 == 0) {
          System.out.println("true");
        } else {
            System.out.println("false");
        }
        return a;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int a = sc.nextInt();

        isEven(a);
    }
}