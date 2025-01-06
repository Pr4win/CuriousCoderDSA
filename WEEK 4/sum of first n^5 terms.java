//Sum of fifth powers of the first n natural numbers.
/* Given a number N.Find the sum of fifth powers of natural numbers till N  i.e.1^5 + 2^5 + 3^5 + ... + N^5.
Input: n = 3,Output: 276
Explanation: 1^5 + 2^5 + 3^5 = 1+32+243=276.   */
import java.util.Scanner;
class Main{
    public static void main(String[] args){
          System.out.println("ENTER N"); 
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int sum=0;
          for(int i=1; i<=n; i++){
          int power=(int)Math.pow(i,5);
          sum=sum+power;
          }
          System.out.println(sum);    
    }
}
