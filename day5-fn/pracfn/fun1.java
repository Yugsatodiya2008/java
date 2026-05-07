import java.util.*;
public class fun1{
    public static int avg (int a , int b , int c) {
    int y = (a+b+c)/3;
    System.out.println("Avg is = "+ y);
        return y;
}

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER  A");
        int a = sc.nextInt();
        System.out.println("ENTER  B");
        int b = sc.nextInt();
        System.out.println("ENTER  C");
        int c = sc.nextInt();
   avg(a, b, c);
}
}