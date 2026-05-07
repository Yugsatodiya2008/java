public class prime {

    public static boolean isprime(int a){

        if (a == 2) {
            return true;
        }
      /*  for (int i = 2; i <= a-1; i++) {
            if (a % i == 0) {
                return false;
                
            }            
        }
        return true;
}   */  
// OPTIMISATION for fast calc.(n-1 -> square root of n)  

        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;                
            }            
        }
        return true;
} 
    public static void primerange(int a) {
        for (int i = 2; i <= a-1; i++) {
            if (isprime(i)) {
           System.out.print(i+",");                
            }
        } 
        
    }
    public static void main(String[] args) {
        primerange(15);
        
    }
}