public class fun{
    public static int factorial(int a){
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f = f * i;
        }
            return f;            
    }
    public static int bico(int n , int r) {
        int fn = factorial(n);
        int fr = factorial(r);
        int fnmr = factorial(n-r); 
        int bico =  fn/(fr*fnmr);
        return bico;
    }
    public static void main(String[] args) {
        System.out.println(bico(5,4));
              
    }
}