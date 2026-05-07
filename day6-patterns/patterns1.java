
public class patterns1{
    public static void patterns(int totalrows,int totalcols) {


        for (int i = 1; i <= totalrows; i++) {

             
             for (int j = 1; j <= totalcols; j++) {
                
                if (i == 1 || i == totalrows || j == 1 || j == totalcols ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
            }

        }  


        System.out.println("");
    }   
}
        public static void main(String[] args) {
          patterns(4, 5);    
        }
    }
