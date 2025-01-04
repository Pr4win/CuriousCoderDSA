//Given an integer N, you need to print the following pattern
//Input: 5
/*Output: 12345
          22345
          33345
          44445
          55555 */
class Main {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            for(int j=i+1; j<=n; j++){
                System.out.print(j);
            }
        System.out.println("");
        }
    }
}
