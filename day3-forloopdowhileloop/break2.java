import java.util.*;
    public class break2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        do { 
            System.out.print("ENTER YOUR NUMBER");
            int a = sc.nextInt();
            
            if (a % 10 == 0) {
                break;
            }                
        System.out.println(a);
        } while (true);
        
        }

    }    
