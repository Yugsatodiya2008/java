import java.util.*;
public class practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int choice;
        int evensum = 0;
        int oddsum = 0;

        do {  System.out.println("ENTER A NUMBER");
        a = sc.nextInt();

        if (a % 2 == 0) {
            evensum += a; // evensum = evensum + a
                    
        } else {
            oddsum += a;  // oddsum = oddsum + a
        }
        System.out.println("DO YOU WANT CONTINUE PRESS a FOR YES AND b FOR NO");

        choice = sc.nextInt();
            
        } while (choice == 1);

         System.out.println("SUM OF EVEN NO. = " + evensum);
         System.out.println("SUM OF ODD NO. = " + oddsum);


    }
}