public class Pattern9 {
    public static void main(String[] args) {
        int n=5;

        for (int i=0; i<n; i++){
            for (int j=0; j<n-i-1; j++){
                System.err.print(" ");
            }
            for (int j=0; j<2*i+1; j++){
                System.err.print("*");
            }
            for (int j=0; j<n-i-1; j++){
                System.err.print(" ");
            }
            System.err.println();
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<i; j++){
                System.err.print(" ");
            }
            for (int j=0; j<2*n-(2*i+1); j++){
                System.err.print("*");
            }
            for (int j=0; j<i; j++){
                System.err.print(" ");
            }
            System.err.println();
        }
    }
}

OUTPUT:
    *    
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *    
