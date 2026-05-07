import java.util.*;
public class fun3{
    public static int ispalindrome(int n) {
        while (n > 0) {
             int lastdigit = n % 10;
             rev = (rev*10) + lastdigit;
             n = n/10;           
        }          
             System.out.print(rev);
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER TO CHECK IF IT IS PALINDROME");
        int n = sc.nextInt();
        int rev = 0;

            if (n == rev) {
                System.out.println("----PALINDROME");
            } else {
                System.out.println("----NOT A PALINDROME");
            }
    }
}
