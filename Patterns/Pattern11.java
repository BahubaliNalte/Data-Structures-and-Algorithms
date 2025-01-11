public class Patten11 {
    public static void main(String[] args) {
        int n=5;
        int start = 1;
        for (int i=0; i<=n; i++){
            if(i%2==0) {
                start=0;
            } else {
                start=1;
            }
            for (int j=0; j<i; j++){
                System.err.print(start);
                start = 1-start;
            }
            System.err.println();
        }
    }
}

OUTPUT:
1
01
101
0101
10101
