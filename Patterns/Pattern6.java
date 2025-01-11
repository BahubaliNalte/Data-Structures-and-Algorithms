public class Pattern6 {
    public static void main(String[] args) {
        int n = 5;

        for (int i=0; i<n; i++){
            for (int j=1; j<=n-i; j++){
                System.err.print(j);
            }
            System.err.println();
        }
    }
}

OUTPUT:
12345
1234
123
12
1
