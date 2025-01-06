//Special odd Series Sum
/*Given the value of n, we need to find the sum of the series where i-th term is sum of first i odd natural numbers.
NOTE: Sum of the series 1 + (1+3) + (1+3+5) + (1+3+5+7) + …… + (1+3+5+7+…+(2n-1))
Input: n = 5,Output: 55 
Explanation: 1+(1+3)+(1+3+5)+(1+3+5+7)+(1+3+5+7+9) = 55.
              Hence sum of the series is 55. */
import java.util.Scanner;
class Main{
    public static void main(String[] args){
          System.out.println("ENTER N"); 
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int sum=0,seriesTerm=0;
          for(int i=1;i<=2*n-1;i=i+2){
            sum=sum+i;
            seriesTerm=seriesTerm+sum;
          }
          System.out.println(seriesTerm);    
    }
}
