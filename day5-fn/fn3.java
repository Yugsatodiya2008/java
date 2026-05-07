
public class fn3{
    public static int multiply(int a , int b) {
        int product = a * b;
        return product;
    }
    public static float  divide(float  e , float f) {
        float divide = e/f;
        return divide;
    }
        public static void main(String args[]){
            int a = 5;
            int b = 10;
            int c = multiply(a, b);
            System.out.println(c);
            c = multiply(6, 5);
            System.out.println(c);            
            float d = divide(3,6.5f);
            System.out.println(d);
            
        }
}
