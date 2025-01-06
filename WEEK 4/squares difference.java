// squares diffence
/* Given an integer N, find the absolute difference between sum of the squares of first N natural numbers and square of sum of first N natural numbers.
Input: n = 3,Output: 22
Explanation: |(1^2 + 2^2 + 3^2) - (1 + 2 + 3)^2| = 22.   */
import java.util.Scanner;
class Main{
    public static void main(String[] args){
          System.out.println("ENTER N"); 
          Scanner sc = new Scanner(System.in);
          long n = sc.nextInt();
          long sum=0;
          for(long i=1;i<=n;i++){
            sum=sum+i*i;
          }
          long gum=0;
          for(long j=1;j<=n;j++){
            gum=gum+j;
          }
          long ans=gum*gum;
          System.out.println(ans-sum);    
    }
}
