//Sum of first n^3 terms.
/* Given an integer n, calculate the sum of series 1^3 + 2^3 + 3^3 + 4^3 + … till n-th term.
Input: n = 5,Output: 225
Explanation: 1^3 + 2^3 + 3^3 + 4^3 + 5^3 = 225   */
import java.util.Scanner;
class Main{
    public static void main(String[] args){
          System.out.println("ENTER N"); 
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int sum=0;
          for(int i=1;i<=n;i++){
            sum=sum+i*i*i;
          }
          System.out.println(sum);    
    }
}
