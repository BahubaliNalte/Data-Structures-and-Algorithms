public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.err.print(j);
            }
            System.err.println();
        }
    }
}

OUTPUT:
1
12   
123  
1234 
12345
