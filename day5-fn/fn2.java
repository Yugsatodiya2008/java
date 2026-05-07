
import java.util.Scanner;

 public class fn2{
    public static int sum(int num1,int num2){ //parameters or formal parameters
        int add = num1+num2; 
        return add;
    }
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int add = sum(a,b); // arguments or actual parameters 
        System.out.println("sum is " + add);
    } 
    }
            
 
 
 