import java.util.*;

public class Qc {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

    System.out.println("Enter week number");

    int a = sc.nextInt();

    switch (a) {
        
        case 1 -> System.out.println("SUNDAY");

        case 2 -> System.out.println("MONDAY");

        case 3 -> System.out.println("TUESDAY");

        case 4 -> System.out.println("WEDNESDAY");

        case 5 -> System.out.println("THUSDAY");

        case 6 -> System.out.println("FRIDAY");

        case 7 -> System.out.println("SATURDAY");


         default -> System.out.println("Wrong week number");
    }
}
}
    
    
