public class Pattern4 {
    public static void main(String[] args) {
        int n = 5;

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.err.print(i);
            }
            System.err.println();
        }
    }
}

OUTPUT:
1
22
333
4444
55555
