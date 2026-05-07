public class binarytodecimal{
    public static void bitode(int binno){
        int pow = 0;
        int decimal = 0;
        int mynumber = binno;
        while (binno > 0) {
            int lastdigit = binno%10;
            decimal = decimal + (lastdigit*(int)Math.pow(2,pow));
            pow++;
            binno = binno/10;
        }
            System.out.println("decimal of "+mynumber+" = " + decimal);            

    }
    public static void main(String[] args) {
        bitode(1010);
        
    }
}