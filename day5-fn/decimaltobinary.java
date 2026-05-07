public class decimaltobinary{
    public static void decimaltobinary(int n) {
        int mynumber = n;
        int pow = 0;
        int binary = 0;

        while ( n > 0) { 
            int rem = n%2;     //lastdigit
         binary = binary + (rem * (int)Math.pow(10,pow));
         pow++;
         n=n/2;
        }        
        System.out.println("BINARY FORM OF " +mynumber+"="+binary );
    }    
    public static void main(String[] args) {
         decimaltobinary(10);
        
    }
} 