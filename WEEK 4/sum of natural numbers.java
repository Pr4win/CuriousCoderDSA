//sum of natural numbers
/* Given an integer n, your task is to compute the sum of all natural numbers from 1 to n (inclusive). If n is 0,the sum should be 0.
Input: n = 5,Output: 15 
Explanation: For n = 5, sum will be 15. 1+2+3+4+5=15.   */
import java.util.Scanner;
class Main{
    public static void main(String[] args){
          System.out.println("ENTER N"); 
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int sum=0;
          for(int i=0;i<=n;i++){
            sum=sum+i;
          }
          System.out.println(sum);    
    }
}
