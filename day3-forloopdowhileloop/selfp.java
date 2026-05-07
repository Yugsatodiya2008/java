import java.util.*;
public class selfp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.println("ENTER A NUMBER");
        int a = sc.nextInt();
            if (a%10 == 0) {
            continue;
        }
        System.out.println("NUMBER WAS- " + a);
            
        } while (true);
    }
}